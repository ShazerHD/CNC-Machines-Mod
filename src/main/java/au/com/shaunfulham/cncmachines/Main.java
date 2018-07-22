package au.com.shaunfulham.cncmachines;

import au.com.shaunfulham.cncmachines.init.RegistrationHandler;
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
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent preInit)
	{
		RegistrationHandler.init();
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent init) 
	{
		
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent postInit)
	{
		
	}
	
}
