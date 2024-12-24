
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.scriptmasters.progress.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.scriptmasters.progress.item.WaspStingerItem;
import com.scriptmasters.progress.item.RubyItem;
import com.scriptmasters.progress.ProgressMod;

public class ProgressModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ProgressMod.MODID);
	public static final DeferredItem<Item> RUBY_BLOCK = block(ProgressModBlocks.RUBY_BLOCK);
	public static final DeferredItem<Item> RUBY = REGISTRY.register("ruby", RubyItem::new);
	public static final DeferredItem<Item> RUBY_ORE = block(ProgressModBlocks.RUBY_ORE);
	public static final DeferredItem<Item> WASP_SPAWN_EGG = REGISTRY.register("wasp_spawn_egg", () -> new DeferredSpawnEggItem(ProgressModEntities.WASP, -12171160, -211623, new Item.Properties()));
	public static final DeferredItem<Item> WASP_STINGER = REGISTRY.register("wasp_stinger", WaspStingerItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
