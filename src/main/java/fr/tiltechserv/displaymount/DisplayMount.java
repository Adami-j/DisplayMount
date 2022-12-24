package fr.tiltechserv.displaymount;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.security.Permission;
import java.util.concurrent.Executor;

public final class DisplayMount extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info(ChatColor.GREEN+"enable");
        getCommand("testss").setExecutor(new TestClassTest());
        Bukkit.getPluginManager().registerEvents(new DisplaySmelterListener(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
