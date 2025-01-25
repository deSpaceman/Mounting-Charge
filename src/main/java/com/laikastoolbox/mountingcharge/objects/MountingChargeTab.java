package com.laikastoolbox.mountingcharge.objects;

import com.laikastoolbox.mountingcharge.MountingCharge;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MountingChargeTab {
    public static final RegistryKey<ItemGroup> MOUNTING_CHARGE_TAB_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MountingCharge.MOD_ID, "mounting_charge_tab"));

    public static final ItemGroup MOUNTING_CHARGE_TAB = FabricItemGroup.builder().icon(() -> new ItemStack(MountingChargeItems.LIGHTNING_CALLER)).displayName(Text.translatable("itemGroup.mountingcharge")).build();

    public static void registerTab() {
        Registry.register(Registries.ITEM_GROUP, MountingChargeTab.MOUNTING_CHARGE_TAB_KEY, MountingChargeTab.MOUNTING_CHARGE_TAB);

        ItemGroupEvents.modifyEntriesEvent(MOUNTING_CHARGE_TAB_KEY).register(itemGroup -> {
            itemGroup.add(MountingChargeBlocks.ELEKTIK_STONE_ORE);
            itemGroup.add(MountingChargeBlocks.ELEKTIK_DEEPSLATE_ORE);
            itemGroup.add(MountingChargeItems.ELEKTIK);
            itemGroup.add(MountingChargeBlocks.ELEKTIK_BLOCK);
            itemGroup.add(MountingChargeItems.CRACKLED_ELEKTIK);
            itemGroup.add(MountingChargeBlocks.ELEKTIK_SAND);
            itemGroup.add(MountingChargeItems.CHARGED_ELEKTIK);
            itemGroup.add(MountingChargeBlocks.AMBORIUM_STONE_ORE);
            itemGroup.add(MountingChargeBlocks.AMBORIUM_DEEPSLATE_ORE);
            itemGroup.add(MountingChargeItems.RAW_AMBORIUM);
            itemGroup.add(MountingChargeBlocks.RAW_AMBORIUM_BLOCK);
            itemGroup.add(MountingChargeItems.AMBORIUM_INGOT);
            itemGroup.add(MountingChargeBlocks.AMBORIUM_BLOCK);
            itemGroup.add(MountingChargeItems.REDSTONE_POWERCELL);
            itemGroup.add(MountingChargeBlocks.MICA_STONE_ORE);
            itemGroup.add(MountingChargeBlocks.MICA_DEEPSLATE_ORE);
            itemGroup.add(MountingChargeItems.MICA);
            itemGroup.add(MountingChargeBlocks.MICA_BLOCK);
            itemGroup.add(MountingChargeBlocks.MICA_PILLAR);
            itemGroup.add(MountingChargeItems.LIGHTNING_CALLER);
            itemGroup.add(MountingChargeItems.INERTSTONE_DUST);
            itemGroup.add(MountingChargeBlocks.INERTSTONE_BLOCK);
            itemGroup.add(MountingChargeItems.VOLKITE_BLEND);
            itemGroup.add(MountingChargeItems.VOLKITE_INGOT);
            itemGroup.add(MountingChargeBlocks.VOLKITE_BLOCK);
            itemGroup.add(MountingChargeItems.VOLKITE_POWERCELL);
        });
    }

}
