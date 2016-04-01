package org.Aslan.Narnia.proxy;

import org.Aslan.Narnia.Narnia;
import org.Aslan.Narnia.NarniaItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {
	
	public void registerModels() {
		
		registerItemModel(NarniaItems.NarniaItem, 0);
//		registerItemModel(BodoItems.BodoFood, 0);
		
	}

	private void registerItemModel(Item item, int meta) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Narnia.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
