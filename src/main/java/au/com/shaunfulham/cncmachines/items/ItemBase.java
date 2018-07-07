package au.com.shaunfulham.cncmachines.items;

import au.com.shaunfulham.cncmachines.Main;
import au.com.shaunfulham.cncmachines.init.ModItems;
import au.com.shaunfulham.cncmachines.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.REDSTONE);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
