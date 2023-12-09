package com.gemperience.statistics;

import com.gemperience.Gemperience;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;

public class ModStatistics {
    public static final Identifier INTERACT_WITH_KILN = new Identifier(Gemperience.MODID, "interact_with_kiln");

    public static void registerModStatistics(){
        Registry.register(Registries.CUSTOM_STAT, "interact_with_kiln", INTERACT_WITH_KILN);
        Stats.CUSTOM.getOrCreateStat(INTERACT_WITH_KILN, StatFormatter.DEFAULT);

        System.out.println("Mod statistics registered for " + Gemperience.MODID);
    }

}
