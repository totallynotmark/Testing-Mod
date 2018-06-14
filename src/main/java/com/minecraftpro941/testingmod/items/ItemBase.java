package com.minecraftpro941.testingmod.items;

import com.minecraftpro941.testingmod.Main;
import com.minecraftpro941.testingmod.init.ModItems;
import com.minecraftpro941.testingmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
	
}
