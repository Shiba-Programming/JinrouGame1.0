package xyz.shiba.mcpl.pg;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.shiba.mcpl.pg.Admin.AdminsChatProfix;

public class Main extends JavaPlugin {

    public void onEnable() {

        getLogger().info("プラグインを起動しました");

        getServer().getPluginManager().registerEvents(new AdminsChatProfix(this),this);
        getServer().getPluginManager().registerEvents(new AdminsChatProfix(this),this);

    }

    public void onDisable() {

        getLogger().info("プラグインを終了しました");


    }
}
