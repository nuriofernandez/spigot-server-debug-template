package me.nurio.minecraft.spigottemplate;

import lombok.Getter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotTemplate extends JavaPlugin {

    @Getter private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
    }

}
