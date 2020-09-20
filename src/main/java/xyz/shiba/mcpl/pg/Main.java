package xyz.shiba.mcpl.pg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.shiba.mcpl.pg.Admin.AdminsChatProfix;
import xyz.shiba.mcpl.pg.Start.JGStart;
import xyz.shiba.mcpl.pg.Start.Start;

public class Main extends JavaPlugin {

    public void onEnable() {

        getLogger().info("プラグインを起動しました");

        //クラス継承？
        getServer().getPluginManager().registerEvents(new AdminsChatProfix(this),this);

        //コマンドクラス
        Bukkit.getPluginCommand("gjstart").setExecutor(new JGStart());

    }

    public void onDisable() {

        getLogger().info("プラグインを終了しました");


    }
}
