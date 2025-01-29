package com.kisspd.totembosses.entity.custom;

import com.kisspd.totembosses.block.ModBlocks;
import com.kisspd.totembosses.entity.custom.ModEntities;
import com.kisspd.totembosses.item.ModItems;
import net.minecraft.core.Direction;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec2;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;


/*public class EfumProjectileEntity extends ThrowableItemProjectile {
    public EfumProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public EfumProjectileEntity(Level pLevel) {
        super(ModEntities.EFUM_PROJECTILE.get(), pLevel);
    }

    public EfumProjectileEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.EFUM_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.EFUM.get();
    }

    @Override
    protected void onHitEntity(@NotNull EntityHitResult pResult) {
        super.onHitEntity(pResult);
        try (Level level = level()) {
            Entity target = pResult.getEntity();
            Entity owner = this.getOwner();

            DamageSource damageSource = (owner == null)
                    ? level.damageSources().generic()
                    : level.damageSources().indirectMagic(this, owner);

            target.hurt(damageSource, 3.0f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void onHit(@NotNull HitResult pResult) {
        super.onHit(pResult);
        try (Level level = level()) {
            level.explode(null, this.getX(), this.getY() - 1.0, this.getZ(), 5.0f, true, Level.ExplosionInteraction.TNT);
            if (!level.isClientSide) {
                level.broadcastEntityEvent(this, (byte) 3);
                this.discard();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}*/
