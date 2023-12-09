package com.gemperience.potion;

import com.gemperience.Gemperience;
import com.gemperience.items.ModItems;
import com.gemperience.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final Potion MERFOLK = register("merfolk",
            new Potion(
                    new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600, 0),
                    new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 3600, 0)));

    public static final Potion LONG_MERFOLK = register("long_merfolk",
            new Potion(
                    "merfolk",
                    new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 9600, 0),
                    new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 9600, 0)));

    public static final Potion VITALITY = register("vitality",
            new Potion(
                    new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3600, 0),
                    new StatusEffectInstance(StatusEffects.REGENERATION, 3600,0)
            ));

    public static final Potion LONG_VITALITY = register("long_vitality",
            new Potion("vitality",
                    new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 9600, 0),
                    new StatusEffectInstance(StatusEffects.REGENERATION, 9600,0)
            ));

    public static final Potion DECAY = register("decay",
            new Potion(
                    new StatusEffectInstance(StatusEffects.WITHER, 1800, 0)
            ));

    public static final Potion LONG_DECAY = register("long_decay",
            new Potion("decay",
                    new StatusEffectInstance(StatusEffects.WITHER, 4800, 0)
            ));

    public static final Potion RADIANCE = register("radiance",
            new Potion(
                    new StatusEffectInstance(StatusEffects.GLOWING, 3600, 0)
            ));

    public static final Potion LONG_RADIANCE = register("long_radiance",
            new Potion("radiance",
                    new StatusEffectInstance(StatusEffects.GLOWING, 9600, 0)
            ));


    public static final Potion DARKNESS = register("darkness",
            new Potion(
                    new StatusEffectInstance(StatusEffects.DARKNESS, 1800, 0)
            ));

    public static final Potion LONG_DARKNESS = register("long_darkness",
            new Potion("darkness",
                    new StatusEffectInstance(StatusEffects.DARKNESS, 4800, 0)
            ));

    public static final Potion SATURATION = register("saturation",
            new Potion(
                    new StatusEffectInstance(StatusEffects.SATURATION, 3600, 0)
            ));

    public static final Potion LONG_SATURATION = register("long_saturation",
            new Potion("saturation",
                    new StatusEffectInstance(StatusEffects.SATURATION, 9600, 0)
            ));


    public static final Potion STARVATION = register("starvation",
            new Potion(
                    new StatusEffectInstance(StatusEffects.HUNGER, 1800, 0)
            ));

    public static final Potion LONG_STARVATION = register("long_starvation",
            new Potion("starvation",
                    new StatusEffectInstance(StatusEffects.HUNGER, 4800, 0)
            ));

    public static final Potion HASTE = register("haste",
            new Potion(
                    new StatusEffectInstance(StatusEffects.HASTE, 3600, 0)
            ));

    public static final Potion LONG_HASTE = register("long_haste",
            new Potion("haste",
                    new StatusEffectInstance(StatusEffects.HASTE, 9600, 0)
            ));

    public static final Potion MINING_FATIGUE = register("mining_fatigue",
            new Potion(
                    new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1800, 0)
            ));

    public static final Potion LONG_MINING_FATIGUE = register("long_mining_fatigue",
            new Potion("mining_fatigue",
                    new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 4800, 0)
            ));

    public static final Potion SICKNESS = register("sickness",
            new Potion(
                    new StatusEffectInstance(StatusEffects.NAUSEA, 1800, 0)
            ));

    public static final Potion LONG_SICKNESS = register("long_sickness",
            new Potion("sickness",
                    new StatusEffectInstance(StatusEffects.NAUSEA, 4800, 0)
            ));

    public static final Potion ABSORPTION = register("absorption",
            new Potion(
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 0)
            ));

    public static final Potion LONG_ABSORPTION = register("long_absorption",
            new Potion("absorption",
                    new StatusEffectInstance(StatusEffects.ABSORPTION, 9600, 0)
            ));

    public static final Potion LEVIATION = register("leviation",
            new Potion(
                    new StatusEffectInstance(StatusEffects.LEVITATION, 1800, 0)
            ));

    public static final Potion LONG_LEVIATION = register("long_leviation",
            new Potion("leviation",
                    new StatusEffectInstance(StatusEffects.LEVITATION, 4800, 0)
            ));

    public static final Potion BLINDNESS = register("blindness",
            new Potion(
                    new StatusEffectInstance(StatusEffects.BLINDNESS, 1800, 0)
            ));
    public static final Potion LONG_BLINDNESS = register("long_blindness",
            new Potion("blindness",
                    new StatusEffectInstance(StatusEffects.BLINDNESS, 4800, 0)
            ));


    public static final Potion LUCK = register("luck",
            new Potion(
                    new StatusEffectInstance(StatusEffects.LUCK, 3600, 0)
            ));

    public static final Potion LONG_LUCK = register("long_luck",
            new Potion("luck",
                    new StatusEffectInstance(StatusEffects.LUCK, 9600, 0)
            ));

    public static final Potion UNLUCK = register("unluck",
            new Potion(
                    new StatusEffectInstance(StatusEffects.UNLUCK, 1800, 0)
            ));

    public static final Potion LONG_UNLUCK = register("long_unluck",
            new Potion("unluck",
                    new StatusEffectInstance(StatusEffects.UNLUCK, 4800, 0)
            ));

    public static void registerPotionRecipes(){
        //Base potions
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.ANTHOLIUM, ModPotions.MERFOLK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.RUBY, ModPotions.VITALITY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.ECHORINE_PASTE, ModPotions.RADIANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.RUNIAN, ModPotions.DECAY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.PETRINITE_BULB, ModPotions.SATURATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.SLAGODITE, ModPotions.HASTE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.BIOLIUM, ModPotions.BLINDNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.CHITINOUS_GROWTH, ModPotions.SICKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.GLAZONIUM, ModPotions.LEVIATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.JADESTONE, ModPotions.LUCK);

        //Long version
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MERFOLK, Items.REDSTONE, ModPotions.LONG_MERFOLK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VITALITY, Items.REDSTONE, ModPotions.LONG_VITALITY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.RADIANCE, Items.REDSTONE, ModPotions.LONG_RADIANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DARKNESS, Items.REDSTONE, ModPotions.LONG_DARKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DECAY, Items.REDSTONE, ModPotions.LONG_DECAY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SATURATION, Items.REDSTONE, ModPotions.LONG_SATURATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STARVATION, Items.REDSTONE, ModPotions.LONG_STARVATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, Items.REDSTONE, ModPotions.LONG_HASTE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MINING_FATIGUE, Items.REDSTONE, ModPotions.LONG_MINING_FATIGUE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SICKNESS, Items.REDSTONE, ModPotions.LONG_SICKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ABSORPTION, Items.REDSTONE, ModPotions.LONG_ABSORPTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LEVIATION, Items.REDSTONE, ModPotions.LONG_LEVIATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BLINDNESS, Items.REDSTONE, ModPotions.LONG_BLINDNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LUCK, Items.REDSTONE, ModPotions.LONG_LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.UNLUCK, Items.REDSTONE, ModPotions.LONG_UNLUCK);

        //Polarisation
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.RADIANCE, Items.FERMENTED_SPIDER_EYE, ModPotions.DARKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SATURATION, Items.FERMENTED_SPIDER_EYE, ModPotions.STARVATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, Items.FERMENTED_SPIDER_EYE, ModPotions.MINING_FATIGUE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SICKNESS, Items.FERMENTED_SPIDER_EYE, ModPotions.ABSORPTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LEVIATION, Items.FERMENTED_SPIDER_EYE, ModPotions.BLINDNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LUCK, Items.FERMENTED_SPIDER_EYE, ModPotions.UNLUCK);

        //Polarisation, long version
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_RADIANCE, Items.FERMENTED_SPIDER_EYE, ModPotions.LONG_DARKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_SATURATION, Items.FERMENTED_SPIDER_EYE, ModPotions.LONG_STARVATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_HASTE, Items.FERMENTED_SPIDER_EYE, ModPotions.LONG_MINING_FATIGUE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_SICKNESS, Items.FERMENTED_SPIDER_EYE, ModPotions.LONG_ABSORPTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_LEVIATION, Items.FERMENTED_SPIDER_EYE, ModPotions.LONG_BLINDNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_LUCK, Items.FERMENTED_SPIDER_EYE, ModPotions.LONG_UNLUCK);

        //re-polatisation
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DARKNESS, ModItems.SPIRONITE, ModPotions.RADIANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STARVATION, ModItems.SPIRONITE, ModPotions.STARVATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MINING_FATIGUE, ModItems.SPIRONITE, ModPotions.HASTE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ABSORPTION, ModItems.SPIRONITE, ModPotions.SICKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BLINDNESS, ModItems.SPIRONITE, ModPotions.LEVIATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.UNLUCK, ModItems.SPIRONITE, ModPotions.LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.SLOWNESS, ModItems.SPIRONITE, Potions.SWIFTNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.HARMING, ModItems.SPIRONITE, Potions.HEALING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, ModItems.SPIRONITE, Potions.REGENERATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.WEAKNESS, ModItems.SPIRONITE, Potions.STRENGTH);

        //re-polerisation strong ver
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_SLOWNESS, ModItems.SPIRONITE, Potions.STRONG_SWIFTNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_HARMING, ModItems.SPIRONITE, Potions.STRONG_HEALING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_POISON, ModItems.SPIRONITE, Potions.STRONG_REGENERATION);

        //re-polatisation long ver
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_DARKNESS, ModItems.SPIRONITE, ModPotions.LONG_RADIANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_STARVATION, ModItems.SPIRONITE, ModPotions.LONG_STARVATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_MINING_FATIGUE, ModItems.SPIRONITE, ModPotions.LONG_HASTE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_ABSORPTION, ModItems.SPIRONITE, ModPotions.LONG_SICKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_BLINDNESS, ModItems.SPIRONITE, ModPotions.LONG_LEVIATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LONG_UNLUCK, ModItems.SPIRONITE, ModPotions.LONG_LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LONG_SLOWNESS, ModItems.SPIRONITE, Potions.LONG_SWIFTNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LONG_POISON, ModItems.SPIRONITE, Potions.LONG_REGENERATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LONG_WEAKNESS, ModItems.SPIRONITE, Potions.LONG_STRENGTH);
    }

    private static Potion register(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(Gemperience.MODID, name), potion);
    }

    public static void RegisterModPotions(){
        System.out.println("Registering potions for: " + Gemperience.MODID);
    }
}
