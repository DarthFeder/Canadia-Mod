package mods.minecraft.darth.canada.item;

import mods.minecraft.darth.canada.CanadiaMod;
import mods.minecraft.darth.canada.lib.ItemIDs;
import mods.minecraft.darth.canada.lib.Strings;
import net.minecraft.item.Item;

public class ModItems
{

    public static Item mapleSyrup;
    public static Item hockeyStick;
    public static Item hockeyPuck;
    
    public static void init()
    {
        mapleSyrup = new ItemCanada(ItemIDs.MAPLE_SYRUP).setUnlocalizedName(Strings.MAPLE_SYRUP_NAME).setCreativeTab(CanadiaMod.tabCanadia);
        hockeyStick = new ItemCanada(ItemIDs.HOCKEY_STICK).setUnlocalizedName(Strings.HOCKEY_STICK_NAME).setCreativeTab(CanadiaMod.tabCanadia);
        hockeyPuck = new ItemCanada(ItemIDs.HOCKEY_PUCK).setUnlocalizedName(Strings.HOCKEY_PUCK_NAME).setCreativeTab(CanadiaMod.tabCanadia);
    }
    
}
