package com.aix0.home;

import com.aix0.home.commands.HomeCommand;
import com.aix0.home.commands.SetHomeCommands;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Home extends JavaPlugin {
    public static String path;

    @Override
    public void onEnable() {
        getCommand("home").setExecutor(new HomeCommand());
        getCommand("sethome").setExecutor(new SetHomeCommands());

        path = getDataFolder().toString() + File.separator;
        File configDirectory = new File(path);

        if(!configDirectory.exists()){
            configDirectory.mkdir();
        }
    }
}
