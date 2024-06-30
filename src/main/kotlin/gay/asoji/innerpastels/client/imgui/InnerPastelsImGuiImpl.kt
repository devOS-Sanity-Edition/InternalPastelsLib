package gay.asoji.innerpastels.client.imgui

import gln.cap.Caps
import imgui.ImGui
import imgui.MINECRAFT_BEHAVIORS
import imgui.MouseButton
import imgui.classes.Context
import imgui.impl.gl.ImplGL3
import imgui.impl.glfw.ImplGlfw
import imgui.impl.glfw.ImplGlfw.Companion.imguiKey
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.Minecraft
import org.lwjgl.glfw.GLFW
import uno.gl.GlWindow
import uno.glfw.GlfwWindow


@Environment(EnvType.CLIENT)
object InnerPastelsImGuiImpl {
    val imgui = ImGui
    var implGl3: ImplGL3
    var implGlfw: ImplGlfw

    // Initialization for imgui.
    init {
        MINECRAFT_BEHAVIORS = true

        val glfwWindow = GlfwWindow(Minecraft.getInstance().window.window)
        val window = GlWindow(glfwWindow, Caps.Profile.CORE, true)

        window.makeCurrent(true)
        Context().setCurrent()

        implGlfw = ImplGlfw(window, false, null)
        implGl3 = ImplGL3()
    }

    fun mouseReleased(mouseX: Double, mouseY: Double, button: Int): Boolean {
        if (imgui.io.wantCaptureMouse) {
            imgui.io.addMouseButtonEvent(MouseButton.of(button), false)
        }

        return imgui.io.wantCaptureMouse
    }

    fun mouseScrolled(mouseX: Double, mouseY: Double, scrollX: Double, scrollY: Double): Boolean {
        if (imgui.io.wantCaptureMouse) {
            imgui.io.mouseWheelH = scrollX.toFloat()
            imgui.io.mouseWheel = scrollY.toFloat()
        }

        return imgui.io.wantCaptureMouse
    }

    fun mouseClicked(mouseX: Double, mouseY: Double, button: Int): Boolean {
        if (imgui.io.wantCaptureMouse) {
            imgui.io.addMouseButtonEvent(MouseButton.of(button), true)
        }

        return imgui.io.wantCaptureMouse
    }

    fun keyPressed(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        if (imgui.io.wantCaptureKeyboard) {
            val key = uno.glfw.Key.of(keyCode).imguiKey

            imgui.io.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
            imgui.io.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
            imgui.io.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
            imgui.io.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

            imgui.io.addKeyEvent(key, true)
            imgui.io.keysData[key.index].down = true
            imgui.io.setKeyEventNativeData(key, key.i, scanCode)
        }

        return imgui.io.wantCaptureKeyboard
    }

    fun keyReleased(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        if (imgui.io.wantCaptureKeyboard) {
            val key = uno.glfw.Key.of(keyCode).imguiKey

            imgui.io.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
            imgui.io.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
            imgui.io.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
            imgui.io.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

            imgui.io.addKeyEvent(key, false)
            imgui.io.keysData[key.index].down = false
            imgui.io.setKeyEventNativeData(key, key.i, scanCode)
        }

        return imgui.io.wantCaptureKeyboard
    }

    fun charTyped(codePoint: Char, modifiers: Int): Boolean {
        if (imgui.io.wantCaptureKeyboard) {
            imgui.io.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
            imgui.io.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
            imgui.io.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
            imgui.io.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

            imgui.io.addInputCharacter(codePoint)
        }

        return imgui.io.wantCaptureKeyboard
    }
}