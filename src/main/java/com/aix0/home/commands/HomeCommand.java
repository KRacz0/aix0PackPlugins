package com.aix0.home.commands;

import com.aix0.home.Home;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


import java.io.File;


public class HomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Konsola nie moze tego wykonac"));
            return false;
        }

        if(command.getName().equalsIgnoreCase("home")) {
            if (!sender.hasPermission("home.teleport") || !sender.hasPermission("home.*")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNie masz permisji."));
                return false;
            }

            if (args.length != 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Nie poprawny argument"));
                return false;
            }

            Player player = ((Player) sender);
            String UUID = player.getUniqueId().toString();

            File playerConfigFIle = new File(Home.path + UUID + ".yml");

            if (!playerConfigFIle.exists()) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNie posiadasz home'a"));
                return false;
            }

            YamlConfiguration playerConfig = YamlConfiguration.loadConfiguration(playerConfigFIle);
            double yaw = playerConfig.getDouble("yaw");
            double pitch = playerConfig.getDouble("pitch");

            double x = playerConfig.getDouble("x");
            double y = playerConfig.getDouble("y");
            double z = playerConfig.getDouble("z");

            String worldName = playerConfig.getString("world");
            World world = Bukkit.getWorld(worldName);

            Location playerHomeLocation = new Location(world, x, y, z, (float) yaw, (float) pitch);
            player.teleport(playerHomeLocation);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&ePomyslnie przeteleportowano do domu"));

            return true;
        }
            return false;
    }
}
