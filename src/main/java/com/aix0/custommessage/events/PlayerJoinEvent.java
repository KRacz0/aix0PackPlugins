package com.aix0.custommessage.events;

import com.aix0.custommessage.CustomMessage;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {

    private final CustomMessage plugin = CustomMessage.getPlugin(CustomMessage.class);

    @EventHandler
    private void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e){
        // Używanie z configu === e.setJoinMessage(plugin.getConfig().getString("on-join").replace("{PLAYER}", e.getPlayer().getDisplayName()));
        //Uzywanie z configu z kolorami:
        e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("on-join").replace("{PLAYER}", e.getPlayer().getDisplayName())));

    }
}

