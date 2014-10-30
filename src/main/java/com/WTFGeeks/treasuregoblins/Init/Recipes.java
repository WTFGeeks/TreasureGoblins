package com.WTFGeeks.treasuregoblins.Init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rawgoblin), "sss", "sss", "sss", 's', new ItemStack(ModItems.goblinmeat));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldcoin), new ItemStack(Items.gold_nugget), new ItemStack(Items.gold_nugget));
	}

}
