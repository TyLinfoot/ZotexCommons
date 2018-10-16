package net.zotex.zotexcommons.commands;

import net.zotex.zotexcommons.ZotexCommons;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class NightvisionCommand implements CommandExecutor {

    private ZotexCommons plugin;
    public NightvisionCommand(ZotexCommons plugin) {
        this.plugin = plugin;
    }

    public ArrayList<String> nightvision = new ArrayList();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return true;
        }
        Player p = (Player) sender;
        if (!p.hasPermission("nightvision.use")) {
            p.sendMessage(this.plugin.getConfig().getString("no_perms"));
            return true;
        }
        if (this.nightvision.contains(p.getName())) {
            this.nightvision.remove(p.getName());
            p.removePotionEffect(PotionEffectType.NIGHT_VISION);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l<!> &7Nightvision has been &cdisabled&7!"));
        } else {
            this.nightvision.add(p.getName());
            p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999999, 1));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&l<!> &7Nightvision has been &aenabled&7!"));
        }


        return false;
    }
}
