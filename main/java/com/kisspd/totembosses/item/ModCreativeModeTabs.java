package com.kisspd.totembosses.item;

import com.kisspd.totembosses.TotemBosses;
import com.kisspd.totembosses.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TotemBosses.MODID);

    public static final RegistryObject<CreativeModeTab> TBS_WEAPONS_TAB = CREATIVE_MODE_TABS.register("tbs_weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PIG_IRON_SWORD.get()))
                    .title(Component.translatable("creativetab.totembosses.tbs_weapons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPER_SWORD.get());
                        output.accept(ModItems.TIN_SWORD.get());
                        output.accept(ModItems.BRONZE_SWORD.get());
                        output.accept(ModItems.ALLOY_SWORD.get());
                        output.accept(ModItems.MOLTEN_SWORD.get());
                        output.accept(ModItems.OLD_BLADE.get());
                        output.accept(ModItems.STEEL_SWORD.get());
                        output.accept(ModItems.PIG_IRON_SWORD.get());
                        output.accept(ModItems.BLOODFORGE_BLADE.get());
                        output.accept(ModItems.STORMSOUL.get());
                        output.accept(ModItems.STORMBRINGER.get());
                        output.accept(ModItems.RECURVED_BOW.get());
                        output.accept(ModItems.EFUM.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> TBS_ARMORS_TAB = CREATIVE_MODE_TABS.register("tbs_armors_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_HELMET.get()))
                    .withTabsBefore(TBS_WEAPONS_TAB.getId())
                    .title(Component.translatable("creativetab.totembosses.tbs_armors"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BRONZE_HELMET.get());
                        output.accept(ModItems.BRONZE_CHESTPLACE.get());
                        output.accept(ModItems.BRONZE_LEGGINGS.get());
                        output.accept(ModItems.BRONZE_BOOTS.get());
                        output.accept(ModItems.STEEL_HELMET.get());
                        output.accept(ModItems.STEEL_CHESTPLACE.get());
                        output.accept(ModItems.STEEL_LEGGINGS.get());
                        output.accept(ModItems.STEEL_BOOTS.get());
                        output.accept(ModItems.PIG_IRON_HELMET.get());
                        output.accept(ModItems.PIG_IRON_CHESTPLACE.get());
                        output.accept(ModItems.PIG_IRON_LEGGINGS.get());
                        output.accept(ModItems.PIG_IRON_BOOTS.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> TBS_TOOLS_TAB = CREATIVE_MODE_TABS.register("tbs_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_PICKAXE.get()))
                    .withTabsBefore(TBS_ARMORS_TAB.getId())
                    .title(Component.translatable("creativetab.totembosses.tbs_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BRONZE_PICKAXE.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.PIG_IRON_PICKAXE.get());
                        output.accept(ModItems.BRONZE_AXE.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.PIG_IRON_AXE.get());
                        output.accept(ModItems.BRONZE_SHOVEL.get());
                        output.accept(ModItems.STEEL_SHOVEL.get());
                        output.accept(ModItems.PIG_IRON_SHOVEL.get());
                        output.accept(ModItems.BRONZE_HOE.get());
                        output.accept(ModItems.STEEL_HOE.get());
                        output.accept(ModItems.PIG_IRON_HOE.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> TBS_RESOURCES_TAB = CREATIVE_MODE_TABS.register("tbs_resources_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OXIDIZED_COPPER_INGOT.get()))
                    .withTabsBefore(TBS_TOOLS_TAB.getId())
                    .title(Component.translatable("creativetab.totembosses.tbs_resources"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.PIG_IRON_INGOT.get());
                        output.accept(ModItems.MOLTEN_INGOT.get());
                        output.accept(ModItems.OXIDIZED_COPPER_INGOT.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.RAW_STEEL.get());
                        output.accept(ModItems.RAW_BRONZE.get());
                        output.accept(ModItems.RAW_PIG_IRON.get());
                        output.accept(ModItems.RAW_TIN.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> TBS_BLOCKS_TAB = CREATIVE_MODE_TABS.register("tbs_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STEEL_BLOCK.get()))
                    .withTabsBefore(TBS_RESOURCES_TAB.getId())
                    .title(Component.translatable("creativetab.totembosses.tbs_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.BRONZE_BLOCK.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.TIN_ORE.get());
                    })
                    .build());

    public static void  register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
