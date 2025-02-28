package com.laikastoolbox.mountingcharge.properties;

import com.laikastoolbox.mountingcharge.MountingCharge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MountingChargeTags {
    public static final TagKey<Block> ROCKPIERCER_MINEABLE = createBlockTag("mineable/rockpiercer");

    public static final TagKey<Item> AMBORIUM_TOOL_MATERIALS = createItemTag("amborium_tool_materials");
    public static final TagKey<Item> VOLKITE_TOOL_MATERIALS = createItemTag("volkite_tool_materials");

    private static TagKey<Block> createBlockTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MountingCharge.MOD_ID, name));
    }
    private static TagKey<Item> createItemTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(MountingCharge.MOD_ID, name));
    }
}
