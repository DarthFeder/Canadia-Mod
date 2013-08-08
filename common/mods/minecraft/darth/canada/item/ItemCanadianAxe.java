package mods.minecraft.darth.canada.item;

import net.minecraft.item.EnumToolMaterial;

import mods.minecraft.darth.canada.CanadiaMod;
import mods.minecraft.darth.canada.lib.Strings;

public class ItemCanadianAxe extends ItemCanada
{

    public ItemCanadianAxe(int id, EnumToolMaterial par2EnumToolMaterial)
    {
        super(id);
        this.setCreativeTab(CanadiaMod.tabCanadia)
            .setUnlocalizedName(Strings.CANADIAN_AXE_NAME);
    }

}
