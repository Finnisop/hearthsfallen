
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hearthsfallen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hearthsfallen.item.TestgreatswordItem;
import net.mcreator.hearthsfallen.item.PrototypeDaggerItem;
import net.mcreator.hearthsfallen.HearthsfallenMod;

public class HearthsfallenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HearthsfallenMod.MODID);
	public static final RegistryObject<Item> SILK_SPIDER_SPAWN_EGG = REGISTRY.register("silk_spider_spawn_egg", () -> new ForgeSpawnEggItem(HearthsfallenModEntities.SILK_SPIDER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SILKWOOD_LOG = block(HearthsfallenModBlocks.SILKWOOD_LOG);
	public static final RegistryObject<Item> TEST_DUMMY_SPAWN_EGG = REGISTRY.register("test_dummy_spawn_egg", () -> new ForgeSpawnEggItem(HearthsfallenModEntities.TEST_DUMMY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PROTOTYPE_DAGGER = REGISTRY.register("prototype_dagger", () -> new PrototypeDaggerItem());
	public static final RegistryObject<Item> SILKWOOD_LEAVES = block(HearthsfallenModBlocks.SILKWOOD_LEAVES);
	public static final RegistryObject<Item> TESTGREATSWORD = REGISTRY.register("testgreatsword", () -> new TestgreatswordItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
