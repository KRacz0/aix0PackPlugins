package com.aix0.chat;

import com.aix0.chat.commands.ChatCommand;
import com.aix0.chat.events.ChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Chat extends JavaPlugin {

    public static boolean chatEnabled = true;

    @Override
    public void onEnable() {
        getCommand("chat").setExecutor(new ChatCommand());
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
