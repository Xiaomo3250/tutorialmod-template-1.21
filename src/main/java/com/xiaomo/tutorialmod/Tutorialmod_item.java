package com.xiaomo.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod_item implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Item TEST_ITEM = new Item(new Item.Settings());
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registries.ITEM, Identifier.of("tutorialmod", "test_item") , TEST_ITEM);


		LOGGER.info("Hello Fabric world!");
	}
}