package com.ewyboy.craftablehorsearmour;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting {

    public static void registerCrafting() {

        if (Config.oldHorseArmour == true) {
            GameRegistry.addShapedRecipe(new ItemStack(Items.iron_horse_armor, 1),
                    "  X", "XOX", "XXX", 'X', Items.iron_ingot, 'O', Blocks.wool);
            GameRegistry.addShapedRecipe(new ItemStack(Items.golden_horse_armor, 1),
                    "  X", "XOX", "XXX", 'X', Items.gold_ingot, 'O', Blocks.wool);
            GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_horse_armor, 1),
                    "  X", "XOX", "XXX", 'X', Items.diamond, 'O', Blocks.wool);
        } else {
            GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1),
                    "  M", "XWX", "I I", 'I', Items.iron_leggings, 'X', Items.iron_ingot, 'M', Items.iron_helmet,'W', Blocks.wool);

            GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1),
                    "  M", "XWX", "I I", 'I', Items.golden_leggings, 'X', Items.gold_ingot, 'M', Items.golden_helmet,'W', Blocks.wool);

            GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1),
                    "  M", "XWX", "I I", 'I', Items.diamond_leggings, 'X', Items.diamond, 'M', Items.diamond_helmet,'W', Blocks.wool);
        }
        if (Config.oldSaddle == true) {
            GameRegistry.addRecipe(new ItemStack(Items.saddle, 1),
                    "XXX", "XIX", "I I", 'I', Items.iron_ingot, 'X', Items.leather);
        } else {
            GameRegistry.addRecipe(new ItemStack(Items.saddle, 1),
                    "XXX","O O", "I I", 'X', Items.leather, 'I', Items.iron_ingot, 'O', Items.string);
        }
    }
}
