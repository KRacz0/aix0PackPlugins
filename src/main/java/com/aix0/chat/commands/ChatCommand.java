package com.aix0.chat.commands;

import com.aix0.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1) {
            if(args[0].equalsIgnoreCase("on")){
                if(!sender.hasPermission("chat.on") || !sender.hasPermission("*")){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNie masz permisji." ));
                    return false;
                }

                if(Chat.chatEnabled){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cChat jest już &3wlaczony"));
                    return false;
                } else {
                    Chat.chatEnabled = true;
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Chat Został &3wlaczony"));
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&7Chat Został włączony przez " + sender.getName()));
                    return true;
                }


            } else if (args[0].equalsIgnoreCase("off") ){
                if(!sender.hasPermission("chat.off") || !sender.hasPermission("*")){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNie masz permisji." ));
                    return false;
                }


                if(Chat.chatEnabled){
                    Chat.chatEnabled = false;
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Chat Został &4wylaczony"));
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&7Chat Został &4wylaczony przez " + sender.getName()));
                    return true;
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Chat juz jest &cwylaczony"));
                    return false;
                }

            } else if(args[0].equalsIgnoreCase("clear")){
                if(!sender.hasPermission("chat.clear") || !sender.hasPermission("*")){
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNie masz permisji." ));
                    return false;
                }
                for(int i = 0; i < 100; i++){
                    Bukkit.broadcastMessage("");
            }
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&7Chat został &bwyczyszczony przez " + sender.getName()));
                return true;
            }
        }
        return false;
    }
}
