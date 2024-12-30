package ir.realstresser;

import ir.realstresser.commands.BanCommand;
import ir.realstresser.commands.KickCommand;
import ir.realstresser.commands.MuteCommand;
import ir.realstresser.listeners.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instance;
    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getServer().getMessenger().registerOutgoingPluginChannel(this, "xenonban:channel");
        getServer().getMessenger().registerIncomingPluginChannel(this, "xenonban:channel", new EventListener());
        getCommand("ban").setExecutor(new BanCommand());
        getCommand("kick").setExecutor(new KickCommand());
        getCommand("mute").setExecutor(new MuteCommand());
    }

    @Override
    public void onDisable() {}
}
