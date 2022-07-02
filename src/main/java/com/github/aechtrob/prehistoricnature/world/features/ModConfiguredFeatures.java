package com.github.aechtrob.prehistoricnature.world.features;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import com.github.aechtrob.prehistoricnature.world.features.tree.diaphorodendron.DiaphorodendronFoliagePlacer;
import com.github.aechtrob.prehistoricnature.world.features.tree.diaphorodendron.DiaphorodendronTreeTrunk;
import com.github.aechtrob.prehistoricnature.world.features.tree.lepidodendron.LepidodendronFoliagePlacer;
import com.github.aechtrob.prehistoricnature.world.features.tree.lepidodendron.LepidodendronTreeTrunk;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DIAPHORODENDRON_TREE =
            FeatureUtils.register("diaphorodendron", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.DIAPHORODENDRON_LOG.get()),
                    new DiaphorodendronTreeTrunk(0,0,0),
                    BlockStateProvider.simple(ModBlocks.DIAPHORODENDRON_LEAVES.get()),
                    new DiaphorodendronFoliagePlacer(ConstantInt.of(0),ConstantInt.of(0),0),
                    new TwoLayersFeatureSize(0,0,0)
            ).build());

    public static final Holder<PlacedFeature> DIAPHORODENDRON_CHECKED =
            PlacementUtils.register("diaphorodendron_checked", DIAPHORODENDRON_TREE,
                    PlacementUtils.HEIGHTMAP_TOP_SOLID);

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DIAPHORODENDRON_SPAWN =
            FeatureUtils.register("diaphorodendron_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(DIAPHORODENDRON_CHECKED,
                            0.5F)), DIAPHORODENDRON_CHECKED));
    


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LEPIDODENDRON_TREE =
        FeatureUtils.register("lepidodendron", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.LEPIDODENDRON_LOG.get()),
            new LepidodendronTreeTrunk(0,0,0),
            BlockStateProvider.simple(ModBlocks.LEPIDODENDRON_LEAVES.get()),
            new LepidodendronFoliagePlacer(ConstantInt.of(0),ConstantInt.of(0),0),
            new TwoLayersFeatureSize(0,0,0)
        ).build());

    public static final Holder<PlacedFeature> LEPIDODENDRON_CHECKED =
            PlacementUtils.register("lepidodendron_checked", LEPIDODENDRON_TREE,
                PlacementUtils.HEIGHTMAP_TOP_SOLID);

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> LEPIDODENDRON_SPAWN =
            FeatureUtils.register("lepidodendron_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(LEPIDODENDRON_CHECKED,
                0.5F)), LEPIDODENDRON_CHECKED));

}
