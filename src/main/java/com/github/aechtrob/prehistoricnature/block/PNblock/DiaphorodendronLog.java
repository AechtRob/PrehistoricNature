package com.github.aechtrob.prehistoricnature.block.PNblock;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import com.github.aechtrob.prehistoricnature.block.customblock.PNLog;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class DiaphorodendronLog extends PNLog {
    public DiaphorodendronLog(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        Block block = state.getBlock();
        if (block == ModBlocks.DIAPHORODENDRON_LOG.get()) {
            switch (state.getValue(AXIS)){
                case Y:
                    return ModBlocks.STRIPPED_DIAPHORODENDRON_LOG.get().defaultBlockState();
                case Z:
                    return ModBlocks.STRIPPED_DIAPHORODENDRON_LOG.get().defaultBlockState().setValue(AXIS, Direction.Axis.Z);
                case X:
                    return ModBlocks.STRIPPED_DIAPHORODENDRON_LOG.get().defaultBlockState().setValue(AXIS, Direction.Axis.X);
                default:
                    return ModBlocks.STRIPPED_DIAPHORODENDRON_LOG.get().defaultBlockState();
            }
        } else {
            return super.getToolModifiedState(state, context, toolAction, simulate);
        }
    }
}
