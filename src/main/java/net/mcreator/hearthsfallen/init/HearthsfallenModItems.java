
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
import net.minecraft.world.item.DoubleHighBlockItem;
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
	public static final RegistryObject<Item> SILKWOOD_PLANKS = block(HearthsfallenModBlocks.SILKWOOD_PLANKS);
	public static final RegistryObject<Item> SILK_TRAP = block(HearthsfallenModBlocks.SILK_TRAP);
	public static final RegistryObject<Item> SILK_COVERING = block(HearthsfallenModBlocks.SILK_COVERING);
	public static final RegistryObject<Item> SILKWOOD_SLAB = block(HearthsfallenModBlocks.SILKWOOD_SLAB);
	public static final RegistryObject<Item> SILKWOOD_FENCE = block(HearthsfallenModBlocks.SILKWOOD_FENCE);
	public static final RegistryObject<Item> SILKWOOD_FENCEGATE = block(HearthsfallenModBlocks.SILKWOOD_FENCEGATE);
	public static final RegistryObject<Item> SILKWOOD_BUTTON = block(HearthsfallenModBlocks.SILKWOOD_BUTTON);
	public static final RegistryObject<Item> SILKWOOD_PRESSURE_PLATE = block(HearthsfallenModBlocks.SILKWOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> STRIPPED_SILKWOOD_LOG = block(HearthsfallenModBlocks.STRIPPED_SILKWOOD_LOG);
	public static final RegistryObject<Item> SILKWOOD_WOOD = block(HearthsfallenModBlocks.SILKWOOD_WOOD);
	public static final RegistryObject<Item> STRIPPED_SILKWOOD_WOOD = block(HearthsfallenModBlocks.STRIPPED_SILKWOOD_WOOD);
	public static final RegistryObject<Item> SILKWOOD_TRAPDOOR = block(HearthsfallenModBlocks.SILKWOOD_TRAPDOOR);
	public static final RegistryObject<Item> SILKWOOD_DOOR = doubleBlock(HearthsfallenModBlocks.SILKWOOD_DOOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
