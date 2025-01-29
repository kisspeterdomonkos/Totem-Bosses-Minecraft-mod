package com.kisspd.totembosses.datagen;

import com.kisspd.totembosses.TotemBosses;
import com.kisspd.totembosses.item.ModItems;
import com.kisspd.totembosses.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, TotemBosses.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLACE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get())

                .add(ModItems.STEEL_HELMET.get())
                .add(ModItems.STEEL_CHESTPLACE.get())
                .add(ModItems.STEEL_LEGGINGS.get())
                .add(ModItems.STEEL_BOOTS.get())

                .add(ModItems.PIG_IRON_HELMET.get())
                .add(ModItems.PIG_IRON_CHESTPLACE.get())
                .add(ModItems.PIG_IRON_LEGGINGS.get())
                .add(ModItems.PIG_IRON_BOOTS.get());
    }
}
