package com.ewyboy.craftablehorsearmour;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "craftablehorsearmour", name = "Craftable Horse Armour [CHA&S]", version = "1.0")

    public class CraftableHorseArmour {

    @Mod.Instance("craftablehorsearmour")
    public static CraftableHorseArmour instance;

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        Crafting.registerCrafting();
    }

    @Mod.EventHandler
    public void PreInit (FMLPreInitializationEvent event) {
        Config.init(event.getSuggestedConfigurationFile());    }
}

