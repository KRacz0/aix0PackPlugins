package com.aix0.custommessage;

import com.aix0.custommessage.events.PlayerJoinEvent;
import com.aix0.custommessage.events.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitEvent(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
