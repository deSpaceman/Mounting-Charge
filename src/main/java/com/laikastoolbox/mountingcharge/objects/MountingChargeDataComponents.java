package com.laikastoolbox.mountingcharge.objects;

import com.laikastoolbox.mountingcharge.MountingCharge;
import com.mojang.serialization.Codec;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MountingChargeDataComponents {
    public static final ComponentType<Integer> CHARGE = Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(MountingCharge.MOD_ID, "charge"), ComponentType.<Integer>builder().codec(Codec.INT).build());

    public static void registerDataComp() {

    }
}
