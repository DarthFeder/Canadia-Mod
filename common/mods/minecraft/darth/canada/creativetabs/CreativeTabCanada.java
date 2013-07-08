package mods.minecraft.darth.canada.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.minecraft.darth.canada.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabCanada extends CreativeTabs
{

    public CreativeTabCanada(String label)
    {
        super(label);
    }
    
    public CreativeTabCanada(int par1, String label)
    {
        super(par1, label);
    }

    @Override
    @SideOnly(Side.CLIENT)
    //Give item id of item to display as tab icon
    public int getTabIconItemIndex()
    {
        return Reference.CANADA_CREATIVE_TAB_ICON + 256;
    }
}
