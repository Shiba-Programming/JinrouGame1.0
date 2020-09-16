package xyz.shiba.mcpl.pg.Admin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import xyz.shiba.mcpl.pg.Main;

public class AdminsChatProfix implements Listener {

    private Main plugin;
    public AdminsChatProfix(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChatProfix(AsyncPlayerChatEvent e){

        e.setCancelled(true);

        if (e.getPlayer().isOp()) {
            //OPの場合
            Bukkit.broadcastMessage(ChatColor.GOLD  + "[運営] " + ChatColor.WHITE + e.getPlayer().getName() + ": " + e.getMessage());
        } else
            //OPじゃない場合
            Bukkit.broadcastMessage(e.getPlayer().getName() + " : " + e.getMessage());
    }
}
