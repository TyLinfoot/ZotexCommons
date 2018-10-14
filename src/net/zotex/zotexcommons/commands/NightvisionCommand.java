package net.zotex.zotexcommons.commands;

import net.zotex.zotexcommons.ZotexCommons;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class NightvisionCommand {

    private ZotexCommons plugin;
    public NightvisionCommand(ZotexCommons plugin) {
        this.plugin = plugin;
    }

    public ArrayList<String> nightvision = new ArrayList();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)) {
            return true;
        }
        Player p = (Player)sender;
        if(!p.hasPermission(""))

        return false;
    }

}
