package com.WTFGeeks.treasuregoblins.block;

import com.WTFGeeks.treasuregoblins.creativetab.CreativeTabTG;
import com.WTFGeeks.treasuregoblins.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;




public class BlockTG extends Block
{
	public BlockTG(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabTG.TG_TAB);
	}
	
	public BlockTG()
	{
		this(Material.rock);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		// tile.modid:blockname.name
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName (this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName (String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	

}
