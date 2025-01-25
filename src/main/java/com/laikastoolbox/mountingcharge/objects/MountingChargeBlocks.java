package com.laikastoolbox.mountingcharge.objects;

import com.laikastoolbox.mountingcharge.MountingCharge;
import com.laikastoolbox.mountingcharge.objects.blocks.ElektikSandBlock;
import com.laikastoolbox.mountingcharge.objects.blocks.InertstoneBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class MountingChargeBlocks {
    public static final RegistryKey<Block> ELEKTIK_STONE_ORE_KEY = registerBlockKey("elektik_stone_ore");
    public static final RegistryKey<Block> ELEKTIK_DEEPSLATE_ORE_KEY = registerBlockKey("elektik_deepslate_ore");
    public static final RegistryKey<Block> ELEKTIK_BLOCK_KEY = registerBlockKey("elektik_block");
    public static final RegistryKey<Block> ELEKTIK_SAND_KEY = registerBlockKey("elektik_sand");
    public static final RegistryKey<Block> AMBORIUM_STONE_ORE_KEY = registerBlockKey("amborium_stone_ore");
    public static final RegistryKey<Block> AMBORIUM_DEEPSLATE_ORE_KEY = registerBlockKey("amborium_deepslate_ore");
    public static final RegistryKey<Block> RAW_AMBORIUM_BLOCK_KEY = registerBlockKey("raw_amborium_block");
    public static final RegistryKey<Block> AMBORIUM_BLOCK_KEY = registerBlockKey("amborium_block");
    public static final RegistryKey<Block> MICA_STONE_ORE_KEY = registerBlockKey("mica_stone_ore");
    public static final RegistryKey<Block> MICA_DEEPSLATE_ORE_KEY = registerBlockKey("mica_deepslate_ore");
    public static final RegistryKey<Block> MICA_BLOCK_KEY = registerBlockKey("mica_block");
    public static final RegistryKey<Block> MICA_PILLAR_KEY = registerBlockKey("mica_pillar");
    public static final RegistryKey<Block> INERTSTONE_BLOCK_KEY = registerBlockKey("inertstone_block");
    public static final RegistryKey<Block> VOLKITE_BLOCK_KEY = registerBlockKey("volkite_block");

    //Block List
    public static final Block ELEKTIK_STONE_ORE = registerBlock(new ExperienceDroppingBlock(UniformIntProvider.create(1, 5), AbstractBlock.Settings.create().registryKey(ELEKTIK_STONE_ORE_KEY).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.STONE).strength(3.0F, 3.0F).requiresTool()), ELEKTIK_STONE_ORE_KEY, true);
    public static final Block ELEKTIK_DEEPSLATE_ORE = registerBlock(new ExperienceDroppingBlock(UniformIntProvider.create(1, 5), AbstractBlock.Settings.create().registryKey(ELEKTIK_DEEPSLATE_ORE_KEY).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(4.5F, 3.0F).requiresTool()), ELEKTIK_DEEPSLATE_ORE_KEY, true);
    public static final Block ELEKTIK_BLOCK = registerBlock(new Block(AbstractBlock.Settings.create().registryKey(ELEKTIK_BLOCK_KEY).instrument(NoteBlockInstrument.CHIME).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(5.0f, 6.0f).requiresTool()), ELEKTIK_BLOCK_KEY, true);
    public static final Block ELEKTIK_SAND = registerBlock(new ElektikSandBlock(AbstractBlock.Settings.create().registryKey(ELEKTIK_SAND_KEY).instrument(NoteBlockInstrument.CHIME).strength(0.5F).sounds(BlockSoundGroup.SAND)), ELEKTIK_SAND_KEY, true);
    public static final Block AMBORIUM_STONE_ORE = registerBlock(new Block(AbstractBlock.Settings.create().registryKey(AMBORIUM_STONE_ORE_KEY).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.STONE).strength(3.0F, 3.0F).requiresTool()), AMBORIUM_STONE_ORE_KEY, true);
    public static final Block AMBORIUM_DEEPSLATE_ORE = registerBlock(new Block(AbstractBlock.Settings.create().registryKey(AMBORIUM_DEEPSLATE_ORE_KEY).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(4.5F, 3.0F).requiresTool()), AMBORIUM_DEEPSLATE_ORE_KEY, true);
    public static final Block RAW_AMBORIUM_BLOCK = registerBlock(new Block(AbstractBlock.Settings.create().registryKey(RAW_AMBORIUM_BLOCK_KEY).instrument(NoteBlockInstrument.BASEDRUM).strength(5.0f, 6.0f).requiresTool()), RAW_AMBORIUM_BLOCK_KEY, true);
    public static final Block AMBORIUM_BLOCK = registerBlock(new Block(AbstractBlock.Settings.create().registryKey(AMBORIUM_BLOCK_KEY).instrument(NoteBlockInstrument.IRON_XYLOPHONE).strength(5.0f, 6.0f).sounds(BlockSoundGroup.COPPER).requiresTool()), AMBORIUM_BLOCK_KEY, true);
    public static final Block MICA_STONE_ORE = registerBlock(new ExperienceDroppingBlock(UniformIntProvider.create(0, 3), AbstractBlock.Settings.create().registryKey(MICA_STONE_ORE_KEY).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.STONE).strength(3.0F, 3.0F).requiresTool()), MICA_STONE_ORE_KEY, true);
    public static final Block MICA_DEEPSLATE_ORE = registerBlock(new ExperienceDroppingBlock(UniformIntProvider.create(0, 3), AbstractBlock.Settings.create().registryKey(MICA_DEEPSLATE_ORE_KEY).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.DEEPSLATE).strength(4.5F, 3.0F).requiresTool()), MICA_DEEPSLATE_ORE_KEY, true);
    public static final Block MICA_BLOCK = registerBlock(new PillarBlock(AbstractBlock.Settings.create().registryKey(MICA_BLOCK_KEY).instrument(NoteBlockInstrument.BASEDRUM).strength(0.5f,1.0f).sounds(BlockSoundGroup.BASALT).requiresTool()), MICA_BLOCK_KEY, true);
    public static final Block MICA_PILLAR = registerBlock(new PillarBlock(AbstractBlock.Settings.create().registryKey(MICA_PILLAR_KEY).instrument(NoteBlockInstrument.BASEDRUM).strength(0.5f,1.0f).sounds(BlockSoundGroup.BASALT).requiresTool()), MICA_PILLAR_KEY, true);
    public static final Block INERTSTONE_BLOCK = registerBlock(new InertstoneBlock(AbstractBlock.Settings.create().registryKey(INERTSTONE_BLOCK_KEY).instrument(NoteBlockInstrument.BIT).strength(0.5F).sounds(BlockSoundGroup.SAND)), INERTSTONE_BLOCK_KEY, true);
    public static final Block VOLKITE_BLOCK = registerBlock(new Block(AbstractBlock.Settings.create().registryKey(VOLKITE_BLOCK_KEY).instrument(NoteBlockInstrument.GUITAR).strength(5.0f, 6.0f).sounds(BlockSoundGroup.ANVIL).requiresTool()), VOLKITE_BLOCK_KEY, true);

    public static Block registerBlock(Block block, RegistryKey<Block> blockKey, boolean shouldBeItem) {
        if (shouldBeItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static RegistryKey<Block> registerBlockKey(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MountingCharge.MOD_ID, name));
    }

    public static void blockRegistry() {

    }
}
