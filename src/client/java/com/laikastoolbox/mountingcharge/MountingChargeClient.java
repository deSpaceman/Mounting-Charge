package com.laikastoolbox.mountingcharge;

import com.laikastoolbox.mountingcharge.objects.MountingChargeDataComponents;
import com.laikastoolbox.mountingcharge.objects.items.ChargedToolItem;
import com.laikastoolbox.mountingcharge.objects.items.ChargedWeaponItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.*;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class MountingChargeClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		//Code made by referencing the source code from Breakable by sten-code (https://modrinth.com/mod/breakable)
		UseItemCallback.EVENT.register((user, world, hand) -> {
			ItemStack stack = user.getStackInHand(hand);
			Item item = stack.getItem();

			if (item instanceof ChargedToolItem || item instanceof ChargedWeaponItem) {
				if (stack.get(MountingChargeDataComponents.CHARGE) == 0) {
					depleted(user);
					return ActionResult.FAIL;
				}
			}

			return ActionResult.PASS;
		});

		UseBlockCallback.EVENT.register((user, world, hand, hitResult) -> {
			ItemStack stack = user.getStackInHand(hand);
			Item item = stack.getItem();

			if (item instanceof ChargedToolItem || item instanceof ChargedWeaponItem) {
				if (stack.get(MountingChargeDataComponents.CHARGE) == 0) {
					depleted(user);
					return ActionResult.FAIL;
				}
			}

			return ActionResult.PASS;
		});

		AttackBlockCallback.EVENT.register((user, world, hand, pos, direction) -> {
			ItemStack stack = user.getStackInHand(hand);
			Item item = stack.getItem();
			BlockState state = world.getBlockState(pos);

			if (item instanceof ChargedToolItem || item instanceof ChargedWeaponItem) {
				if (stack.get(MountingChargeDataComponents.CHARGE) == 0 && state.getHardness(world, pos) != 0.0F) {
					depleted(user);
					return ActionResult.FAIL;
				}
			}

			return ActionResult.PASS;
		});

		UseEntityCallback.EVENT.register((user, world, hand, entity, hitResult) -> {
			ItemStack stack = user.getStackInHand(hand);
			Item item = stack.getItem();

			if (item instanceof ChargedToolItem || item instanceof ChargedWeaponItem) {
				if (stack.get(MountingChargeDataComponents.CHARGE) == 0) {
					depleted(user);
					return ActionResult.FAIL;
				}
			}

			return ActionResult.PASS;
		});

		AttackEntityCallback.EVENT.register((user, world, hand, entity, hitResult) -> {
			ItemStack stack = user.getStackInHand(hand);
			Item item = stack.getItem();

			if (item instanceof ChargedToolItem || item instanceof ChargedWeaponItem) {
				if (stack.get(MountingChargeDataComponents.CHARGE) == 0) {
					depleted(user);
					return ActionResult.FAIL;
				}
			}

			return ActionResult.PASS;
		});
	}

	private void depleted(PlayerEntity player) {
		player.sendMessage(Text.translatable("message.mountingcharge.depleted_energy"), true);
	}
}