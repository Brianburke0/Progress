package com.scriptmasters.progress.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.scriptmasters.progress.entity.WaspEntity;

public class WaspModel extends GeoModel<WaspEntity> {
	@Override
	public ResourceLocation getAnimationResource(WaspEntity entity) {
		return ResourceLocation.parse("progress:animations/wasp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaspEntity entity) {
		return ResourceLocation.parse("progress:geo/wasp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaspEntity entity) {
		return ResourceLocation.parse("progress:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(WaspEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
