package net.zotex.zotexcommons.utils;

import net.zotex.zotexcommons.ZotexCommons;
import org.bukkit.ChatColor;

public class Utils {

    public static String color(String args) {
        return ChatColor.translateAlternateColorCodes('&', args);
    }

    public static String getMessage(String path) {
        return color(ZotexCommons.getInstance().getConfig().getString("messages." + path));
    }

}
