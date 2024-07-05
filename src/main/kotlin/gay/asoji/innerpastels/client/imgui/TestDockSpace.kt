package gay.asoji.innerpastels.client.imgui

import imgui.ImColor
import imgui.ImGui
import imgui.ImGui.*
import imgui.flag.ImGuiCol
import imgui.type.ImBoolean

internal object TestDockSpace : ImGuiPanel {
    override fun theme() {
        val style = ImGui.getStyle()
        val lmaored: Int = ImColor.rgb("#00a86b")

        style.setColor(ImGuiCol.TitleBgActive, lmaored)
    }

    override fun render(open_: ImBoolean) {
        val dockspace = ImGui.getID("TestingDockSpace")
        if (!ImGui.begin("Dockspace")) {
            end()
            return
        }
        dockSpace(dockspace, getWindowViewport().sizeX, getWindowViewport().sizeY)
        end()
    }
}