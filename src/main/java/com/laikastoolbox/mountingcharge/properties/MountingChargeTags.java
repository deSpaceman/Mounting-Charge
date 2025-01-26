package com.laikastoolbox.mountingcharge.properties;

import com.laikastoolbox.mountingcharge.MountingCharge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MountingChargeTags {
    public static class BlockTags {
        public static final TagKey<Block> ROCKPIERCER_MINEABLE = createTag("mineable/rockpiercer");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MountingCharge.MOD_ID, name));
        }
    }

    public static class ItemTags {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MountingCharge.MOD_ID, name));
        }
    }

}
