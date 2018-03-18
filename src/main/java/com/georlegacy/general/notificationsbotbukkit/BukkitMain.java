package com.georlegacy.general.notificationsbotbukkit;

import com.georlegacy.general.notificationsbotbukkit.commands.DisableBot;
import com.georlegacy.general.notificationsbotbukkit.commands.EnableBot;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public class BukkitMain extends JavaPlugin {

    public void onEnable() {
        getCommand("disablenotificationsbot").setExecutor(new DisableBot());
        getCommand("enablenotificationsbot").setExecutor(new EnableBot());

        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }

        try {
            App.main();
        } catch (LoginException e) {
            getLogger().warning("JDA Login exception");
            e.printStackTrace();
        } catch (InterruptedException e) {
            getLogger().severe("JDA InterruptedException");
            e.printStackTrace();
        }
    }

    public void onDisable() {
        App.disableBot();
        getLogger().info("JDA bot has been shutdown");
    }

}
