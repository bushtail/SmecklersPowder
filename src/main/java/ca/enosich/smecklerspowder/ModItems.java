package ca.enosich.smecklerspowder;

import ca.enosich.smecklerspowder.items.ItemSmecklersPowder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    // Create itemSmecklersPowder
    @GameRegistry.ObjectHolder("smecklerspowder:smecklers_powder")
    public static final ItemSmecklersPowder itemSmecklersPowder = new ItemSmecklersPowder(20, 20f);

    // Call ItemSmecklersPowder.initModel
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemSmecklersPowder.initModel();
    }
}
