package net.xornick.xorskript;

import org.bukkit.plugin.java.JavaPlugin;

public final class XorSkript extends JavaPlugin {

    private static XorSkript instance;

    @Override
    public void onEnable() {
        instance = this;
    }
}
