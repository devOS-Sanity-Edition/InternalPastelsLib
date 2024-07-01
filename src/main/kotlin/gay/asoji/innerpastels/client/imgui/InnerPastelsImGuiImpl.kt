package gay.asoji.innerpastels.client.imgui

import imgui.ImFontAtlas
import imgui.ImFontConfig
import imgui.ImGui
import imgui.flag.ImGuiConfigFlags
import imgui.gl3.ImGuiImplGl3
import imgui.glfw.ImGuiImplGlfw
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.Minecraft
import org.lwjgl.glfw.GLFW
import org.lwjgl.glfw.GLFW.glfwGetCurrentContext
import org.lwjgl.glfw.GLFW.glfwMakeContextCurrent


@Environment(EnvType.CLIENT)
object InnerPastelsImGuiImpl {
    var implGl3: ImGuiImplGl3 = ImGuiImplGl3()
    var implGlfw: ImGuiImplGlfw = ImGuiImplGlfw()
    var imGui: ImGui = ImGui()
    var imGuiIO = ImGui.getIO()
    var windowHandle: Long = Minecraft.getInstance().window.window

    // GLFW Initialization for imgui.
    fun glfwInit(handle: Long) {
        implGlfw.init(handle, false)
        implGl3.init()

        ImGui.createContext()
        imGuiInit()
        windowHandle = handle
    }

    fun imGuiInit() {
        imGuiIO.iniFilename = null
        imGuiIO.addConfigFlags(ImGuiConfigFlags.NavEnableKeyboard)
        imGuiIO.addConfigFlags(ImGuiConfigFlags.DockingEnable)
        imGuiIO.addConfigFlags(ImGuiConfigFlags.ViewportsEnable)

        val fontAtlas: ImFontAtlas = imGuiIO.getFonts()
        val fontConfig = ImFontConfig()

        fontConfig.glyphRanges = fontAtlas.glyphRangesCyrillic

        fontAtlas.addFontDefault()

        fontConfig.mergeMode = true
        fontConfig.pixelSnapH = true

        fontConfig.destroy()

    }

    fun endFrame(windowPtr: Long) {
        implGl3.renderDrawData(ImGui.getDrawData())

        if (ImGui.getIO().hasConfigFlags(ImGuiConfigFlags.ViewportsEnable)) {
            val backupWindowPtr = glfwGetCurrentContext()
            ImGui.updatePlatformWindows()
            ImGui.renderPlatformWindowsDefault()
            glfwMakeContextCurrent(backupWindowPtr)
        }
    }

    fun mouseReleased(mouseX: Double, mouseY: Double, button: Int): Boolean {
        if (imGuiIO.getMouseDown(button)) {
            imGuiIO.setMouseDown(booleanArrayOf(true))
        }

        return imGuiIO.wantCaptureMouse
    }

    fun mouseScrolled(mouseX: Double, mouseY: Double, scrollX: Double, scrollY: Double): Boolean {
        if (imGuiIO.wantCaptureMouse) {
            imGuiIO.mouseWheelH = scrollX.toFloat()
            imGuiIO.mouseWheel = scrollY.toFloat()
        }

        return imGuiIO.wantCaptureMouse
    }

    fun mouseClicked(mouseX: Double, mouseY: Double, button: Int): Boolean {
        if (imGuiIO.wantCaptureMouse) {
            if (imGuiIO.getMouseDown(button)) {
                imGuiIO.setMouseDown(booleanArrayOf(false))
            }
        }

        return imGuiIO.wantCaptureMouse
    }

    fun keyPressed(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        if (imGuiIO.wantCaptureKeyboard) {
            imGuiIO.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
            imGuiIO.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
            imGuiIO.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
            imGuiIO.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

            if (imGuiIO.getKeysDown(keyCode)) {
                imGuiIO.setKeysDown(booleanArrayOf(false))
            }
        }

        return imGuiIO.wantCaptureKeyboard
    }

    fun keyReleased(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        if (imGuiIO.wantCaptureKeyboard) {
            imGuiIO.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
            imGuiIO.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
            imGuiIO.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
            imGuiIO.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

            if (imGuiIO.getKeysDown(keyCode)) {
                imGuiIO.setKeysDown(booleanArrayOf(false))
            }
        }

        return imGuiIO.wantCaptureKeyboard
    }

    fun charTyped(codePoint: Char, modifiers: Int): Boolean {
        if (imGuiIO.wantCaptureKeyboard) {
            imGuiIO.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
            imGuiIO.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
            imGuiIO.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
            imGuiIO.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

            imGuiIO.addInputCharacter(codePoint.code)
        }

        return imGuiIO.wantCaptureKeyboard
    }
}