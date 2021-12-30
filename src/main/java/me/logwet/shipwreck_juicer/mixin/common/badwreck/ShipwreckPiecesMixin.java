package me.logwet.shipwreck_juicer.mixin.common.badwreck;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.ShipwreckPieces;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ShipwreckPieces.class)
public abstract class ShipwreckPiecesMixin {
    @Final @Shadow
    private static ResourceLocation[] STRUCTURE_LOCATION_BEACHED =
            new ResourceLocation[] {
                new ResourceLocation("shipwreck/with_mast"),
                new ResourceLocation("shipwreck/sideways_full"),
                new ResourceLocation("shipwreck/sideways_backhalf"),
                new ResourceLocation("shipwreck/rightsideup_full"),
                new ResourceLocation("shipwreck/rightsideup_backhalf"),
                new ResourceLocation("shipwreck/with_mast_degraded"),
                new ResourceLocation("shipwreck/rightsideup_full_degraded"),
                new ResourceLocation("shipwreck/rightsideup_backhalf_degraded")
            };

    @Final @Shadow
    private static ResourceLocation[] STRUCTURE_LOCATION_OCEAN =
            new ResourceLocation[] {
                new ResourceLocation("shipwreck/with_mast"),
                new ResourceLocation("shipwreck/upsidedown_full"),
                new ResourceLocation("shipwreck/upsidedown_backhalf"),
                new ResourceLocation("shipwreck/sideways_full"),
                new ResourceLocation("shipwreck/sideways_backhalf"),
                new ResourceLocation("shipwreck/rightsideup_full"),
                new ResourceLocation("shipwreck/rightsideup_backhalf"),
                new ResourceLocation("shipwreck/with_mast_degraded"),
                new ResourceLocation("shipwreck/upsidedown_full_degraded"),
                new ResourceLocation("shipwreck/upsidedown_backhalf_degraded"),
                new ResourceLocation("shipwreck/sideways_full_degraded"),
                new ResourceLocation("shipwreck/sideways_backhalf_degraded"),
                new ResourceLocation("shipwreck/rightsideup_full_degraded"),
                new ResourceLocation("shipwreck/rightsideup_backhalf_degraded")
            };
}
