package com.github.ndrp.fasterminecarts.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "faster-minecarts")
public class FasterMinecartsConfig implements ConfigData {

    @ConfigEntry.Gui.Excluded
    public double slowSpeed = 0.3;

    @ConfigEntry.Gui.Tooltip(count = 2)
    @ConfigEntry.Category("default")
    public boolean automaticMinecartSlowDown = true;

    @ConfigEntry.Gui.Tooltip()
    @ConfigEntry.BoundedDiscrete(max = 12)
    @ConfigEntry.Category("default")
    public int maxSpeed = 8;
}
