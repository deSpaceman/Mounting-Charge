package com.laikastoolbox.mountingcharge.datagen.tagproviders;

import com.laikastoolbox.mountingcharge.objects.MountingChargeItems;
import com.laikastoolbox.mountingcharge.properties.MountingChargeTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends FabricTagProvider<Item> {
    public ItemTagGen(FabricDataOutput output, RegistryKey<? extends Registry<Item>> registryKey, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //Repair Tool Tag
        getOrCreateTagBuilder(MountingChargeTags.AMBORIUM_TOOL_MATERIALS)
                .add(MountingChargeItems.AMBORIUM_INGOT);

        getOrCreateTagBuilder(MountingChargeTags.VOLKITE_TOOL_MATERIALS)
                .add(MountingChargeItems.VOLKITE_INGOT);
    }
}
