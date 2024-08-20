package gay.asoji.innerpastels.client.imgui

import imgui.ImFontConfig
import imgui.ImFontGlyphRangesBuilder
import imgui.ImGui
import imgui.ImGuiIO
import imgui.flag.*
import imgui.gl3.ImGuiImplGl3
import imgui.glfw.ImGuiImplGlfw
import imgui.internal.ImGuiContext
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.Minecraft
import org.lwjgl.glfw.GLFW


@Environment(EnvType.CLIENT)
object InnerPastelsImGuiImpl {
    var isInitialized = false
        private set

    lateinit var imguiContext: ImGuiContext
        private set

    lateinit var imguiGl3: ImGuiImplGl3
        private set

    lateinit var imguiGlfw: ImGuiImplGlfw
        private set

    val isMouseHidden: Boolean
        get() = isInitialized && ImGui.getIO().wantCaptureMouse

    fun initialize(handle: Long) {
        if (isInitialized) {
            return
        }

        imguiGlfw = ImGuiImplGlfw()
        imguiGl3 = ImGuiImplGl3()

        imGuiInitialize()
        imguiGlfw.init(handle, false)
        imguiGl3.init()

        isInitialized = true
    }

    fun mouseFocus() {
        if (!isInitialized) {
            return
        }

        ImGui.setWindowFocus(null)
    }

    fun mouseMove(mouseX: Double, mouseY: Double) {
        if (!isInitialized) {
            return
        }

        imguiGlfw.cursorPosCallback(Minecraft.getInstance().window.window, mouseX, mouseY)
    }

    fun mouseClick(mouseX: Double, mouseY: Double, button: Int, mods: Int): Boolean {
        if (!isInitialized) {
            return false
        }

        return if (ImGui.getIO().wantCaptureMouse) {
            updateKeyMods(mods)
            ImGui.getIO().addMouseButtonEvent(button, true)
            false
        } else {
            true
        }
    }

    fun mouseRelease(mouseX: Double, mouseY: Double, button: Int, mods: Int): Boolean {
        if (!isInitialized) {
            return false
        }

        return if (ImGui.getIO().wantCaptureMouse) {
            updateKeyMods(mods)
            ImGui.getIO().addMouseButtonEvent(button, false)
            true
        } else {
            false
        }
    }

    fun mouseScroll(xOff: Double, yOff: Double): Boolean {
        if (!isInitialized) {
            return false
        }

        return if (ImGui.getIO().wantCaptureMouse) {
            ImGui.getIO().addMouseWheelEvent(xOff.toFloat(), yOff.toFloat())
            true
        } else {
            false
        }
    }

    fun setKeyState(keyCode: Int, mods: Int, scanCode: Int, isDown: Boolean): Boolean {
        if (!isInitialized) {
            return false
        }

        return if (ImGui.getIO().wantCaptureKeyboard) {
            imguiGlfw.keyCallback(Minecraft.getInstance().window.window, keyCode, scanCode, if (isDown) GLFW.GLFW_PRESS else GLFW.GLFW_RELEASE, mods)
            true
        } else {
            false
        }
    }

    fun destroy() {
        if (!isInitialized) {
            return
        }

        imguiGl3.shutdown()
        imguiGlfw.shutdown()
        ImGui.destroyContext(imguiContext)
    }

    fun startFrame() {
        imguiGlfw.newFrame()
        imguiGl3.newFrame() // the best line
        ImGui.newFrame()
    }

    fun endFrame() {
        ImGui.render()
        imguiGl3.renderDrawData(ImGui.getDrawData())

        if (ImGui.getIO().hasConfigFlags(ImGuiConfigFlags.ViewportsEnable)) {
            val backupHandle = GLFW.glfwGetCurrentContext();
            ImGui.updatePlatformWindows();
            ImGui.renderPlatformWindowsDefault();
            GLFW.glfwMakeContextCurrent(backupHandle);
        }
    }

    private fun imGuiInitialize() {
        imguiContext = ImGui.createContext()

        val io = ImGui.getIO()
        io.iniFilename = null
        io.configViewportsNoTaskBarIcon = true;
        io.addConfigFlags(ImGuiConfigFlags.NavEnableKeyboard)
        io.addConfigFlags(ImGuiConfigFlags.DockingEnable)
        io.addConfigFlags(ImGuiConfigFlags.ViewportsEnable)
        io.addConfigFlags(ImGuiDockNodeFlags.None)
        io.addConfigFlags(ImGuiWindowFlags.MenuBar)
        io.configViewportsNoTaskBarIcon = true

        imGuiFontsInitialization(io)

        io.fonts.build()

        if (io.hasConfigFlags(ImGuiConfigFlags.ViewportsEnable)) {
            val style = ImGui.getStyle()
            style.windowRounding = 0.0f
            style.setColor(ImGuiCol.WindowBg, ImGui.getColorU32(ImGuiCol.WindowBg, 1f))
        }
    }

    private fun imGuiFontsInitialization(io: ImGuiIO) { // why do fonts always come to bite me in the ass in one way or another i dont like you
        io.fonts.setFreeTypeRenderer(true)
        io.fonts.addFontDefault()

        val rangesBuilder = ImFontGlyphRangesBuilder() // Glyphs ranges provide
        rangesBuilder.addRanges(io.fonts.glyphRangesDefault)
        rangesBuilder.addRanges(io.fonts.glyphRangesCyrillic)
        rangesBuilder.addRanges(io.fonts.glyphRangesJapanese)

        val fontConfig = ImFontConfig()
        fontConfig.mergeMode = true

        val glyphRanges = rangesBuilder.buildRanges()

        fontConfig.destroy()
    }

    private fun updateKeyMods(mods: Int) {
        val io = ImGui.getIO()
        io.addKeyEvent(ImGuiKey.ModCtrl, (mods and GLFW.GLFW_MOD_CONTROL) != 0)
        io.addKeyEvent(ImGuiKey.ModShift, (mods and GLFW.GLFW_MOD_SHIFT) != 0)
        io.addKeyEvent(ImGuiKey.ModSuper, (mods and GLFW.GLFW_MOD_SUPER) != 0)
        io.addKeyEvent(ImGuiKey.ModAlt, (mods and GLFW.GLFW_MOD_ALT) != 0)
    }
}