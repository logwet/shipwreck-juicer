package me.logwet.shipwreck_juicer.mixin.client;

import java.util.List;
import me.logwet.shipwreck_juicer.ShipwreckJuicer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(DebugScreenOverlay.class)
public abstract class DebugScreenOverlayMixin {
    /**
     * @author DuncanRuns
     * @reason Puts mod notice in F3 menu
     */
    @Inject(at = @At("RETURN"), method = "getGameInformation")
    private void injectGetLeftText(CallbackInfoReturnable<List<String>> info) {
        info.getReturnValue()
                .add(ShipwreckJuicer.MODID + " mod v" + ShipwreckJuicer.VERSION + " by logwet");
    }
}
