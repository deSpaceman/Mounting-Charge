package com.laikastoolbox.mountingcharge.objects.items.tools;

import com.laikastoolbox.mountingcharge.objects.items.ChargedToolItem;
import com.laikastoolbox.mountingcharge.properties.MountingChargeTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class RockpiercerItem extends ChargedToolItem {
    public RockpiercerItem(ToolMaterial material, TagKey<Block> effectiveBlocks, float attackDamage, float attackSpeed, Settings settings, int maxCharge) {
        super(material, MountingChargeTags.BlockTags.ROCKPIERCER_MINEABLE, attackDamage, attackSpeed, settings, maxCharge);
    }
}
