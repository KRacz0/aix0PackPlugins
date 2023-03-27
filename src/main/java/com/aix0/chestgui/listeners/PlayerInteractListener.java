package com.aix0.chestgui.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerInteractListener implements Listener {

    @EventHandler
    private void onPlayerRightClick(PlayerInteractEvent e){
        if(e.getItem() != null && e.getItem() != null){
            if(e.getItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&5Menu"))){
                Inventory menu = Bukkit.createInventory(e.getPlayer(), 27, ChatColor.translateAlternateColorCodes('&', "&5Menu"));

                ItemStack barrier = new ItemStack(Material.BARRIER);
                ItemMeta barrierMeta = barrier.getItemMeta();
                barrierMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cZAMKNIJ"));
                barrier.setItemMeta(barrierMeta);

                menu.setItem(0, barrier);

                ItemStack redWool = new ItemStack(Material.RED_WOOL);
                ItemMeta redWoolMeta = redWool.getItemMeta();
                redWoolMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4ULECZ"));
                redWool.setItemMeta(redWoolMeta);

                menu.setItem(10, redWool);

                ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta diamondSwordMeta = diamondSword.getItemMeta();
                diamondSwordMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cZGIN"));
                diamondSword.setItemMeta(diamondSwordMeta);

                menu.setItem(14, diamondSword);

                e.getPlayer().openInventory(menu);
            }
        }
    }
}
