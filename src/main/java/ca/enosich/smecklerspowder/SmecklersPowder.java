package ca.enosich.smecklerspowder;

import java.util.logging.Logger;
import ca.enosich.smecklerspowder.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = SmecklersPowder.MODID, name = SmecklersPowder.NAME, version = SmecklersPowder.VERSION, useMetadata = true)
public class SmecklersPowder {

    public static final String MODID = "smecklerspowder";
    public static final String NAME = "Smeckler's Powder";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "ca.enosich.smecklerspowder.proxy.ClientProxy", serverSide = "ca.enosich.smecklerspowder.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static SmecklersPowder instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
