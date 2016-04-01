package org.Aslan.Narnia;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NarniaCrafting {
	
	public NarniaCrafting() {
	register();
	}
	private void register() {
		
		GameRegistry.addShapedRecipe(new ItemStack(NarniaItems.Banana), new Object[]{
					"SSS",	
					"SAS",	
					"SSS",
					'S', new ItemStack(Items.wheat_seeds),
					'A', new ItemStack(Items.apple)
				});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.snow_layer,3), new Object[] {"   ", "   ", "SSS", 'S', Items.snowball});
		GameRegistry.addRecipe(new ItemStack(Blocks.snow_layer,3), new Object[] {"   ", "SSS", "   ", 'S', Items.snowball});
		GameRegistry.addRecipe(new ItemStack(Blocks.snow_layer,3), new Object[] {"SSS", "   ", "   ", 'S', Items.snowball});
		GameRegistry.addRecipe(new ItemStack(Items.saddle), new Object[] {"LLL", "LIL", "I I", 'L', Items.leather, 'I', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), new Object[] {"  G", "GWG", "GGG", 'W', Blocks.wool, 'G', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), new Object[] {"  D", "DWD", "DDD", 'W', Blocks.wool, 'D', Items.diamond});	
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), new Object[] {"  I", "IWI", "III", 'W', Blocks.wool, 'I', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), new Object [] {"F F", "F F", "   ", 'F', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), new Object [] {"   ", "F F", "F F", 'F', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), new Object [] {"FFF", "F F", "F F", 'F', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), new Object [] {"F F", "FFF", "FFF", 'F', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), new Object [] {"   ", "FFF", "F F", 'F', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), new Object [] {"FFF", "F F", "   ", 'F', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball,32), new Object [] {"DDD", "DWD", "DDD", 'D', Blocks.dirt, 'W', Items.water_bucket});
		
	}
}
