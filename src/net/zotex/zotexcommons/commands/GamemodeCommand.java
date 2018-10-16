package net.zotex.zotexcommons.commands;

import net.zotex.zotexcommons.ZotexCommons;
import net.zotex.zotexcommons.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    private ZotexCommons plugin;

    public GamemodeCommand(ZotexCommons plugin) {
        this.plugin = plugin;
    }

    String GamemodeMessage = Utils.getMessage("Gamemode-message");

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("zotexcommons.gamemode")) {

                if (args[0].equalsIgnoreCase("c")) {  // Creative Command
                    p.setGameMode(GameMode.CREATIVE);
                    String GamemodeCMessage = GamemodeMessage.replace("{GAMEMODE}", "Creative");
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', GamemodeCMessage));

                } else if (args[0].equalsIgnoreCase("s")) { // Survival Command
                    p.setGameMode(GameMode.SURVIVAL);
                    String GamemodeSMessage = GamemodeMessage.replace("{GAMEMODE", "Survival");
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', GamemodeSMessage));

                } else if (args[0].equalsIgnoreCase("sp")) { // Spectator Command
                    p.setGameMode(GameMode.SPECTATOR);
                    String GamemodeSPMessage = GamemodeMessage.replace("{GAMEMODE}", "Spectator");
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', GamemodeSPMessage));
                }
            }
        }
        return false;
    }
}


