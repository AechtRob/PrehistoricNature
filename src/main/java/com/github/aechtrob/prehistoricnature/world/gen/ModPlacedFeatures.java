package com.github.aechtrob.prehistoricnature.world.gen;

import com.github.aechtrob.prehistoricnature.world.features.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> LEPIDODENDRON_PLACED =
        PlacementUtils.register("lepidodendron_placed",
            ModConfiguredFeatures.LEPIDODENDRON_SPAWN, VegetationPlacements.treePlacement(
                RarityFilter.onAverageOnceEvery(12)
            ));

}
