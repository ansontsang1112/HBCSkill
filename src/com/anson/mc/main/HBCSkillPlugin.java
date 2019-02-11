package com.anson.mc.main;

import com.anson.mc.commandExecutor.SaiyanCommandExecutor;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class HBCSkillPlugin extends JavaPlugin {
    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        ConsoleCommandSender sender = this.getServer().getConsoleSender();
        sender.sendMessage(ChatColor.GREEN + "Plugin is successfully loaded !");
        this.getLogger().info("HiByeCraft Skill Plugin Successfully loaded !");
        this.getCommand("saiyan").setExecutor(new SaiyanCommandExecutor());
    }

    @Override
    public void onDisable() {

    }
}