package com.ewyboy.craftablehorsearmour;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {

    public static boolean oldHorseArmour, oldSaddle;

    public static void init (File file) {

        Configuration config = new Configuration(file);

        config.load();
            oldHorseArmour = config.getBoolean("Old Horse Armour Recipe","Recipes",false,"Turn on the old horse armour recipes from the pre-13w18a snapshot");
            oldSaddle = config.getBoolean("Old Saddle Recipe","Recipes",false,"Turn on the old horse armour recipes from the pre-13w16a snapshot");
        config.save();
    }
}
