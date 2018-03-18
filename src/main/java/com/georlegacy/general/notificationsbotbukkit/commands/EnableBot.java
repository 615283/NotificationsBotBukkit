package com.georlegacy.general.notificationsbotbukkit.commands;

import com.georlegacy.general.notificationsbotbukkit.App;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.security.auth.login.LoginException;

public class EnableBot implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        try {
            App.main();
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d[&5NotificationsBot&d] &eBot has been started"));
        } catch (LoginException e) {
            e.printStackTrace();
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d[&5NotificationsBot&d] &eBot failed to start: LoginException - see console for details"));
        } catch (InterruptedException e) {
            e.printStackTrace();
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d[&5NotificationsBot&d] &eBot failed to start: InterruptedException - see console for details"));
        }
        return true;
    }
}
