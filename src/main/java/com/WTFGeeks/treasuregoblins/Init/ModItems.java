package com.WTFGeeks.treasuregoblins.Init;

import com.WTFGeeks.treasuregoblins.item.ItemFoodCheese;
import com.WTFGeeks.treasuregoblins.item.ItemFoodTG;
import com.WTFGeeks.treasuregoblins.item.ItemGoblinMeat;
import com.WTFGeeks.treasuregoblins.item.ItemGoldCoin;
import com.WTFGeeks.treasuregoblins.item.ItemTG;
import com.WTFGeeks.treasuregoblins.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemTG goldcoin = new ItemGoldCoin();
	public static final ItemTG goblinmeat = new ItemGoblinMeat();
	public static final ItemFoodTG cheese = new ItemFoodCheese();
	
	
	public static void init()
	{
		GameRegistry.registerItem(goldcoin, "goldCoin");
		GameRegistry.registerItem(goblinmeat, "goblinmeat");
		GameRegistry.registerItem(cheese, "cheese");
	}
	
	
	

}
