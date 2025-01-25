package com.laikastoolbox.mountingcharge;

import com.laikastoolbox.mountingcharge.datagen.LootTableGen;
import com.laikastoolbox.mountingcharge.datagen.ModelGen;
import com.laikastoolbox.mountingcharge.datagen.tagproviders.BlockTagGen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MountingChargeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelGen::new);
		pack.addProvider(LootTableGen::new);
		pack.addProvider(BlockTagGen::new);
	}
}
