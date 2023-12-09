package com.gemperience.sound;

import com.gemperience.Gemperience;
import net.minecraft.client.sound.Sound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent RUNIAN_SPAWN = registerSoundEvent("runian_spawn");
    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(Gemperience.MODID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void RegisterSoundEvents(){
        System.out.println("Registering sound events for " + Gemperience.MODID);
    }
}
