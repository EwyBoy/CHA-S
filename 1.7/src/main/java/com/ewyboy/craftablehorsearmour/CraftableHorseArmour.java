package com.ewyboy.craftablehorsearmour;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "craftablehorsearmour", name = "Craftable Horse Armour [CHA&S]", version = "1.1")

    public class CraftableHorseArmour {

    @Mod.Instance("craftablehorsearmour")
    public static CraftableHorseArmour instance;

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        Crafting.init();
    }
    @Mod.EventHandler
    public void load(FMLPreInitializationEvent event) {
        Config.init(event.getSuggestedConfigurationFile());
    }
}

