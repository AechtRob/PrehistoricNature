package com.github.aechtrob.prehistoricnature.world.features;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import com.github.aechtrob.prehistoricnature.world.features.tree.lepidodendron.LepidodendronFoliagePlacer;
import com.github.aechtrob.prehistoricnature.world.features.tree.lepidodendron.LepidodendronTreeTrunk;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<?, ?>> LEPIDODENDRON = register("lepidodendron", Feature.TREE.configured(
        new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.LEPIDODENDRON_LOG.get()),
            new LepidodendronTreeTrunk(0,0,0),
            BlockStateProvider.simple(ModBlocks.LEPIDODENDRON_LEAVES.get()),
            new LepidodendronFoliagePlacer(ConstantInt.of(0),ConstantInt.of(0),0),
            new TwoLayersFeatureSize(0,0,0)
        ).build())
    );

    private static <FC extends FeatureConfiguration>ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }

}
