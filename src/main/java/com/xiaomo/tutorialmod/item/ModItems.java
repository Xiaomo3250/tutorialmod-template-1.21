package com.xiaomo.tutorialmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
// import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import com.xiaomo.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item TUTORIAL_ITEM = registerItems("tutorial_item", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TutorialMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id), item);
    }

    public static void registerModItems() {
        ModItems.registerModItems();
        TutorialMod.LOGGER.info("Registering Mod Items");
    }
}
