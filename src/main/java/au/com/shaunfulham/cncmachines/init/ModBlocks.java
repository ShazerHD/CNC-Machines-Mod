package au.com.shaunfulham.cncmachines.init;

import au.com.shaunfulham.cncmachines.blocks.LaserMachineBlock;
import au.com.shaunfulham.cncmachines.items.LaserMachine;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ModBlocks 
{
	
	public static final Block LASER_MACHINE_BLOCK;

	static
	{
		LASER_MACHINE_BLOCK  = new LaserMachineBlock("laser_machine_block");
	}

	public static void register()
	{
		registerBlock(LASER_MACHINE_BLOCK, new LaserMachine(LASER_MACHINE_BLOCK));
	}

	public static void registerBlock(Block block, ItemBlock item)
	{
		if (block.getRegistryName() == null)
			throw new IllegalArgumentException("A block being registered does not have a registry name and could be successfully registered.");
		RegistrationHandler.Blocks.add(block);
		item.setRegistryName(block.getRegistryName());
		RegistrationHandler.Items.add(item);
	}

}
