package ca.enosich.smecklerspowder;

import ca.enosich.smecklerspowder.items.ItemSmecklersPowder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("smecklerspowder:smecklers_powder")
    public static final ItemSmecklersPowder itemSmecklersPowder = new ItemSmecklersPowder(20, 20f);

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemSmecklersPowder.initModel();
    }
}
