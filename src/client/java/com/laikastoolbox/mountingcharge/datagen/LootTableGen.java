package com.laikastoolbox.mountingcharge.datagen;

import com.laikastoolbox.mountingcharge.objects.MountingChargeBlocks;
import com.laikastoolbox.mountingcharge.objects.MountingChargeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableGen extends FabricBlockLootTableProvider {
    public LootTableGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(MountingChargeBlocks.ELEKTIK_STONE_ORE, oreDrops(MountingChargeBlocks.ELEKTIK_STONE_ORE, MountingChargeItems.ELEKTIK));
        addDrop(MountingChargeBlocks.ELEKTIK_DEEPSLATE_ORE, oreDrops(MountingChargeBlocks.ELEKTIK_DEEPSLATE_ORE, MountingChargeItems.ELEKTIK));
        addDrop(MountingChargeBlocks.ELEKTIK_BLOCK);
        addDrop(MountingChargeBlocks.ELEKTIK_SAND);
        addDrop(MountingChargeBlocks.AMBORIUM_STONE_ORE, oreDrops(MountingChargeBlocks.AMBORIUM_STONE_ORE, MountingChargeItems.RAW_AMBORIUM));
        addDrop(MountingChargeBlocks.AMBORIUM_DEEPSLATE_ORE, oreDrops(MountingChargeBlocks.AMBORIUM_DEEPSLATE_ORE, MountingChargeItems.RAW_AMBORIUM));
        addDrop(MountingChargeBlocks.RAW_AMBORIUM_BLOCK);
        addDrop(MountingChargeBlocks.AMBORIUM_BLOCK);
        addDrop(MountingChargeBlocks.MICA_STONE_ORE, multiOreDrops(MountingChargeBlocks.MICA_STONE_ORE, MountingChargeItems.MICA, 4.0F, 9.0F));
        addDrop(MountingChargeBlocks.MICA_DEEPSLATE_ORE, multiOreDrops(MountingChargeBlocks.MICA_DEEPSLATE_ORE, MountingChargeItems.MICA, 4.0F, 9.0F));
        addDrop(MountingChargeBlocks.MICA_BLOCK);
        addDrop(MountingChargeBlocks.MICA_PILLAR);
        addDrop(MountingChargeBlocks.INERTSTONE_BLOCK);
        addDrop(MountingChargeBlocks.VOLKITE_BLOCK);

    }

    public LootTable.Builder multiOreDrops(Block drop, Item item, float minAmount, float maxAmount) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minAmount, maxAmount))).apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
