package com.github.aechtrob.prehistoricnature.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PNCreativeTab {
    public static final CreativeModeTab PN_PLANTS = new CreativeModeTab("PNPlantsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEPIDOPTERIS_SEED.get());
        }
    };

    public static final CreativeModeTab PN_STATIC = new CreativeModeTab("PNStaticTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEPIDOPTERIS_SEED.get());
        }
    };
}
