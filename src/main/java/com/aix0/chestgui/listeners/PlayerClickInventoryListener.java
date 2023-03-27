package com.aix0.chestgui.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerClickInventoryListener implements Listener {

    @EventHandler
    private void onItemInventoryClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', "&5Menu"))){
            e.setCancelled(true);
            if(e.getCurrentItem() != null){
                if(e.getRawSlot() == 0){
                    player.closeInventory();
                } else if (e.getRawSlot() == 10){
                    player.setHealth(20);
                } else if(e.getRawSlot() == 14){
                    player.setHealth(0);
                }
            }
        }
    }
}
