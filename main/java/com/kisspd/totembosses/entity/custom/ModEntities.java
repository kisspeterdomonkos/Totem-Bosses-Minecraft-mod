package com.kisspd.totembosses.entity.custom;

import com.kisspd.totembosses.TotemBosses;
import com.kisspd.totembosses.entity.custom.EfumProjectileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TotemBosses.MODID);

    /*public static final RegistryObject<EntityType<TriceratopsEntity>> TRICERATOPS =
            ENTITY_TYPES.register("triceratops", () -> EntityType.Builder.of(TriceratopsEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 1.5f).build("triceratops"));*/

    public static final RegistryObject<EntityType<EfumProjectileEntity>> EFUM =
            ENTITY_TYPES.register("efum", () -> EntityType.Builder.<EfumProjectileEntity>of(EfumProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 1.15f).build("efum"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
