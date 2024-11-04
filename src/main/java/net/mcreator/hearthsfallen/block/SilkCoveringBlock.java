
package net.mcreator.hearthsfallen.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SilkCoveringBlock extends TrapDoorBlock {
	public SilkCoveringBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(1f, 10f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false), BlockSetType.STONE);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
