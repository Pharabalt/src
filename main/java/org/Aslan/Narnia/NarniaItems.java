package org.Aslan.Narnia;

import org.Aslan.Narnia.item.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NarniaItems {
	
	public static Item Banana;
	public static Item NarniaItem;
	
	
		public NarniaItems() {
		
			init();
			register();
		
	}

	
	private void init() {

		NarniaItem = new Banana().setUnlocalizedName("Banana");
		
	}

	private void register() {
		
		
		
		GameRegistry.registerItem(NarniaItem, NarniaItem.getUnlocalizedName().substring(5));
	
		
	}
	
}
