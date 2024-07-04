package gay.asoji.innerpastels.client.imgui

import imgui.ImColor
import imgui.ImGui
import imgui.ImGui.*
import imgui.ImGui.end
import imgui.flag.ImGuiCol
import imgui.type.ImBoolean

object TestPanel : ImGuiPanel {
    override fun theme() {
        val style = ImGui.getStyle()
        val lmaored: Int = ImColor.rgba(122, 41, 41, 255)

        style.setColor(ImGuiCol.TitleBgActive, lmaored)
    }

    override fun render(open_: ImBoolean) {
        val dockspace = ImGui.getID("TestPanelDockSpace")
        if (!ImGui.begin("TestPanel")) {
            end()
            return
        }



        text("Howdy!")
        button("press me, or dont")

        end()
    }
}