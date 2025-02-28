package com.laikastoolbox.mountingcharge.objects.items.tools;

import com.laikastoolbox.mountingcharge.objects.items.ChargedWeaponItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.Optional;

public class ThunderbladeItem extends ChargedWeaponItem {
    public ThunderbladeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings, int maxCharge) {
        super(material, attackDamage, attackSpeed, settings, maxCharge);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        LivingEntity target = staticSpear(world, user);

        if (target != null) {
            user.sendMessage(target.getName(), true);
        }

        return super.use(world, user, hand);
    }

    protected static LivingEntity staticSpear(World world, PlayerEntity player) {
        Vec3d playerVec = player.getEyePos();
        Vec3d endVec = playerVec.add(player.getRotationVector(player.getPitch(), player.getYaw()).multiply(2 * player.getBlockInteractionRange()));

        Box box = new Box(playerVec, endVec).expand(1.0);
        List<Entity> entities = world.getOtherEntities(player, box);

        for (Entity entity : entities) {
            Box entityBox = entity.getBoundingBox().expand(0.5);
            Optional<Vec3d> hitResult = entityBox.raycast(playerVec, endVec);

            if (hitResult.isPresent()) {
                return (LivingEntity) entity;
            }
        }

        return null;
    }
}
