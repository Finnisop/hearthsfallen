
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hearthsfallen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hearthsfallen.block.StrippedSilkwoodWoodBlock;
import net.mcreator.hearthsfallen.block.StrippedSilkwoodLogBlock;
import net.mcreator.hearthsfallen.block.SilkwoodWoodBlock;
import net.mcreator.hearthsfallen.block.SilkwoodTrapdoorBlock;
import net.mcreator.hearthsfallen.block.SilkwoodSlabBlock;
import net.mcreator.hearthsfallen.block.SilkwoodPressurePlateBlock;
import net.mcreator.hearthsfallen.block.SilkwoodPlanksBlock;
import net.mcreator.hearthsfallen.block.SilkwoodLogBlock;
import net.mcreator.hearthsfallen.block.SilkwoodLeavesBlock;
import net.mcreator.hearthsfallen.block.SilkwoodFencegateBlock;
import net.mcreator.hearthsfallen.block.SilkwoodFenceBlock;
import net.mcreator.hearthsfallen.block.SilkwoodDoorBlock;
import net.mcreator.hearthsfallen.block.SilkwoodButtonBlock;
import net.mcreator.hearthsfallen.block.SilkTrapBlock;
import net.mcreator.hearthsfallen.block.SilkCoveringBlock;
import net.mcreator.hearthsfallen.HearthsfallenMod;

public class HearthsfallenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HearthsfallenMod.MODID);
	public static final RegistryObject<Block> SILKWOOD_LOG = REGISTRY.register("silkwood_log", () -> new SilkwoodLogBlock());
	public static final RegistryObject<Block> SILKWOOD_LEAVES = REGISTRY.register("silkwood_leaves", () -> new SilkwoodLeavesBlock());
	public static final RegistryObject<Block> SILKWOOD_PLANKS = REGISTRY.register("silkwood_planks", () -> new SilkwoodPlanksBlock());
	public static final RegistryObject<Block> SILK_TRAP = REGISTRY.register("silk_trap", () -> new SilkTrapBlock());
	public static final RegistryObject<Block> SILK_COVERING = REGISTRY.register("silk_covering", () -> new SilkCoveringBlock());
	public static final RegistryObject<Block> SILKWOOD_SLAB = REGISTRY.register("silkwood_slab", () -> new SilkwoodSlabBlock());
	public static final RegistryObject<Block> SILKWOOD_FENCE = REGISTRY.register("silkwood_fence", () -> new SilkwoodFenceBlock());
	public static final RegistryObject<Block> SILKWOOD_FENCEGATE = REGISTRY.register("silkwood_fencegate", () -> new SilkwoodFencegateBlock());
	public static final RegistryObject<Block> SILKWOOD_BUTTON = REGISTRY.register("silkwood_button", () -> new SilkwoodButtonBlock());
	public static final RegistryObject<Block> SILKWOOD_PRESSURE_PLATE = REGISTRY.register("silkwood_pressure_plate", () -> new SilkwoodPressurePlateBlock());
	public static final RegistryObject<Block> STRIPPED_SILKWOOD_LOG = REGISTRY.register("stripped_silkwood_log", () -> new StrippedSilkwoodLogBlock());
	public static final RegistryObject<Block> SILKWOOD_WOOD = REGISTRY.register("silkwood_wood", () -> new SilkwoodWoodBlock());
	public static final RegistryObject<Block> STRIPPED_SILKWOOD_WOOD = REGISTRY.register("stripped_silkwood_wood", () -> new StrippedSilkwoodWoodBlock());
	public static final RegistryObject<Block> SILKWOOD_TRAPDOOR = REGISTRY.register("silkwood_trapdoor", () -> new SilkwoodTrapdoorBlock());
	public static final RegistryObject<Block> SILKWOOD_DOOR = REGISTRY.register("silkwood_door", () -> new SilkwoodDoorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
