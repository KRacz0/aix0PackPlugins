package com.aix0.clickablemessage.listener;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        TextComponent healtext = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&4Click to creative"));
        healtext.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/gamemode creative"));
        healtext.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(ChatColor.translateAlternateColorCodes('&', "Kliknij aby dostac tryb kreatywny"))));
        e.getPlayer().spigot().sendMessage(healtext);

        TextComponent healtext2 = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&4Click to survival"));
        healtext2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/gamemode survival"));
        healtext2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(ChatColor.translateAlternateColorCodes('&', "Kliknij aby tryb przetrwania"))));
        e.getPlayer().spigot().sendMessage(healtext2);
    }
}
