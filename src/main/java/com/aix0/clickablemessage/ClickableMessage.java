package com.aix0.clickablemessage;

import com.aix0.clickablemessage.listener.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ClickableMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this );

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
