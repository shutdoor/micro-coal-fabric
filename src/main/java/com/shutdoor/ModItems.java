package com.shutdoor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MICRO_COAL = registerItem("micro_coal");
    public static final Item MICRO_CHARCOAL = registerItem("micro_charcoal");

    private static void addItemToGroup(FabricItemGroupEntries ent){
        ent.add(MICRO_COAL);
        ent.add(MICRO_CHARCOAL);
    }

    private static Item registerItem(String name){
        return Registry.register(Registries.ITEM, new Identifier(MicroCoalMod.MODID, name), new Item(new FabricItemSettings()));
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToGroup);
    }

}
