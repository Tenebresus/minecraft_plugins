package nl.tenebresus.bedwars;

import com.destroystokyo.paper.event.block.BlockDestroyEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Bed implements Listener {

    @EventHandler
    public static void onBedDestroy(BlockDestroyEvent e) {

        if (e.getBlock().getType().equals(Material.RED_BED)) {

            Bukkit.broadcastMessage("BED IS DESTROYED!");

        }

    }

}
