package com.laikastoolbox.mountingcharge.datagen;

import com.laikastoolbox.mountingcharge.objects.MountingChargeBlocks;
import com.laikastoolbox.mountingcharge.objects.MountingChargeItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.client.data.BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.ELEKTIK_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.ELEKTIK_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.ELEKTIK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.ELEKTIK_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.AMBORIUM_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.AMBORIUM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.RAW_AMBORIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.AMBORIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.MICA_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.MICA_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.INERTSTONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(MountingChargeBlocks.VOLKITE_BLOCK);

        //Mica
        blockStateModelGenerator.registerAxisRotated(MountingChargeBlocks.MICA_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(MountingChargeBlocks.MICA_PILLAR, TexturedModel.CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(net.minecraft.client.data.ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MountingChargeItems.ELEKTIK, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.CRACKLED_ELEKTIK, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.CHARGED_ELEKTIK, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.RAW_AMBORIUM, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.AMBORIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.REDSTONE_POWERCELL, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.MICA, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.INERTSTONE_DUST, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.VOLKITE_BLEND, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.VOLKITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MountingChargeItems.VOLKITE_POWERCELL, Models.GENERATED);

        itemModelGenerator.registerWithInHandModel(MountingChargeItems.LIGHTNING_CALLER);

        itemModelGenerator.register(MountingChargeItems.AMBORIUM_THUNDERBLADE, Models.HANDHELD);
        itemModelGenerator.register(MountingChargeItems.AMBORIUM_ROCKPIERCER, Models.HANDHELD);
        itemModelGenerator.register(MountingChargeItems.VOLKITE_THUNDERBLADE, Models.HANDHELD);
        itemModelGenerator.register(MountingChargeItems.VOLKITE_ROCKPIERCER, Models.HANDHELD);
    }
}
