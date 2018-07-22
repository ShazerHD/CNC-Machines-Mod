package au.com.shaunfulham.cncmachines.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemMapBase;

public class ModItems {

	public static void register() {}

	public static void register(Item item) {
		RegistrationHandler.Items.add(item);
	}

}
