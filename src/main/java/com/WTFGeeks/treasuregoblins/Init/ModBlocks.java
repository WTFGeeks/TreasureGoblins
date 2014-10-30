package com.WTFGeeks.treasuregoblins.Init;

import com.WTFGeeks.treasuregoblins.block.BlockRawGoblin;
import com.WTFGeeks.treasuregoblins.block.BlockTG;
import com.WTFGeeks.treasuregoblins.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockTG rawgoblin = new BlockRawGoblin();
	
	public static void init()
	{
		GameRegistry.registerBlock(rawgoblin, "rawgoblin");
	}

}
