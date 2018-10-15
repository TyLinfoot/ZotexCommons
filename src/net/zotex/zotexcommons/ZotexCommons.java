package net.zotex.zotexcommons;

import net.zotex.zotexcommons.commands.HelpCommand;
import net.zotex.zotexcommons.commands.NightvisionCommand;
import net.zotex.zotexcommons.commands.GamemodeCommand;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ZotexCommons extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("The ZotexCommons plugin has been loaded.");

        saveDefaultConfig();

        getCommand("help").setExecutor(new HelpCommand(this));
        getCommand("nightvision").setExecutor((CommandExecutor) new NightvisionCommand(this));
        getCommand("gamemode").setExecutor(new GamemodeCommand(this);

    }
}
