package nl.tenebresus.fking_around;

import com.destroystokyo.paper.event.block.BlockDestroyEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class OnLeafBreak implements Listener {

    @EventHandler
    public void onConjurLightning(EntityDamageByEntityEvent e) {

        Entity injuredPlayer = e.getEntity();

        injuredPlayer.setVelocity(injuredPlayer.getVelocity().add(new Vector(0, injuredPlayer.getVelocity().getY() + 5F, 0)));

    }
}
