package au.com.shaunfulham.cncmachines;

import au.com.shaunfulham.cncmachines.init.ModBlocks;
import au.com.shaunfulham.cncmachines.proxy.CommonProxy;
import au.com.shaunfulham.cncmachines.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{

	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs("cnc")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModBlocks.LASER_MACHINE_BLOCK);
		}
	};
	
	@Instance
	public static Main INSTANCE;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	private static Logger logger = LogManager.getLogger("cnc");
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
        proxy.preInit(event);
        logger.info("PreInit");
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.init(event);
        logger.info("Init");
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
        logger.info("PostInit");
	}
	
}
