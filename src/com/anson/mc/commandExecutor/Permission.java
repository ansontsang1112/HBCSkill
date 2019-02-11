package com.anson.mc.commandExecutor;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

class Permission {
    static boolean checkPerm(Player player, String string) {
        if(!player.hasPermission(string)) {
            player.sendMessage(ChatColor.RED + "You do not have enough Permission to perform that !");
            return false;
        }
        return true;
    }
}
