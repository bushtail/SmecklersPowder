package ca.enosich.smecklerspowder.proxy;

import ca.enosich.smecklerspowder.ModItems;
import ca.enosich.smecklerspowder.SmecklersPowder;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = SmecklersPowder.MODID)
public class CommonProxy {

    // preInit
    public void preInit(FMLPreInitializationEvent event) {

    }

    // init
    public void init(FMLInitializationEvent event) {

    }

    // postInit
    public void postInit(FMLPostInitializationEvent event) {

    }

    // Register items
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(ModItems.itemSmecklersPowder);
    }


}

