package mods.minecraft.darth.canada.world;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;

public class WorldTypeCanadia extends WorldType
{

    public WorldTypeCanadia(int par1, String par2Str)
    {
        this(par1, par2Str, 0);
    }
    
    public WorldTypeCanadia(int par1, String par2Str, int par3)
    {
        super(par1, par2Str, par3);
        
        this.removeBiome(BiomeGenBase.desert);
        this.removeBiome(BiomeGenBase.extremeHills);
        this.removeBiome(BiomeGenBase.jungle);
        this.removeBiome(BiomeGenBase.forest);
        this.removeBiome(BiomeGenBase.swampland);
        this.removeBiome(BiomeGenBase.plains);
        this.removeBiome(BiomeGenBase.mushroomIsland);
        this.removeBiome(BiomeGenBase.mushroomIslandShore);
        this.removeBiome(BiomeGenBase.desertHills);
        this.removeBiome(BiomeGenBase.extremeHillsEdge);
        this.removeBiome(BiomeGenBase.forestHills);
    }

}
