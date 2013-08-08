package mods.minecraft.darth.canada.block;

import java.util.Random;

import net.minecraft.block.BlockLog;

import mods.minecraft.darth.canada.CanadiaMod;
import mods.minecraft.darth.canada.lib.BlockIDs;
import mods.minecraft.darth.canada.lib.Strings;

public class BlockMapleLog extends BlockLog
{

    protected BlockMapleLog(int id)
    {
        super(id);
        this.setCreativeTab(CanadiaMod.tabCanadia)
            .setUnlocalizedName(Strings.MAPLE_LOG_NAME)
            .setHardness(4F)
            .setStepSound(soundWoodFootstep);
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return BlockIDs.MAPLE_LOG;
    }

}
