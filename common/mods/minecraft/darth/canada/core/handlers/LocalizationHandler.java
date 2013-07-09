package mods.minecraft.darth.canada.core.handlers;

import cpw.mods.fml.common.registry.LanguageRegistry;

import mods.minecraft.darth.canada.core.util.LocalizationUtil;
import mods.minecraft.darth.canada.lib.Localizations;

public class LocalizationHandler
{

    public static void loadLanguages()
    {
        
        // For every file specified in the Localization library class, load them into the Language Registry
        for (String localizationFile : Localizations.localeFiles)
        {
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationUtil.getLocaleFromFileName(localizationFile), LocalizationUtil.isXMLLanguageFile(localizationFile));
        }
        
    }   
    
}
