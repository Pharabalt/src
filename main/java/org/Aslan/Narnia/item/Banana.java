package org.Aslan.Narnia.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Banana extends ItemFood {
	
	public Banana() {
		super(8, false);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}