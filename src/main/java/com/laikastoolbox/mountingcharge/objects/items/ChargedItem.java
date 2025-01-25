package com.laikastoolbox.mountingcharge.objects.items;

import com.laikastoolbox.mountingcharge.objects.MountingChargeDataComponents;
import net.minecraft.component.ComponentMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class ChargedItem extends Item {
    public int maxCharge;

    public ChargedItem(Settings settings, int maxCharge) {
        super(settings.maxCount(1).component(MountingChargeDataComponents.CHARGE, maxCharge));
        this.maxCharge = maxCharge;
    }

    public int getMaxCharge() {
        return maxCharge;
    }

    public int getCurrentCharge(ItemStack stack) {
        if (stack.contains(MountingChargeDataComponents.CHARGE)) {
            return stack.get(MountingChargeDataComponents.CHARGE);
        } else return 0;
    }

    public void modifyCharge(ItemStack stack, int chargeChange) {
        int currentCharge = getCurrentCharge(stack);
        boolean lessThanZero = currentCharge + chargeChange < 0;

        if (currentCharge < getMaxCharge() && !lessThanZero) {
            stack.set(MountingChargeDataComponents.CHARGE, currentCharge + chargeChange);
        }
    }

    public void setCharge(ItemStack stack, int chargeChange) {
        stack.set(MountingChargeDataComponents.CHARGE, chargeChange);
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        return stack.contains(MountingChargeDataComponents.CHARGE);
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        return MathHelper.clamp(Math.round(13 * ((float) getCurrentCharge(stack) / getMaxCharge())), 0, 13);
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        float f = (float) getCurrentCharge(stack) / getMaxCharge();
        return MathHelper.hsvToRgb(0.65F - (0.15F * f), 1.0F, 1.0F);
    }
}
