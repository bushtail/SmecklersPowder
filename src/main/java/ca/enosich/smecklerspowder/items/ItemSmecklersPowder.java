package ca.enosich.smecklerspowder.items;

import ca.enosich.smecklerspowder.SmecklersPowder;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSmecklersPowder extends ItemFood {

    
    public ItemSmecklersPowder(int amount, float saturation) {
        super(amount, saturation, false);
        this.setAlwaysEdible();
        this.setMaxStackSize(16);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setTranslationKey(SmecklersPowder.MODID + ".smecklers_powder");
        this.setRegistryName("smecklers_powder");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(8289), 10, 0));
    }
}
