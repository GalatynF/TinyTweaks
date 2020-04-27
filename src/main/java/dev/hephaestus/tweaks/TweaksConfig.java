package dev.hephaestus.tweaks;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "tinytweaks")
@Config.Gui.Background("minecraft:textures/block/hay_block_side.png")
public class TweaksConfig implements ConfigData {
    // - Plants! --------------------------------------------------------------
    @ConfigEntry.Category("plants")
    @ConfigEntry.Gui.Tooltip
    public boolean easyHarvestCrops = true;

    @ConfigEntry.Category("plants")
    @ConfigEntry.Gui.Tooltip(count = 2)
    public boolean easyHarvestSugarcane = true;

    @ConfigEntry.Category("plants")
    @ConfigEntry.Gui.Tooltip
    public boolean saplingsAutoPlant = true;

    @ConfigEntry.Category("plants")
    @ConfigEntry.Gui.CollapsibleObject
    public Rejuvenation rejuvenation = new Rejuvenation();

    @ConfigEntry.Category("plants")
    public boolean passableLeaves = true;

    @ConfigEntry.Category("plants")
    @ConfigEntry.Gui.Tooltip(count = 2)
    public boolean betterLilyPads = true;

    @ConfigEntry.Category("plants")
    @ConfigEntry.Gui.Tooltip
    public boolean farmerVillagerAutomation = true;

    // - Animals! -------------------------------------------------------------
    @ConfigEntry.Category("animals")
    @ConfigEntry.Gui.Tooltip
    public boolean animalsEatOffGround = true;

    @ConfigEntry.Category("animals")
    @ConfigEntry.Gui.Tooltip
    public boolean breedWildWolves = true;

    // - Miscellaneous! -------------------------------------------------------
    @ConfigEntry.Category("misc")
    @ConfigEntry.Gui.CollapsibleObject
    public FlintAndSteelConfig flintAndSteel = new FlintAndSteelConfig();

    @ConfigEntry.Category("misc")
    @ConfigEntry.Gui.Tooltip(count = 2)
    public boolean lanternBlastResistance = true;

    @ConfigEntry.Category("debug")
    public boolean grassDestroysRedstoneTorches = false;

    public static class Rejuvenation {
        @ConfigEntry.Gui.Tooltip
        public boolean enabled = true;

        @ConfigEntry.Gui.Tooltip(count = 2)
        public float longGrass = 0.01f;

        @ConfigEntry.Gui.Tooltip
        public boolean saplings = true;
    }

    public static class FlintAndSteelConfig {
        @ConfigEntry.Gui.Tooltip
        public boolean enabled = true;
        public int burnTime = 3;
    }
}