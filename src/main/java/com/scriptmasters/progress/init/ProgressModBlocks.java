
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.scriptmasters.progress.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import com.scriptmasters.progress.block.RubyOreBlock;
import com.scriptmasters.progress.block.RubyBlockBlock;
import com.scriptmasters.progress.ProgressMod;

public class ProgressModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ProgressMod.MODID);
	public static final DeferredBlock<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", RubyBlockBlock::new);
	public static final DeferredBlock<Block> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
