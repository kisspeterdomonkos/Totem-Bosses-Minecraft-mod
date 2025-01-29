package com.kisspd.totembosses.datagen;

import com.kisspd.totembosses.block.ModBlocks;
import com.kisspd.totembosses.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> STEEL_SMELTABLES = List.of(ModItems.RAW_STEEL.get());
        List<ItemLike> BRONZE_SMELTABLES = List.of(ModItems.RAW_BRONZE.get());
        List<ItemLike> PIG_IRON_SMELTABLES = List.of(ModItems.RAW_PIG_IRON.get());
        List<ItemLike> TIN_SMELTABLES = List.of(ModBlocks.TIN_ORE.get());



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EFUM.get())
                .pattern("AB ")
                .pattern("   ")
                .pattern("   ")
                .define('A', Items.REDSTONE)
                .define('B', Items.GUNPOWDER)
                .unlockedBy(getHasName(Items.GUNPOWDER), has(Items.GUNPOWDER)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_CHESTPLACE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_CHESTPLACE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_CHESTPLACE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_HELMET)
                .pattern("ABA")
                .pattern("B B")
                .pattern("   ")
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_CHESTPLATE)
                .pattern("B B")
                .pattern("ABA")
                .pattern("ABA")
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_LEGGINGS)
                .pattern("ABA")
                .pattern("B B")
                .pattern("B B")
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("B B")
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.OXIDIZED_COPPER)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OXIDIZED_COPPER_INGOT.get())
                .unlockedBy(getHasName(ModItems.OXIDIZED_COPPER_INGOT.get()), has(ModItems.OXIDIZED_COPPER_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAW_STEEL.get())
                .pattern("AB ")
                .pattern("   ")
                .pattern("   ")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.COAL)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAW_BRONZE.get())
                .pattern("AB ")
                .pattern("   ")
                .pattern("   ")
                .define('A', Items.COPPER_INGOT)
                .define('B', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT)).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModBlocks.BRONZE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BRONZE_BLOCK.get()), has(ModBlocks.BRONZE_BLOCK.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAW_PIG_IRON.get())
                .pattern("AB ")
                .pattern("   ")
                .pattern("   ")
                .define('A', ModItems.OXIDIZED_COPPER_INGOT.get())
                .define('B', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.OXIDIZED_COPPER_INGOT.get()), has(ModItems.OXIDIZED_COPPER_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_SWORD.get())
                .pattern("AB ")
                .pattern("   ")
                .pattern("   ")
                .define('A', ModItems.BRONZE_SWORD.get())
                .define('B', ModItems.STEEL_SWORD.get())
                .unlockedBy(getHasName(ModItems.BRONZE_SWORD.get()), has(ModItems.BRONZE_SWORD.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TIN_BLOCK.get()), has(ModBlocks.TIN_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()), has(ModBlocks.STEEL_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OXIDIZED_COPPER_INGOT.get(), 9)
                .requires(Blocks.OXIDIZED_COPPER)
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER)).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 200, "steel_ingot");
        oreBlasting(pRecipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 100, "steel_ingot");

        oreSmelting(pRecipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 200, "tin_ingot");
        oreBlasting(pRecipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 100, "tin_ingot");

        oreSmelting(pRecipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 200, "bronze_ingot");
        oreBlasting(pRecipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 100, "bronze_ingot");

        oreSmelting(pRecipeOutput, PIG_IRON_SMELTABLES, RecipeCategory.MISC, ModItems.PIG_IRON_INGOT.get(), 0.7f, 200, "pig_iron_ingot");
        oreBlasting(pRecipeOutput, PIG_IRON_SMELTABLES, RecipeCategory.MISC, ModItems.PIG_IRON_INGOT.get(), 0.7f, 100, "pig_iron_ingot");
    }
}
