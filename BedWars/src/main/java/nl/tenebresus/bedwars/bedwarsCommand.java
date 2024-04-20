package nl.tenebresus.bedwars;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class bedwarsCommand extends Command {

    protected bedwarsCommand(@NotNull String name) {
        super(name);
    }

    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {

        switch (strings[0]) {

            case "start":

                if (BedWars.state == BedWars.States.STARTED) {
                    commandSender.sendMessage("bedwars has already been started!");
                    break;
                }

                BedWars.state = BedWars.States.STARTED;
                Bukkit.broadcastMessage(ChatColor.GREEN + "Bedwars has been started!");
                break;

            case "stop":

                if (BedWars.state == BedWars.States.STOPPED) {
                    commandSender.sendMessage("bedwars is not running!");
                    break;
                }

                BedWars.state = BedWars.States.STOPPED;
                Bukkit.broadcastMessage(ChatColor.RED + "Bedwars has been stopped!");
                break;

            default:
                commandSender.sendMessage(ChatColor.RED + strings[0] + " is not a valid option!");
                break;

        }

        return false;
    }
}
