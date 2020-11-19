package com.ewyboy.craftablehorsearmour;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("craftablehorsearmour")
public class CraftableHorseArmour
{
    public CraftableHorseArmour() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}