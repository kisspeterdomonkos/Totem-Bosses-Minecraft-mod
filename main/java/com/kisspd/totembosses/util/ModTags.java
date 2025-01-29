package com.kisspd.totembosses.util;

import com.kisspd.totembosses.TotemBosses;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        public static final TagKey<Block> NEEDS_TIN_TOOL = createTag("needs_tin_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIN_TOOL = createTag("incorrect_for_tin_tool");

        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");

        public static final TagKey<Block> NEEDS_PIG_IRON_TOOL = createTag("needs_pig_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_PIG_IRON_TOOL = createTag("incorrect_for_pig_iron_tool");

        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");

        public static final TagKey<Block> NEEDS_ALLOY_TOOL = createTag("needs_alloy_tool");
        public static final TagKey<Block> INCORRECT_FOR_ALLOY_TOOL = createTag("incorrect_for_alloy_tool");

        public static final TagKey<Block> NEEDS_MOLTEN_TOOL = createTag("needs_molten_tool");
        public static final TagKey<Block> INCORRECT_FOR_MOLTEN_TOOL = createTag("incorrect_for_molten_tool");

        public static final TagKey<Block> NEEDS_OLD_TOOL = createTag("needs_old_tool");
        public static final TagKey<Block> INCORRECT_FOR_OLD_TOOL = createTag("incorrect_for_old_tool");

        public static final TagKey<Block> NEEDS_BLOODFORGED_TOOL = createTag("needs_bloodforged_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLOODFORGED_TOOL = createTag("incorrect_for_bloodforged_tool");

        public static final TagKey<Block> NEEDS_STORMSOUL_TOOL = createTag("needs_stormsoul_tool");
        public static final TagKey<Block> INCORRECT_FOR_STORMSOUL_TOOL = createTag("incorrect_for_stormsoul_tool");

        public static final TagKey<Block> NEEDS_STORMBRINGER_TOOL = createTag("needs_stormbringer_tool");
        public static final TagKey<Block> INCORRECT_FOR_STORMBRINGER_TOOL = createTag("incorrect_for_stormbringer_tool");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TotemBosses.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(TotemBosses.MODID, name));
        }
    }

}
