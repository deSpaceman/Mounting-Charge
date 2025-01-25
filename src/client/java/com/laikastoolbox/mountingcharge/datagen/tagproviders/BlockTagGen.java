package com.laikastoolbox.mountingcharge.datagen.tagproviders;

import com.laikastoolbox.mountingcharge.objects.MountingChargeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends FabricTagProvider<Block> {
    public BlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //Needed Tool
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(MountingChargeBlocks.ELEKTIK_STONE_ORE)
                .add(MountingChargeBlocks.ELEKTIK_DEEPSLATE_ORE)
                .add(MountingChargeBlocks.ELEKTIK_BLOCK)
                .add(MountingChargeBlocks.AMBORIUM_STONE_ORE)
                .add(MountingChargeBlocks.AMBORIUM_DEEPSLATE_ORE)
                .add(MountingChargeBlocks.RAW_AMBORIUM_BLOCK)
                .add(MountingChargeBlocks.AMBORIUM_BLOCK)
                .add(MountingChargeBlocks.MICA_STONE_ORE)
                .add(MountingChargeBlocks.MICA_DEEPSLATE_ORE)
                .add(MountingChargeBlocks.MICA_BLOCK)
                .add(MountingChargeBlocks.MICA_PILLAR)
                .add(MountingChargeBlocks.VOLKITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(MountingChargeBlocks.ELEKTIK_SAND)
                .add(MountingChargeBlocks.INERTSTONE_BLOCK);

        //Mining Tiers
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(MountingChargeBlocks.AMBORIUM_STONE_ORE)
                .add(MountingChargeBlocks.AMBORIUM_DEEPSLATE_ORE)
                .add(MountingChargeBlocks.RAW_AMBORIUM_BLOCK)
                .add(MountingChargeBlocks.MICA_STONE_ORE)
                .add(MountingChargeBlocks.MICA_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(MountingChargeBlocks.ELEKTIK_STONE_ORE)
                .add(MountingChargeBlocks.ELEKTIK_DEEPSLATE_ORE);
    }
}
