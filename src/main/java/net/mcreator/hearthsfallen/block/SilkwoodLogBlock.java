
package net.mcreator.hearthsfallen.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SilkwoodLogBlock extends Block {
	public SilkwoodLogBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}