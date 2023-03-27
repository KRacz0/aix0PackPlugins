package com.aix0.customcrafting;

import com.aix0.customcrafting.recipes.PickaxeRecipes;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCrafting extends JavaPlugin {

    @Override
    public void onEnable() {

        PickaxeRecipes pickaxeRecipes = new PickaxeRecipes();
        pickaxeRecipes.customPickaxeCrafting();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
