package com.gauntletperformancetracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("GauntletPerformanceTracker")
public interface GauntletPerformanceTrackerConfig extends Config
{
    @ConfigItem(
            keyName = "hideOverlayDuringFight",
            name = "Hide overlay during Hunllef",
            description = "Should the overlay be hidden during the Hunllef fight",
            position = 0
    )
    default boolean hideOverlayDuringFight()
    {
        return false;
    }

    @ConfigItem(
            keyName = "countNoWeaponOffPrayer",
            name = "Count no weapon off prayer",
            description = "Should an attack without a weapon be counted as wrong offensive prayer if no melee prayer was active",
            position = 1
    )
    default boolean countNoWeaponOffPrayer()
    {
        return false;
    }
    @ConfigItem(
            keyName = "saveResultsToFile",
            name = "Save results to a file",
            description = "Save each run to a timestamped file",
            position = 2
    )
    default boolean saveResultsToFile()
    {
        return false;
    }
}
