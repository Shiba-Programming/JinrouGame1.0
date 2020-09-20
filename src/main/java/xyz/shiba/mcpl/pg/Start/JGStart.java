package xyz.shiba.mcpl.pg.Start;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class JGStart implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.isOp()) {
            sender.sendMessage(ChatColor.RED + "権限が無いためコマンドを実行できませんでした");
            return true;
        }
        Start start = new Start();
        Start.setCountdown(10);
        sender.sendMessage(ChatColor.YELLOW + "ゲームは15秒後に開始されます");
        Start.lock = false;
        return true;
    }
}
