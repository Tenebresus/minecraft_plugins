package nl.tenebresus.fking_around;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fking_around extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new OnLeafBreak(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
