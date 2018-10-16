package net.zotex.zotexcommons;

import net.zotex.zotexcommons.commands.FlyingCommand;
import net.zotex.zotexcommons.commands.HelpCommand;
import net.zotex.zotexcommons.commands.NightvisionCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ZotexCommons extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("The ZotexCommons plugin has been loaded!");

        saveDefaultConfig();

        getCommand("help").setExecutor(new HelpCommand(this));
        getCommand("flying").setExecutor(new FlyingCommand(this));
        getCommand("nightvision").setExecutor(new NightvisionCommand(this));
    }
}