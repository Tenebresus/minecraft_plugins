package nl.tenebresus.bedwars;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BedWars extends JavaPlugin {

    public enum States {

        STARTED ,
        STOPPED

    }

    public static States state = States.STOPPED;

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new Bed(), this);
        Bukkit.getCommandMap().register("", new bedwarsCommand("bedwars"));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
