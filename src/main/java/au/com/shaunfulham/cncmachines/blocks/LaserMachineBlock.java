package au.com.shaunfulham.cncmachines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class LaserMachineBlock extends Block
{
    public LaserMachineBlock(String id) {
        super(Material.IRON);
        this.setUnlocalizedName(id);
        this.setRegistryName(id);
        this.setCreativeTab(CreativeTabs.REDSTONE);

    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }


}
