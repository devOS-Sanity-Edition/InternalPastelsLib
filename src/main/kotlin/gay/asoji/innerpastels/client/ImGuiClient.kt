package gay.asoji.innerpastels.client

import com.mojang.blaze3d.platform.InputConstants
import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.endFrame
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.initialize
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl.startFrame
import gay.asoji.innerpastels.client.imgui.TestDockSpace
import gay.asoji.innerpastels.client.imgui.TestPanel
import gay.asoji.innerpastels.events.InputAction
import gay.asoji.innerpastels.events.KeyInputEvent
import gay.asoji.innerpastels.events.MouseInputEvent
import gay.asoji.innerpastels.events.MouseScrollInputEvent
import imgui.ImGui
import imgui.type.ImBoolean
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.minecraft.client.KeyMapping
import net.minecraft.client.Minecraft
import org.lwjgl.glfw.GLFW

object ImGuiClient {
    var isImGuiRenderEnabled: Boolean = false
        private set

    val DEVELOPER_UI_BINDING = KeyMapping(
        "key.innerpastels.developerui",
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_M,
        "category.innerpastels.developer"
    )

    fun initializeDevKeybinds() {
        val toggleUIKeybind = KeyBindingHelper.registerKeyBinding(DEVELOPER_UI_BINDING)

        ClientTickEvents.END_CLIENT_TICK.register(::onTickDeveloperScreen)
    }

    fun onTickDeveloperScreen(client: Minecraft) {
        while (DEVELOPER_UI_BINDING.consumeClick()) {
            if (client.player != null && client.screen == null) {
                isImGuiRenderEnabled = !isImGuiRenderEnabled
            }
        }
    }

    fun init() {
        if (System.getProperty("EEZNUTSFUCKER")?.toBoolean() == true) {
            panels.addAll( // testing stuff
                listOf(
                    object : ImGuiPanel {
                        override fun theme() {

                        }

                        override fun render(open_: ImBoolean) {
                            ImGui.showDemoWindow()
                        }
                    },
                    TestDockSpace, TestPanel
                )
            )
        }

        initializeDevKeybinds()

        KeyInputEvent.EVENT.register { key, action, mods, scanCode ->
            when (action ?: return@register) {
                InputAction.PRESS -> InnerPastelsImGuiImpl.setKeyState(key, mods, scanCode, true)
                InputAction.RELEASE -> InnerPastelsImGuiImpl.setKeyState(key, mods, scanCode, false)
            }
        }

        MouseInputEvent.EVENT.register { button, action, mods ->
            val mouseX = Minecraft.getInstance().mouseHandler.xpos()
            val mouseY = Minecraft.getInstance().mouseHandler.ypos()
            when (action ?: return@register) {
                InputAction.PRESS -> InnerPastelsImGuiImpl.mouseClick(mouseX, mouseY, button, mods)
                InputAction.RELEASE -> InnerPastelsImGuiImpl.mouseRelease(mouseX, mouseY, button, mods)
            }
        }

        MouseScrollInputEvent.EVENT.register { xOffset, yOffset ->
            InnerPastelsImGuiImpl.mouseScroll(xOffset, yOffset)
        }
    }

    val panels = mutableListOf<ImGuiPanel>()
}