package com.kisspd.totembosses.item;

import com.kisspd.totembosses.TotemBosses;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TotemBosses.MODID);

    public static final RegistryObject<Item> EFUM = ITEMS.register("efum",
            () -> new EfumItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PIG_IRON = ITEMS.register("raw_pig_iron",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PIG_IRON_INGOT = ITEMS.register("pig_iron_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_INGOT = ITEMS.register("molten_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OXIDIZED_COPPER_INGOT = ITEMS.register("oxidized_copper_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 3, -2.4f))));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.COPPER, 3, -2.4f))));

    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword",
            () -> new SwordItem(ModToolTiers.TIN, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.TIN, 3, -2.4f))));

    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1.0f, -2.8f))));

    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5f, -3.0f))));

    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 6.0f, -3.1f))));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, -2.0f, -1.0f))));

    public static final RegistryObject<Item> PIG_IRON_PICKAXE = ITEMS.register("pig_iron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PIG_IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PIG_IRON, 1.0f, -2.8f))));

    public static final RegistryObject<Item> PIG_IRON_SHOVEL = ITEMS.register("pig_iron_shovel",
            () -> new ShovelItem(ModToolTiers.PIG_IRON, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PIG_IRON, 1.5f, -3.0f))));

    public static final RegistryObject<Item> PIG_IRON_AXE = ITEMS.register("pig_iron_axe",
            () -> new AxeItem(ModToolTiers.PIG_IRON, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PIG_IRON, 5.5f, -3.0f))));

    public static final RegistryObject<Item> PIG_IRON_HOE = ITEMS.register("pig_iron_hoe",
            () -> new HoeItem(ModToolTiers.PIG_IRON, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PIG_IRON, -2.5f, -0.0f))));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL, 1.0f, -2.8f))));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.STEEL, 1.5f, -3.0f))));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.STEEL, 5.5f, -3.0f))));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.STEEL, -2.5f, -0.0f))));

    public static final RegistryObject<Item> ALLOY_SWORD = ITEMS.register("alloy_sword",
            () -> new SwordItem(ModToolTiers.ALLOY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ALLOY, 3, -2.4f))));

    public static final RegistryObject<Item> MOLTEN_SWORD = ITEMS.register("molten_sword",
            () -> new SwordItem(ModToolTiers.MOLTEN, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MOLTEN, 3, -2.4f))));

    public static final RegistryObject<Item> OLD_BLADE = ITEMS.register("old_blade",
            () -> new SwordItem(ModToolTiers.OLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.OLD, 3, -2.4f))));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STEEL, 3, -2.4f))));

    public static final RegistryObject<Item> PIG_IRON_SWORD = ITEMS.register("pig_iron_sword",
            () -> new SwordItem(ModToolTiers.PIG_IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PIG_IRON, 3, -2.4f))));

    public static final RegistryObject<Item> BLOODFORGE_BLADE = ITEMS.register("bloodforge_blade",
            () -> new SwordItem(ModToolTiers.BLOODFORGED, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BLOODFORGED, 3, -2.4f))));

    public static final RegistryObject<Item> STORMSOUL = ITEMS.register("stormsoul",
            () -> new SwordItem(ModToolTiers.STORMSOUL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STORMSOUL, 3, -2.4f))));

    public static final RegistryObject<Item> STORMBRINGER = ITEMS.register("stormbringer",
            () -> new SwordItem(ModToolTiers.STORMBRINGER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STORMBRINGER, 3, -2.4f))));

    public static final RegistryObject<Item> RECURVED_BOW = ITEMS.register("recurved_bow",
            () -> new BowItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));

    public static final RegistryObject<Item> BRONZE_CHESTPLACE = ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));

    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));

    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ArmorItem(ModArmorMaterials.BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));

    public static final RegistryObject<Item> STEEL_CHESTPLACE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));

    public static final RegistryObject<Item> PIG_IRON_HELMET = ITEMS.register("pig_iron_helmet",
            () -> new ArmorItem(ModArmorMaterials.PIG_IRON_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));

    public static final RegistryObject<Item> PIG_IRON_CHESTPLACE = ITEMS.register("pig_iron_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PIG_IRON_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));

    public static final RegistryObject<Item> PIG_IRON_LEGGINGS = ITEMS.register("pig_iron_leggings",
            () -> new ArmorItem(ModArmorMaterials.PIG_IRON_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));

    public static final RegistryObject<Item> PIG_IRON_BOOTS = ITEMS.register("pig_iron_boots",
            () -> new ArmorItem(ModArmorMaterials.PIG_IRON_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
