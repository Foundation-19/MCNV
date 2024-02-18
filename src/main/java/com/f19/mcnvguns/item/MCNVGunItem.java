package com.f19.mcnvguns.item;

import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.world.item.ItemStack;

public class MCNVGunItem extends GunItem {
    public MCNVGunItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return stack.isDamaged();
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        return Math.round(13.0F - (float)stack.getDamageValue() * 13.0F / (float)this.getMaxDamage(stack));
    }
}
