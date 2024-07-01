package gay.asoji.innerpastels.mixins;

import com.mojang.blaze3d.platform.Window;
import gay.asoji.innerpastels.client.imgui.InnerPastelsImGuiImpl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfig;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftClientMixin {
    @Shadow @Final private Window window;

    @Inject(at = @At("TAIL"),method = "<init>")
    private void onGLFWInit(GameConfig gameConfig, CallbackInfo ci){
        InnerPastelsImGuiImpl.INSTANCE.glfwInit(window.getWindow());
    }
}
