package mods.minecraft.darth.canada;

import mods.minecraft.darth.canada.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES, acceptedMinecraftVersions = Reference.MC_VERSIONS)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CanadiaMod
{

}
