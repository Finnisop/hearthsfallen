
package net.mcreator.hearthsfallen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.hearthsfallen.entity.SilkSpiderEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SilkSpiderRenderer extends MobRenderer<SilkSpiderEntity, SpiderModel<SilkSpiderEntity>> {
	public SilkSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.4f);
	}

	@Override
	protected void scale(SilkSpiderEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.4f, 0.4f, 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(SilkSpiderEntity entity) {
		return new ResourceLocation("hearthsfallen:textures/entities/spider.png");
	}
}
