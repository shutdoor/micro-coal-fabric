package com.shutdoor;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCoalMod implements ModInitializer {
	public static final String MODID = "microcoal";
    public static final Logger LOGGER = LoggerFactory.getLogger("microcoal");



	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		FuelRegistry.INSTANCE.add(ModItems.MICRO_COAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.MICRO_CHARCOAL, 200);
	}
}