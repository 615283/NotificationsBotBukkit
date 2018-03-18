package com.georlegacy.general.notificationsbotbukkit.commands;

import com.georlegacy.general.notificationsbotbukkit.App;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DisableBot implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        App.disableBot();
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d[&5NotificationsBot&d] &eBot has been shutdown"));
        return true;
    }
}
