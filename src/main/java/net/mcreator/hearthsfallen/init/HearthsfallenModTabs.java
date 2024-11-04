
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hearthsfallen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.hearthsfallen.HearthsfallenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HearthsfallenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HearthsfallenMod.MODID);
	public static final RegistryObject<CreativeModeTab> HEARTHSFALLEN = REGISTRY.register("hearthsfallen",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hearthsfallen.hearthsfallen")).icon(() -> new ItemStack(Items.GLASS_BOTTLE)).displayItems((parameters, tabData) -> {
				tabData.accept(HearthsfallenModItems.PROTOTYPE_DAGGER.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(HearthsfallenModItems.SILK_SPIDER_SPAWN_EGG.get());
			tabData.accept(HearthsfallenModItems.TEST_DUMMY_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(HearthsfallenModBlocks.SILKWOOD_LOG.get().asItem());
			tabData.accept(HearthsfallenModBlocks.SILKWOOD_LEAVES.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(HearthsfallenModItems.TESTGREATSWORD.get());

		}
	}
}
