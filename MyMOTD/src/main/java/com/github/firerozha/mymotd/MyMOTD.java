package com.github.firerozha.mymotd;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyMOTD extends JavaPlugin {

    @Override
    public void onEnable() {
            // commannds
            getCommand("mymotdreload").setExecutor(new CommandMyMOTDReload(this));


            // events
            Bukkit.getServer().getPluginManager().registerEvents(new ServerListPing(this), this);


            // config
            getConfig().options().copyDefaults();
            saveDefaultConfig();

    }

}
