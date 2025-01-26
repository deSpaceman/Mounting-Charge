package com.laikastoolbox.mountingcharge.objects.items.tools;

import com.laikastoolbox.mountingcharge.objects.items.ChargedWeaponItem;
import net.minecraft.item.ToolMaterial;

public class ThunderbladeItem extends ChargedWeaponItem {
    public ThunderbladeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings, int maxCharge) {
        super(material, attackDamage, attackSpeed, settings, maxCharge);
    }
}
