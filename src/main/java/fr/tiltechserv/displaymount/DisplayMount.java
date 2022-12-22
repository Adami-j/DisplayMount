package fr.tiltechserv.displaymount;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.security.Permission;

public final class DisplayMount extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info(ChatColor.GREEN+"enable");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
