package mods.minecraft.darth.canada;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.WorldType;

import mods.minecraft.darth.canada.core.proxy.CommonProxy;
import mods.minecraft.darth.canada.creativetabs.CreativeTabCanada;
import mods.minecraft.darth.canada.item.ModItems;
import mods.minecraft.darth.canada.lib.Reference;
import mods.minecraft.darth.canada.core.handlers.LocalizationHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
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
        
        public static final WorldType CANADIA = new WorldType(12, "canada");
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event)
        {
            
            //Load Language Localization Files
            LocalizationHandler.loadLanguages();
            
            //Load Mod Items
            ModItems.init();
            
        }
        
        @Init
        public void load(FMLInitializationEvent event)
        {
            
            
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event)
        {
            
            
        }
}
