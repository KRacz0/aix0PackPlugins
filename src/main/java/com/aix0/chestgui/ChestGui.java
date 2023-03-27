package com.aix0.chestgui;

import com.aix0.chestgui.listeners.PlayerClickInventoryListener;
import com.aix0.chestgui.listeners.PlayerInteractListener;
import com.aix0.chestgui.listeners.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChestGui extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerClickInventoryListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
