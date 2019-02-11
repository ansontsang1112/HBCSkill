package com.anson.mc.commandExecutor;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SaiyanCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if(!(commandSender instanceof Player)) {
            commandSender.sendMessage("You are not a player, so you cannot be a Saiyan !");
            return false;
        }

        if(!commandSender.hasPermission("hbc.skill.saiyan")) {
            commandSender.sendMessage("You do not have enough permission to do that");
            return false;
        }

        if(strings.length <= 0) {
            commandSender.sendMessage("Invalid Arguments, " + strings.length + " do not enough arguments.");
            return false;
        }

        switch(strings[0]) {
            case "SSJ":
                String permSSJ = "hbc.skill.saiyan.SSJ";
                if(!Permission.checkPerm(player, permSSJ)) return false;
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10240, 10));
                player.sendMessage(ChatColor.AQUA + "You have changed to Super Saiyan 1");
                return true;
            case "SSJB":
                String permSSJB = "hbc.skill.saiyan.SSJB";
                if(!Permission.checkPerm(player, permSSJB)) return false;
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10240, 100));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10240, 100));
                player.sendMessage(ChatColor.AQUA + "You have changed to Super Saiyan Blue");
                return true;
            default:
                player.sendMessage("Invalid Arguments.");
                return false;
        }
    }
}
