package dev.ferriarnus.monocle.moddedshaders.mixin;

import dev.ferriarnus.monocle.Monocle;
import net.irisshaders.iris.config.IrisConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IrisConfig.class)
public class MixinIrisConfig {

    @Inject(method = "shouldAllowUnknownShaders", at = @At("RETURN"), cancellable = true)
    public void moddedShaders(CallbackInfoReturnable<Boolean> cir) {
        if (Monocle.shouldOverride()) {
            cir.setReturnValue(true);
        }
    }
}
