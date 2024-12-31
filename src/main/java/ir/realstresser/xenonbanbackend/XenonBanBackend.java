package ir.realstresser.xenonbanbackend;

import ir.realstresser.xenonbanbackend.commands.BanCommand;
import ir.realstresser.xenonbanbackend.commands.KickCommand;
import ir.realstresser.xenonbanbackend.commands.MuteCommand;
import ir.realstresser.xenonbanbackend.listeners.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

public class XenonBanBackend extends JavaPlugin {
    public static XenonBanBackend instance;
    @Override
    public void onEnable() {
        instance = this;
        System.out.println("======================================================================");
        System.out.println("Starting up Xenon Ban Backend, make sure that proxy is running!");
        System.out.println("======================================================================");
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
