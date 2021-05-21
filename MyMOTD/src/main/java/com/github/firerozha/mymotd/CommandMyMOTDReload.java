package com.github.firerozha.mymotd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandMyMOTDReload implements CommandExecutor {

    private MyMOTD plugin;

    public CommandMyMOTDReload(MyMOTD plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("mymotd.reload")) {
            sender.sendMessage("The config file has been reloaded!");
            plugin.reloadConfig();
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("noperm")));
        }




        return true;
    }
}
