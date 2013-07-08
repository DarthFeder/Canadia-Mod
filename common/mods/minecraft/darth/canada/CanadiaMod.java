package mods.minecraft.darth.canada;

import net.minecraft.creativetab.CreativeTabs;
import mods.minecraft.darth.canada.core.proxy.CommonProxy;
import mods.minecraft.darth.canada.creativetabs.CreativeTabCanada;
import mods.minecraft.darth.canada.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES, acceptedMinecraftVersions = Reference.MC_VERSIONS)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CanadiaMod
{
        @Instance(Reference.MOD_ID)
        public static CanadiaMod instance;
        
        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
        public static CommonProxy proxy;
        
        public static CreativeTabs tabCanadia = new CreativeTabCanada(Reference.MOD_ID);
        
        
}