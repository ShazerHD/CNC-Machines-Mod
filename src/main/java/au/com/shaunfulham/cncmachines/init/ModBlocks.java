package au.com.shaunfulham.cncmachines.init;

import java.util.ArrayList;
import java.util.List;

import au.com.shaunfulham.cncmachines.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block LASER_MACHINE_BLOCK = new BlockBase("laser_machine", Material.IRON);
	
}
