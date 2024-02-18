package com.f19.mcnvguns.item;

import com.f19.mcnvguns.MCNVGuns;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCNVGuns.MOD_ID);

    public static final RegistryObject<MCNVGunItem> SERVICE_RIFLE = ITEMS.register("service_rifle",
            () -> new MCNVGunItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
