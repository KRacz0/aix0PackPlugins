package com.aix0.chestgui.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerJoinListener implements Listener {

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent e){
        ItemStack compass = new ItemStack(Material.COMPASS);
        ItemMeta compassMeta = compass.getItemMeta();
        compassMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&5Menu"));
        compass.setItemMeta(compassMeta);

        if(!e.getPlayer().getInventory().contains(compass)){
            e.getPlayer().getInventory().addItem(compass);
        }
    }
}
