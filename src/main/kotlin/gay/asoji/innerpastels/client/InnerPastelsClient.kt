package gay.asoji.innerpastels.client

import com.mojang.blaze3d.platform.InputConstants
import gay.asoji.innerpastels.client.screens.imgui.ImGuiPanel
import gay.asoji.innerpastels.client.screens.imgui.ImGuiScreen
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.client.KeyMapping
import net.minecraft.client.Minecraft
import org.lwjgl.glfw.GLFW

class InnerPastelsClient : ClientModInitializer {
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
                client.setScreen(ImGuiScreen())
            }
        }
    }

    override fun onInitializeClient() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment) {
            initializeDevKeybinds()
        }
    }

    companion object {
        val panels = mutableListOf<ImGuiPanel>()
    }
}