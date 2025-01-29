/*package com.kisspd.totembosses.item;

import com.kisspd.totembosses.entity.projectile.EfumEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class EfumItem_old extends Item {

    public EfumItem_old(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, @NotNull InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);

        // Play sound
        pLevel.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5f,
                0.4f / (pLevel.random.nextFloat() * 0.4f + 0.8f));

        if (!pLevel.isClientSide) {
            // Create and shoot the custom projectile
            EfumEntity efum = new EfumEntity(pLevel, pPlayer);
            efum.setItem(itemstack);
            efum.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0f, 1.5f, 1f);
            pLevel.addFreshEntity(efum);
        }

        // Update stats and itemstack
        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            itemstack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemstack, pLevel.isClientSide());
    }
}*/

