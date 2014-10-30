package com.WTFGeeks.treasuregoblins.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class EntityFallenGoblin extends EntityMob
{

	public EntityFallenGoblin(World world) 
	{
		super(world);
		
		
	}
	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
	       
	        
	       
	    }
	

}
