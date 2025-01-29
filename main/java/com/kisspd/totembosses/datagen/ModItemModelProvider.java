package com.kisspd.totembosses.datagen;

import com.kisspd.totembosses.TotemBosses;
import com.kisspd.totembosses.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TotemBosses.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.RAW_BRONZE.get());

        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.TIN_SWORD);
        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.ALLOY_SWORD);
        handheldItem(ModItems.MOLTEN_SWORD);
        handheldItem(ModItems.OLD_BLADE);
        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.PIG_IRON_SWORD);
        handheldItem(ModItems.BLOODFORGE_BLADE);
        handheldItem(ModItems.STORMSOUL);
        handheldItem(ModItems.STORMBRINGER);

        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_AXE);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_HOE);

        handheldItem(ModItems.PIG_IRON_PICKAXE);
        handheldItem(ModItems.PIG_IRON_AXE);
        handheldItem(ModItems.PIG_IRON_SHOVEL);
        handheldItem(ModItems.PIG_IRON_HOE);

        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_HOE);

        basicItem(ModItems.EFUM.get());

        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.RAW_TIN.get());


        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.RAW_STEEL.get());

        basicItem(ModItems.OXIDIZED_COPPER_INGOT.get());
        basicItem(ModItems.PIG_IRON_INGOT.get());
        basicItem(ModItems.RAW_PIG_IRON.get());

        basicItem(ModItems.MOLTEN_INGOT.get());

        trimmedArmorItem(ModItems.BRONZE_HELMET);
        trimmedArmorItem(ModItems.BRONZE_CHESTPLACE);
        trimmedArmorItem(ModItems.BRONZE_LEGGINGS);
        trimmedArmorItem(ModItems.BRONZE_BOOTS);

        trimmedArmorItem(ModItems.STEEL_HELMET);
        trimmedArmorItem(ModItems.STEEL_CHESTPLACE);
        trimmedArmorItem(ModItems.STEEL_LEGGINGS);
        trimmedArmorItem(ModItems.STEEL_BOOTS);

        trimmedArmorItem(ModItems.PIG_IRON_HELMET);
        trimmedArmorItem(ModItems.PIG_IRON_CHESTPLACE);
        trimmedArmorItem(ModItems.PIG_IRON_LEGGINGS);
        trimmedArmorItem(ModItems.PIG_IRON_BOOTS);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TotemBosses.MODID, "item/" + item.getId().getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = TotemBosses.MODID;

        if (itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace() + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
}
