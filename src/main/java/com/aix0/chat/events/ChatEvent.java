package com.aix0.chat.events;

import com.aix0.chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

    @EventHandler
    private void onMessageSend(AsyncPlayerChatEvent e){
        if(!Chat.chatEnabled){
            if (!e.getPlayer().hasPermission("chat.*") || !e.getPlayer().hasPermission("chat.bypass")) {
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cChat jest aktualnie wylaczony!"));
                e.setCancelled(true);
            }
        }
    }

}
