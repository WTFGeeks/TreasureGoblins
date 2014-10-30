package com.WTFGeeks.treasuregoblins.creativetab;

import com.WTFGeeks.treasuregoblins.Init.ModItems;
import com.WTFGeeks.treasuregoblins.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTG 
{
	public static final CreativeTabs TG_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.goldcoin;
		}
		

	};
}