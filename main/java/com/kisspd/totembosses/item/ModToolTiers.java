package com.kisspd.totembosses.item;

import com.kisspd.totembosses.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier COPPER = new ForgeTier(150, 6.0f, 1.5f, 14,
            ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT), ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL);
    public static final Tier BRONZE = new ForgeTier(200, 6.0f, 2.0f, 14,
            ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()), ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL);
    public static final Tier TIN = new ForgeTier(170, 6.0f, 1.5f, 14,
            ModTags.Blocks.NEEDS_TIN_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get()), ModTags.Blocks.INCORRECT_FOR_TIN_TOOL);
    public static final Tier PIG_IRON = new ForgeTier(100, 6.0f, 3.5f, 14,
            ModTags.Blocks.NEEDS_PIG_IRON_TOOL, () -> Ingredient.of(ModItems.PIG_IRON_INGOT.get()), ModTags.Blocks.INCORRECT_FOR_PIG_IRON_TOOL);
    public static final Tier STEEL = new ForgeTier(450, 6.0f, 2.5f, 14,
            ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get()), ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL);
    public static final Tier ALLOY = new ForgeTier(650, 6.0f, 3.0f, 14,
            ModTags.Blocks.NEEDS_ALLOY_TOOL, () -> Ingredient.of(ModItems.STEEL_SWORD.get()), ModTags.Blocks.INCORRECT_FOR_ALLOY_TOOL);
    public static final Tier MOLTEN = new ForgeTier(850, 6.0f, 4.0f, 14,
            ModTags.Blocks.NEEDS_MOLTEN_TOOL, () -> Ingredient.of(ModItems.ALLOY_SWORD.get()), ModTags.Blocks.INCORRECT_FOR_MOLTEN_TOOL);
    public static final Tier OLD = new ForgeTier(850, 6.0f, 4.0f, 14,
            ModTags.Blocks.NEEDS_OLD_TOOL, () -> Ingredient.of(ModItems.OLD_BLADE.get()), ModTags.Blocks.INCORRECT_FOR_OLD_TOOL);
    public static final Tier BLOODFORGED = new ForgeTier(850, 6.0f, 4.0f, 14,
            ModTags.Blocks.NEEDS_BLOODFORGED_TOOL, () -> Ingredient.of(ModItems.BLOODFORGE_BLADE.get()), ModTags.Blocks.INCORRECT_FOR_BLOODFORGED_TOOL);
    public static final Tier STORMSOUL = new ForgeTier(850, 6.0f, 4.0f, 14,
            ModTags.Blocks.NEEDS_STORMSOUL_TOOL, () -> Ingredient.of(ModItems.STORMSOUL.get()), ModTags.Blocks.INCORRECT_FOR_STORMSOUL_TOOL);
    public static final Tier STORMBRINGER = new ForgeTier(850, 6.0f, 4.0f, 14,
            ModTags.Blocks.NEEDS_STORMBRINGER_TOOL, () -> Ingredient.of(ModItems.STORMBRINGER.get()), ModTags.Blocks.INCORRECT_FOR_STORMBRINGER_TOOL);


}
