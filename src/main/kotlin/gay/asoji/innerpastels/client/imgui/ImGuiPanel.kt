package gay.asoji.innerpastels.client.imgui

import imgui.type.ImBoolean

interface ImGuiPanel {
    fun theme()
    fun render(open_: ImBoolean)
}