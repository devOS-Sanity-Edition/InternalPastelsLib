package gay.asoji.innerpastels.client

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.loader.api.FabricLoader

class InnerPastelsClient : ClientModInitializer {
    override fun onInitializeClient() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment) {

            ImGuiClient.init()
        }
    }


}