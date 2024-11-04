
package net.mcreator.hearthsfallen.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SilkwoodLeavesBlock extends LeavesBlock {
	public SilkwoodLeavesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}
}