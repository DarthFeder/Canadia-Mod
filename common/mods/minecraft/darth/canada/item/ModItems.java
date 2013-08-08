package mods.minecraft.darth.canada.item;

import mods.minecraft.darth.canada.CanadiaMod;
import mods.minecraft.darth.canada.lib.ItemIDs;
import mods.minecraft.darth.canada.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

public class ModItems
{

    public static Item mapleSyrup;
    public static Item hockeyStick;
    public static Item hockeyPuck;
    public static Item canadianAxe;
    
    public static EnumToolMaterial CANADA_TOOL = EnumHelper.addToolMaterial("CANADIA_TOOL", 1, 50, 4.0F, 2F, 5);
    
    public static void init()
    {
        mapleSyrup = new ItemCanada(ItemIDs.MAPLE_SYRUP).setUnlocalizedName(Strings.MAPLE_SYRUP_NAME).setCreativeTab(CanadiaMod.tabCanadia);
        hockeyStick = new ItemCanada(ItemIDs.HOCKEY_STICK).setUnlocalizedName(Strings.HOCKEY_STICK_NAME).setCreativeTab(CanadiaMod.tabCanadia);
        hockeyPuck = new ItemCanada(ItemIDs.HOCKEY_PUCK).setUnlocalizedName(Strings.HOCKEY_PUCK_NAME).setCreativeTab(CanadiaMod.tabCanadia);
        canadianAxe = new ItemCanadianAxe(ItemIDs.CANADIAN_AXE, CANADA_TOOL);
        
        registry();
    }
    
    private static void registry()
    {
        MinecraftForge.setToolClass(canadianAxe, "axe", 20);
    }
    
}
