package au.com.shaunfulham.cncmachines;

import au.com.shaunfulham.cncmachines.proxy.CommonProxy;
import au.com.shaunfulham.cncmachines.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	
	@Instance
	public static Main INSTANCE;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent preInit) 
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent init) 
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent postInit) 
	{
		
	}
	
}
