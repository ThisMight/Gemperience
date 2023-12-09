package com.gemperience.client;

import com.gemperience.Gemperience;
import com.gemperience.blocks.ModBlocks;
import com.gemperience.client.rendering.CherryBombEntityRenderer;
import com.gemperience.entity.CherryBombEntity;
import com.gemperience.entity.ModEntities;
import com.gemperience.screen.KilnScreen;
import com.gemperience.screen.KilnScreenHandler;
import com.gemperience.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.TntEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;

import static com.gemperience.Gemperience.CHITIN_BOMB_PROJECTILE_ENTITY_TYPE;

@Environment(EnvType.CLIENT)
public class GemperienceClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(CHITIN_BOMB_PROJECTILE_ENTITY_TYPE, FlyingItemEntityRenderer::new);
        // older versions may have to use
		/* EntityRendererRegistry.INSTANCE.register(ProjectileTutorialMod.PackedSnowballEntityType, (context) ->
				 new FlyingItemEntityRenderer(context)); */

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GEM_GRINDER_TIER_1, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GEM_GRINDER_TIER_2, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.CHERRY_BOMB_ENTITY_TYPE, CherryBombEntityRenderer::new);

        HandledScreens.register(ModScreenHandlers.KILN_SCREEN_HANDLER_TYPE, KilnScreen::new);
    }
}