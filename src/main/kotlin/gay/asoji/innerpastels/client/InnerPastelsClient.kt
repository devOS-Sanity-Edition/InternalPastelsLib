package gay.asoji.innerpastels.client

import com.mojang.blaze3d.platform.InputConstants
import gay.asoji.innerpastels.InnerPastels
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.implGl3
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.implGlfw
import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.endFrame
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.imGui
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.windowHandle
import gay.asoji.innerpastels.events.InputAction
import gay.asoji.innerpastels.events.KeyInputEvent
import gay.asoji.innerpastels.events.MouseInputEvent
import gay.asoji.innerpastels.events.MouseScrollInputEvent
import imgui.ImGui
import imgui.type.ImBoolean
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.client.KeyMapping
import net.minecraft.client.Minecraft
import org.lwjgl.glfw.GLFW
import java.util.*

class InnerPastelsClient : ClientModInitializer {
    private var isImGuiRenderEnabled: Boolean = false

    val DEVELOPER_UI_BINDING = KeyMapping(
        "key.innerpastels.developerui",
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_M,
        "category.innerpastels.developer")

    fun initializeDevKeybinds() {
        val toggleUIKeybind = KeyBindingHelper.registerKeyBinding(DEVELOPER_UI_BINDING)

        ClientTickEvents.END_CLIENT_TICK.register(::onTickDeveloperScreen)
    }

    fun onTickDeveloperScreen(client: Minecraft) {
        while (DEVELOPER_UI_BINDING.consumeClick()) {
            if (client.player != null && client.screen == null) {
                isImGuiRenderEnabled = !isImGuiRenderEnabled

                implGl3.dispose()
                implGlfw.dispose()
            }
        }
    }

    override fun onInitializeClient() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment) {
            // THIS IS PROBABLY NOT CORRECT, IF IT ISNT, FUCKING REMOVE IT LATER, ALL CONTEXT CREATION SHOULD PROBABLY BE FUCKING LEFT TO THE IMPL [OR THE PANEL ITSELF]?
            ImGui.createContext()
            initializeDevKeybinds()
        }

        HudRenderCallback.EVENT.register { gui, tickDelta ->
            if (!isImGuiRenderEnabled) {
                return@register
            }
            implGlfw.newFrame()
            ImGui.newFrame()

            panels.forEach {
                it.render(ImBoolean())
            }

            implGl3.renderDrawData(ImGui.getDrawData())
            ImGui.render()
            endFrame(windowHandle)
        }

        KeyInputEvent.EVENT.register { key, scancode, action, mods ->
            when (action) {
                InputAction.PRESS -> InnerPastelsImGuiImpl.keyPressed(key, scancode, mods)
                InputAction.RELEASE -> InnerPastelsImGuiImpl.keyReleased(key, scancode, mods)
            }
        }

        MouseInputEvent.EVENT.register { button, action, mods ->
            val mouseX = Minecraft.getInstance().mouseHandler.xpos()
            val mouseY = Minecraft.getInstance().mouseHandler.ypos()
            when (action) {
                InputAction.PRESS -> InnerPastelsImGuiImpl.mouseClicked(mouseX, mouseY, button)
                InputAction.RELEASE -> InnerPastelsImGuiImpl.mouseReleased(mouseX, mouseY, button)
            }
        }

        MouseScrollInputEvent.EVENT.register{ xOffset, yOffset ->
            val mouseX = Minecraft.getInstance().mouseHandler.xpos()
            val mouseY = Minecraft.getInstance().mouseHandler.ypos()
            InnerPastelsImGuiImpl.mouseScrolled(mouseX, mouseY, xOffset, yOffset)
        }
    }

    companion object {
        val panels = mutableListOf<ImGuiPanel>()
    }
}