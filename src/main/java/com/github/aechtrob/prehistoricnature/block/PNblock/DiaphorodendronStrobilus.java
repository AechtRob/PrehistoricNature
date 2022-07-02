package com.github.aechtrob.prehistoricnature.block.PNblock;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import com.github.aechtrob.prehistoricnature.block.customblock.PNDecayableDirectional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;
import java.util.Random;

public class DiaphorodendronStrobilus extends PNDecayableDirectional {
    private static final Map<Direction, VoxelShape> AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 8.0D, 12.0D, 12.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 8.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 8.0D, 12.0D, 12.0D),
            Direction.UP, Block.box(4.0D, 0.0D, 4.0D, 8.0D, 8.0D, 8.0D),
            Direction.DOWN, Block.box(4.0D, 0.0D, 4.0D, 8.0D, 8.0D, 8.0D)
    ));

    public DiaphorodendronStrobilus(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(PERSISTENT, Boolean.valueOf(false)).setValue(FACING, Direction.DOWN));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random rand) {
        if (!state.getValue(PERSISTENT)) {
            if (world.getBlockState(pos.relative(state.getValue(FACING).getOpposite())).getBlock()
                != ModBlocks.DIAPHORODENDRON_LEAVES.get()) {
                world.removeBlock(pos, false);
            }
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_58153_, BlockPos p_58154_, CollisionContext p_58155_) {
        return getShape(state);
    }

    public static VoxelShape getShape(BlockState state) {
        return AABBS.get(state.getValue(FACING));
    }

}
