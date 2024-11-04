
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hearthsfallen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hearthsfallen.block.SilkwoodPlanksBlock;
import net.mcreator.hearthsfallen.block.SilkwoodLogBlock;
import net.mcreator.hearthsfallen.block.SilkwoodLeavesBlock;
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
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
