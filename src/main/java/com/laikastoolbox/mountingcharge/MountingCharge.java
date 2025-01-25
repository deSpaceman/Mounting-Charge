package com.laikastoolbox.mountingcharge;

import com.laikastoolbox.mountingcharge.objects.MountingChargeBlocks;
import com.laikastoolbox.mountingcharge.objects.MountingChargeDataComponents;
import com.laikastoolbox.mountingcharge.objects.MountingChargeItems;
import com.laikastoolbox.mountingcharge.objects.MountingChargeTab;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MountingCharge implements ModInitializer {
	public static final String MOD_ID = "mountingcharge";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Taste the thunder, ride the lightning!");
		MountingChargeDataComponents.registerDataComp();
		MountingChargeItems.itemRegistry();
		MountingChargeBlocks.blockRegistry();
		MountingChargeTab.registerTab();
	}
}