
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hearthsfallen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.hearthsfallen.HearthsfallenMod;

public class HearthsfallenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HearthsfallenMod.MODID);
	public static final RegistryObject<Item> SILK_SPIDER_SPAWN_EGG = REGISTRY.register("silk_spider_spawn_egg", () -> new ForgeSpawnEggItem(HearthsfallenModEntities.SILK_SPIDER, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
