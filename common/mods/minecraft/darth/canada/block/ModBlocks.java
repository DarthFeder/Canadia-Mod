package mods.minecraft.darth.canada.block;

import net.minecraft.block.Block;

import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.registry.GameRegistry;

import mods.minecraft.darth.canada.lib.BlockIDs;
import mods.minecraft.darth.canada.lib.Strings;

public class ModBlocks
{

    public static Block mapleLog;
    
    public static void init()
    {
        mapleLog = new BlockMapleLog(BlockIDs.MAPLE_LOG);
        
        harvests();
        registry();
    }
    
    private static void harvests()
    {
        MinecraftForge.setBlockHarvestLevel(mapleLog, "axe", 20);
    }
    
    private static void registry()
    {
        GameRegistry.registerBlock(mapleLog, Strings.MAPLE_LOG_NAME);
    }
    
}
