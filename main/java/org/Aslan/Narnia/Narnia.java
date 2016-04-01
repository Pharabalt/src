package org.Aslan.Narnia;

//import org.Aslan.Narnia.crafting.ModCrafting;
import org.Aslan.Narnia.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Narnia.MODID, version = Narnia.VERSION)
public class Narnia {
	
	public static final String MODID = "Aslan";
	public static final String VERSION = "1.0";
//	public static Item Banana;
	
	
	@Instance(MODID)
		public static Narnia INSTANCE = new Narnia();
		public static CreativeTabs Aslantab;
	
	private void registerHandlers(){
	}
	
	@SidedProxy(serverSide = "org.Aslan.Narnoa.proxy.CommonProxy",clientSide = "org.Aslan.Narnia.proxy.ClientProxy", modId = MODID)
		public static CommonProxy PROXY = new CommonProxy();
	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		
		
		Aslantab = new CreativeTabs("BuildingMaterials") {
			
			@Override
			public Item getTabIconItem() {
				return NarniaItems.Banana;
			}
			
		};
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		new NarniaItems();


	}
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		
		new NarniaCrafting();
		PROXY.registerModels();
			
	}

}
