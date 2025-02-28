package com.laikastoolbox.mountingcharge.objects;

import com.laikastoolbox.mountingcharge.MountingCharge;
import com.laikastoolbox.mountingcharge.objects.items.ChargedItem;
import com.laikastoolbox.mountingcharge.objects.items.LightningCallerItem;
import com.laikastoolbox.mountingcharge.objects.items.tools.RockpiercerItem;
import com.laikastoolbox.mountingcharge.objects.items.tools.ThunderbladeItem;
import com.laikastoolbox.mountingcharge.properties.MountingChargeTags;
import net.minecraft.block.BlockKeys;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

public class MountingChargeItems {
    //Tool Materials
    public static final ToolMaterial AMBORIUM_TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 6.5F, 2.0F, 10, MountingChargeTags.AMBORIUM_TOOL_MATERIALS);
    public static final ToolMaterial VOLKITE_TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2050, 9.5F, 4.0F, 13, MountingChargeTags.VOLKITE_TOOL_MATERIALS);

    //Registry Keys
    public static final RegistryKey<Item> ELEKTIK_KEY = registerItemKey("elektik");
    public static final RegistryKey<Item> CRACKLED_ELEKTIK_KEY = registerItemKey("crackled_elektik");
    public static final RegistryKey<Item> CHARGED_ELEKTIK_KEY = registerItemKey("charged_elektik");
    public static final RegistryKey<Item> RAW_AMBORIUM_KEY = registerItemKey("raw_amborium");
    public static final RegistryKey<Item> AMBORIUM_INGOT_KEY = registerItemKey("amborium_ingot");
    public static final RegistryKey<Item> AMBORIUM_THUNDERBLADE_KEY = registerItemKey("amborium_thunderblade");
    public static final RegistryKey<Item> AMBORIUM_ROCKPIERCER_KEY = registerItemKey("amborium_rockpiercer");
    public static final RegistryKey<Item> REDSTONE_POWERCELL_KEY = registerItemKey("redstone_powercell");
    public static final RegistryKey<Item> MICA_KEY = registerItemKey("mica");
    public static final RegistryKey<Item> LIGHTNING_CALLER_KEY = registerItemKey("lightning_caller");
    public static final RegistryKey<Item> INERTSTONE_DUST_KEY = registerItemKey("inertstone_dust");
    public static final RegistryKey<Item> VOLKITE_BLEND_KEY = registerItemKey("volkite_blend");
    public static final RegistryKey<Item> VOLKITE_INGOT_KEY = registerItemKey("volkite_ingot");
    public static final RegistryKey<Item> VOLKITE_THUNDERBLADE_KEY = registerItemKey("volkite_thunderblade");
    public static final RegistryKey<Item> VOLKITE_ROCKPIERCER_KEY = registerItemKey("volkite_rockpiercer");
    public static final RegistryKey<Item> VOLKITE_POWERCELL_KEY = registerItemKey("volkite_powercell");

    //Material List
    public static final Item ELEKTIK = registerItem(new Item(new Item.Settings().registryKey(ELEKTIK_KEY)), ELEKTIK_KEY);
    public static final Item CRACKLED_ELEKTIK = registerItem(new Item(new Item.Settings().registryKey(CRACKLED_ELEKTIK_KEY)), CRACKLED_ELEKTIK_KEY);
    public static final Item CHARGED_ELEKTIK = registerItem(new ChargedItem(new Item.Settings().registryKey(CHARGED_ELEKTIK_KEY), 9), CHARGED_ELEKTIK_KEY);
    public static final Item RAW_AMBORIUM = registerItem(new Item(new Item.Settings().registryKey(RAW_AMBORIUM_KEY)), RAW_AMBORIUM_KEY);
    public static final Item AMBORIUM_INGOT = registerItem(new Item(new Item.Settings().registryKey(AMBORIUM_INGOT_KEY)), AMBORIUM_INGOT_KEY);
    public static final Item REDSTONE_POWERCELL = registerItem(new ChargedItem(new Item.Settings().registryKey(REDSTONE_POWERCELL_KEY), 270), REDSTONE_POWERCELL_KEY);
    public static final Item MICA = registerItem(new Item(new Item.Settings().registryKey(MICA_KEY)), MICA_KEY);
    public static final Item INERTSTONE_DUST = registerItem(new Item(new Item.Settings().registryKey(INERTSTONE_DUST_KEY)), INERTSTONE_DUST_KEY);
    public static final Item VOLKITE_BLEND = registerItem(new Item(new Item.Settings().registryKey(VOLKITE_BLEND_KEY)), VOLKITE_BLEND_KEY);
    public static final Item VOLKITE_INGOT = registerItem(new Item(new Item.Settings().registryKey(VOLKITE_INGOT_KEY)), VOLKITE_INGOT_KEY);
    public static final Item VOLKITE_POWERCELL = registerItem(new ChargedItem(new Item.Settings().registryKey(VOLKITE_POWERCELL_KEY), 90), VOLKITE_POWERCELL_KEY);

    //Tools
    public static final Item LIGHTNING_CALLER = registerItem(new LightningCallerItem(new Item.Settings().registryKey(LIGHTNING_CALLER_KEY).maxDamage(250)), LIGHTNING_CALLER_KEY);
    public static final Item AMBORIUM_THUNDERBLADE = registerItem(new ThunderbladeItem(AMBORIUM_TOOL_MATERIAL, 3.0F, -2.4F, new Item.Settings().registryKey(AMBORIUM_THUNDERBLADE_KEY), 180), AMBORIUM_THUNDERBLADE_KEY);
    public static final Item AMBORIUM_ROCKPIERCER = registerItem(new RockpiercerItem(AMBORIUM_TOOL_MATERIAL, BlockTags.NEEDS_IRON_TOOL, 1.0F, -2.8F, new Item.Settings().registryKey(AMBORIUM_ROCKPIERCER_KEY), 360), AMBORIUM_ROCKPIERCER_KEY);
    public static final Item VOLKITE_THUNDERBLADE = registerItem(new ThunderbladeItem(VOLKITE_TOOL_MATERIAL, 3.0F, -2.4F, new Item.Settings().registryKey(VOLKITE_THUNDERBLADE_KEY), 1800), VOLKITE_THUNDERBLADE_KEY);
    public static final Item VOLKITE_ROCKPIERCER = registerItem(new RockpiercerItem(VOLKITE_TOOL_MATERIAL, BlockTags.NEEDS_DIAMOND_TOOL, 1.0F, -2.8F, new Item.Settings().registryKey(VOLKITE_ROCKPIERCER_KEY), 3600), VOLKITE_ROCKPIERCER_KEY);

    public static Item registerItem(Item item, RegistryKey<Item> registryKey) {
        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

    public static RegistryKey<Item> registerItemKey(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MountingCharge.MOD_ID, name));
    }

    public static void itemRegistry() {

    }
}
