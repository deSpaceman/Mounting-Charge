package com.laikastoolbox.mountingcharge.objects.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ElektikSandBlock extends FallingBlock {
    public ElektikSandBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        return null;
    }

    @Override
    public int getColor(BlockState state, BlockView world, BlockPos pos) {
        return 1844053;
    }

    @Override
    protected int getFallDelay() {
        return 1;
    }
}
