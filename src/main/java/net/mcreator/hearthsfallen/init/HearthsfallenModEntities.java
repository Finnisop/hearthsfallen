
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hearthsfallen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.hearthsfallen.entity.TestDummyEntity;
import net.mcreator.hearthsfallen.entity.SilkSpiderEntity;
import net.mcreator.hearthsfallen.HearthsfallenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HearthsfallenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HearthsfallenMod.MODID);
	public static final RegistryObject<EntityType<SilkSpiderEntity>> SILK_SPIDER = register("silk_spider",
			EntityType.Builder.<SilkSpiderEntity>of(SilkSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilkSpiderEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<TestDummyEntity>> TEST_DUMMY = register("test_dummy",
			EntityType.Builder.<TestDummyEntity>of(TestDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestDummyEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SilkSpiderEntity.init();
			TestDummyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SILK_SPIDER.get(), SilkSpiderEntity.createAttributes().build());
		event.put(TEST_DUMMY.get(), TestDummyEntity.createAttributes().build());
	}
}
