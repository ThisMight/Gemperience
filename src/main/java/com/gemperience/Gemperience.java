package com.gemperience;
import com.gemperience.blocks.ModBlocks;
import com.gemperience.blocks.entity.ModBlockEntities;
import com.gemperience.entity.CherryBombEntity;
import com.gemperience.entity.ModEntities;
import com.gemperience.items.ModItemGroup;
import com.gemperience.items.ModItems;
import com.gemperience.potion.ModPotions;
import com.gemperience.projectiles.ChitinBombProjectile;
import com.gemperience.projectiles.dispensebehaviours.ChitinBombDispenseBehaviour;
import com.gemperience.recipe.ModRecipeSerializers;
import com.gemperience.recipe.ModRecipeTypes;
import com.gemperience.sound.ModSounds;
import com.gemperience.statistics.ModStatistics;
import com.gemperience.util.ModLootTableModifications;
import com.gemperience.util.ModServerEvents;
import com.gemperience.world.gen.ModWorldGeneration;
import com.gemperience.world.gen.custom.ModFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameRules;

public class Gemperience implements ModInitializer {
    public static final String MODID = "gemperience";

    public static final GameRules.Key<GameRules.BooleanRule> CAN_RUNIAN_SPAWN =
            GameRuleRegistry.register("canRunianSpawn", GameRules.Category.MOBS, GameRuleFactory.createBooleanRule(true));
    public static final EntityType<ChitinBombProjectile> CHITIN_BOMB_PROJECTILE_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MODID, "chitin_bomb"),
            FabricEntityTypeBuilder.<ChitinBombProjectile>create(SpawnGroup.MISC, ChitinBombProjectile::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)) // dimensions in Minecraft units of the projectile
                    .trackRangeBlocks(4).trackedUpdateRate(10) // necessary for all thrown projectiles (as it prevents it from breaking, lol)
                    .build());


    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModBlockEntities.registerBlockEntities();

        ModSounds.RegisterSoundEvents();

        ModFeatures.RegisterFeatures();
        ModWorldGeneration.generateModWorldGen();

        ModServerEvents.registerModServerEventListeners();
        ModRecipeTypes.registerModRecipeTypes();
        ModRecipeSerializers.registerModRecipeSerializers();

        ModEntities.registerModEntities();

        ModPotions.RegisterModPotions();
        ModPotions.registerPotionRecipes();

        ModStatistics.registerModStatistics();

        ModLootTableModifications.registerModLootTableModifications();

        DispenserBlock.registerBehavior(ModItems.CHITIN_BOMB, new ChitinBombDispenseBehaviour());
    }
}
