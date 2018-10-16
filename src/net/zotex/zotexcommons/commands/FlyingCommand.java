package net.zotex.zotexcommons.commands;

import net.zotex.zotexcommons.ZotexCommons;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyingCommand implements CommandExecutor {

    private ZotexCommons plugin;
    public FlyingCommand(ZotexCommons plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        String noperm = this.plugin.getConfig().getString("no_perms");

        if (!sender.hasPermission("flying.check")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noperm));
            return true;
        }
        if (args.length == 1) {
            Player p = Bukkit.getServer().getPlayer(args[0]);
            if (p == null) {
                sender.sendMessage(ChatColor.RED + args[0] + "is not online!");
                return true;
            }
            sender.sendMessage("§b" + p.getName() + (p.isFlying() ? " §bis currently flying" : " §bis not currently flying!"));
            sender.sendMessage("§b" + p.getName() + (p.hasPermission("essentials.fly") ? " §bhas permission to fly!" : "§bdoes not have permission to fly!"));
            return false;

        }

        sender.sendMessage("§c§l<!> §r§cUsage: /flying (player)");

        return false;
    }
}