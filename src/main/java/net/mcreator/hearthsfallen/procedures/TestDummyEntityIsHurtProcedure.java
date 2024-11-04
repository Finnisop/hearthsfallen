package net.mcreator.hearthsfallen.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TestDummyEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity1.getAttribute(Attributes.MAX_HEALTH).setBaseValue((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
		HearthsfallenMod.queueServerWork(1, () -> {
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity4.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity2.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0)
								- (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								("Damage Taken:" + (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity5.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0))),
						false);
		});
	}
}
