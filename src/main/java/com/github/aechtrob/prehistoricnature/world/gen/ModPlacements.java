package com.github.aechtrob.prehistoricnature.world.gen;

import com.github.aechtrob.prehistoricnature.world.features.ModConfiguredFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacements {

    public static final PlacedFeature LEPIDODENDRON_TREE = PlacementUtils.register("lepidodendron_tree_placement", ModConfiguredFeatures.LEPIDODENDRON.placed(RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

}
