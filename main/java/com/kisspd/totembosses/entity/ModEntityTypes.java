/*package com.kisspd.totembosses.entity;

import com.kisspd.totembosses.TotemBosses;
import com.kisspd.totembosses.entity.projectile.EfumEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> REGISTRY =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TotemBosses.MODID);


    public static final EntityType<EfumEntity> EFUM = EntityType.Builder.of(
                    (EntityType<EfumEntity> entityType, Level level) -> new EfumEntity(entityType, level),
                    MobCategory.MISC)
            .sized(0.25f, 0.25f)
            .clientTrackingRange(4)
            .updateInterval(10)
            .build(ResourceLocation.fromNamespaceAndPath(TotemBosses.MODID, "efum").toString());

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}*/
/*
package com.kisspd.totembosses.entity;

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


    public static final RegistryObject<EntityType<EfumProjectileEntity>> EFUM_PROJECTILE =
            ENTITY_TYPES.register("efum_projectile", () -> EntityType.Builder.<EfumProjectileEntity>of(EfumProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("efum_projectile"));




    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
*/
