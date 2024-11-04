
package net.mcreator.hearthsfallen.client.renderer;

public class TestDummyRenderer extends HumanoidMobRenderer<TestDummyEntity, HumanoidModel<TestDummyEntity>> {

	public TestDummyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(TestDummyEntity entity) {
		return new ResourceLocation("hearthsfallen:textures/entities/alex.png");
	}

}
