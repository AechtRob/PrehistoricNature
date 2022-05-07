package com.github.aechtrob.prehistoricnature.item;

import com.github.aechtrob.prehistoricnature.PrehistoricNature;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricNature.MOD_ID);

    public static final RegistryObject<Item> LEPIDOPTERIS_SEED = ITEMS.register("lepidopteris_seeds",
            () -> new Item(new Item.Properties().tab(PNCreativeTab.PN_PLANTS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}