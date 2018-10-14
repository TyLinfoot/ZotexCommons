package net.zotex.zotexcommons.commands;

import net.zotex.zotexcommons.ZotexCommons;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {

    private ZotexCommons plugin;
    public HelpCommand(ZotexCommons plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        for(String help_message1 : this.plugin.getConfig().getStringList("help")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', help_message1));
        }

        return false;
    }

}
