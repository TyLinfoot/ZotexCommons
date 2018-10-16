package net.zotex.zotexcommons;

import net.zotex.zotexcommons.commands.FlyingCommand;
import net.zotex.zotexcommons.commands.HelpCommand;
import net.zotex.zotexcommons.commands.NightvisionCommand;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ZotexCommons extends JavaPlugin implements Listener {

    private static ZotexCommons instance;

    @Override
    public void onEnable() {

        setInstance(this);
        System.out.println("The ZotexCommons plugin has been loaded.");

        saveDefaultConfig();

        getCommand("help").setExecutor(new HelpCommand(this));
        getCommand("nightvision").setExecutor((CommandExecutor) new NightvisionCommand(this));
        getCommand("flying").setExecutor((CommandExecutor) new FlyingCommand(this));


    }

    public static ZotexCommons getInstance() {
        return instance;
    }

    public static void setInstance(ZotexCommons instance) {
        instance = instance;
    }
}
