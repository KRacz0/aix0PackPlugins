package com.aix0.custommessage.events;

import com.aix0.custommessage.CustomMessage;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerQuitEvent implements Listener {

    private final CustomMessage plugin = CustomMessage.getPlugin(CustomMessage.class);

    @EventHandler
    private void PlayerQuitEvent(org.bukkit.event.player.PlayerQuitEvent e){
        e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("on-quit").replace("{PLAYER}", e.getPlayer().getDisplayName())));

    }
}
