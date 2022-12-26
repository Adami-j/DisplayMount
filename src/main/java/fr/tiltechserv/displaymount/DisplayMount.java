package fr.tiltechserv.displaymount;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisplayMount extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info(ChatColor.GREEN+"enable");
        Bukkit.getPluginManager().registerEvents(new DisplaySmelterListener(), this);
        getCommand("warptool").setExecutor(new TestClassTest(this));
        getCommand("infolvl").setExecutor(new TestClassTest(this));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
