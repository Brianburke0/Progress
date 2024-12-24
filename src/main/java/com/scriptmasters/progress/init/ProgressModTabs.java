
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.scriptmasters.progress.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.scriptmasters.progress.ProgressMod;

public class ProgressModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProgressMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROGRESS_TAB = REGISTRY.register("progress_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.progress.progress_tab")).icon(() -> new ItemStack(ProgressModItems.RUBY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ProgressModItems.RUBY.get());
				tabData.accept(ProgressModItems.WASP_STINGER.get());
				tabData.accept(ProgressModBlocks.RUBY_BLOCK.get().asItem());
				tabData.accept(ProgressModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(ProgressModItems.WASP_SPAWN_EGG.get());
			})

					.build());
}
