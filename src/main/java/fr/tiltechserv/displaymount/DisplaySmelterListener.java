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

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;
import java.util.List;

public class DisplaySmelterListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();



    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        Action action = e.getAction();
        ItemStack it = e.getItem();

        if(it!=null && it.getType() == Material.COMPASS && action == Action.RIGHT_CLICK_AIR ){

            Inventory gui = Bukkit.getServer().createInventory(player, 9, "Main");



            List<String> listeMeta = new ArrayList<>();
           listeMeta.add("spawn");
           listeMeta.add("jeux");
           listeMeta.add("building");

            for(String s : listeMeta){
                ItemStack bousole1= new ItemStack(Material.COMPASS);
                ItemMeta itemMeta = (ItemMeta) bousole1.getItemMeta();
                List<String> listTmp = new ArrayList<>();
                listTmp.add(s);
                itemMeta.setLore(listTmp);
                bousole1.setItemMeta(itemMeta);
                gui.addItem(bousole1);
            }
            player.openInventory(gui);


        }

    }

    @EventHandler
    public void onBoussoleOpen(InventoryClickEvent event) {

        if(event!=null&& event.getClick().isLeftClick()&&event.getCurrentItem()!=null&&event.getCurrentItem().getItemMeta()!=null &&event.getCurrentItem().getItemMeta().getAsString()!=null){
            switch (event.getCurrentItem().getItemMeta().getLore().toString()){
                case "[spawn]" :
                    System.out.println("spawn");
                    break;
                case "[jeux]" :
                    System.out.println("jeux");
                    break;
                case "[building]" :
                    System.out.println("building");
                    break;
                default:
                    System.out.println("marche po");
                    break;
            }
        }

    }
    }




