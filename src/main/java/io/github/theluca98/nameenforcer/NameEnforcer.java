package io.github.theluca98.nameenforcer;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.regex.Pattern;

public final class NameEnforcer extends JavaPlugin implements Listener {

    private static final Pattern ENFORCED_PATTERN = Pattern.compile("\\w+");
    private static final String KICK_MSG = "Your username contains illegal characters.\n" +
            "If this is a mistake, please contact the server admin.";

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onLogin(AsyncPlayerPreLoginEvent e) {
        if (!ENFORCED_PATTERN.matcher(e.getName()).matches()) {
            e.disallow(Result.KICK_OTHER, KICK_MSG);
            getLogger().warning("A user with an illegal name was blocked: " + e.getName());
        }
    }

}
