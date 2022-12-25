package fr.tiltechserv.displaymount;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.security.Permission;
import java.util.concurrent.Executor;

public final class DisplayMount extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info(ChatColor.GREEN+"enable");
        Bukkit.getPluginManager().registerEvents(new DisplaySmelterListener(), this);
        getCommand("warptool").setExecutor(new TestClassTest(this));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
