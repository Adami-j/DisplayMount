package fr.tiltechserv.displaymount;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;

import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public class DisplaySmelterListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage("coucou nouveau");
        Bukkit.getLogger().info(ChatColor.GREEN+"enable");
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        Action action = e.getAction();
        ItemStack it = e.getItem();

        if(it!=null && it.getType() == Material.COMPASS && action == Action.RIGHT_CLICK_AIR){

            Inventory gui = Bukkit.getServer().createInventory(player, 27, "test");
            ItemStack bousole1= new ItemStack(Material.COMPASS);
            bousole1.setAmount(1);
            ItemMeta itemMeta = (ItemMeta) bousole1.getItemMeta();
            bousole1.setItemMeta(itemMeta);
            ItemStack bousole2= new ItemStack(Material.COMPASS);
            bousole1.setAmount(1);
            ItemStack bousole3= new ItemStack(Material.COMPASS);
            bousole1.setAmount(1);
            ItemStack bousole4= new ItemStack(Material.COMPASS);

            bousole1.setAmount(1);
            gui.addItem(bousole1,bousole2,bousole3,bousole4);
            player.openInventory(gui);
        }

    }

}
