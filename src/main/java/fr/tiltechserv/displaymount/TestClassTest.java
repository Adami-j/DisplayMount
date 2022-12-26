package fr.tiltechserv.displaymount;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class TestClassTest implements CommandExecutor {

    private final DisplayMount plugin;
    public TestClassTest(DisplayMount displayMount) {
        this.plugin = displayMount;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("warptool")){
            PlayerInventory playerInventory = player.getInventory();
            ItemStack itemStack = new ItemStack(Material.COMPASS);
            ItemMeta itemMeta =itemStack.getItemMeta();
            List<String> mainCompas = new ArrayList<String>();
            mainCompas.add("mainCompas");
            itemMeta.setLore(mainCompas);
            itemStack.setItemMeta(itemMeta);
            playerInventory.addItem(itemStack);

            System.out.println(commandSender+" "+command+" "+strings);

            return true;
        }
        System.out.println(command.getName());
        if(command.getName().equalsIgnoreCase("infolvl")){

            player.sendMessage(ChatColor.GREEN+player.getName()+": tu es "+""+" niveau "+""+" tu as "+""+" gold sur ton compte bancaire");
            return true;
        }
            return false;

    }

}
