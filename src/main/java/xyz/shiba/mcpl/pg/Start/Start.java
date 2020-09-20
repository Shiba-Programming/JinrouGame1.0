package xyz.shiba.mcpl.pg.Start;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Start extends BukkitRunnable{
    public static int countdown = 15;
    public static boolean lock = true;

    @Override
    public void run() {
        if (Bukkit.getOnlinePlayers().size() <= 0){
            countdown = 10;
            this.cancel();
            return;
        }
        if (countdown == 0) {
            Bukkit.broadcastMessage(ChatColor.YELLOW + "ゲーム開始");
        }
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (countdown != 0) {
                player.playSound(player.getLocation(), Sound.ENDERDRAGON_GROWL,1,1);
                player.sendMessage(ChatColor.YELLOW + "ゲーム開始まで" + ChatColor.RED + countdown + ChatColor.YELLOW + "秒");
            }
            if (countdown == 0) {

            }
        }
        if (countdown == 0){

        }
    }
    public static void setCountdown(int countdown) {
        Start.countdown = countdown;
    }

}
