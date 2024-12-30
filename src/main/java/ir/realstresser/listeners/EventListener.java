package ir.realstresser.listeners;


import ir.realstresser.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class EventListener implements Listener, PluginMessageListener {

    @Override
    public void onPluginMessageReceived(String s, Player player, byte[] bytes) {
        return;
    }
}
