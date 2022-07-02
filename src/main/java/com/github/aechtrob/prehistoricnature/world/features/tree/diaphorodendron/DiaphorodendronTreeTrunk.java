package com.github.aechtrob.prehistoricnature.world.features.tree.diaphorodendron;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import com.github.aechtrob.prehistoricnature.block.customblock.PNLog;
import com.github.aechtrob.prehistoricnature.world.features.tree.PNTreeFeature;
import com.github.aechtrob.prehistoricnature.world.features.tree.PNTrunkPlacer;
import com.google.common.collect.Lists;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class DiaphorodendronTreeTrunk extends PNTrunkPlacer {

    public DiaphorodendronTreeTrunk(int p_70268_, int p_70269_, int p_70270_) {
        super(p_70268_, p_70269_, p_70270_);
    }

    //public static void growTree(ServerLevel world, BlockPos pos, Random rand, boolean vines, boolean vines2, boolean SaplingSpawn) {

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader levelSimulatedReader, BiConsumer<BlockPos, BlockState> biConsumer, Random random, int p_161871_, BlockPos pos, TreeConfiguration treeConfiguration) {

        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();
        int height = 0;
        int counter = 0;
        BlockState logState = ModBlocks.DIAPHORODENDRON_LOG.get().defaultBlockState();
        BlockState woodState = ModBlocks.DIAPHORODENDRON_WOOD.get().defaultBlockState();

        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos)) {
            biConsumer.accept(pos, logState);
            placeLog(levelSimulatedReader, biConsumer, random, pos, treeConfiguration);
        }

        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south())) {
            biConsumer.accept(pos.south(), logState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.south(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south(2))) {
            biConsumer.accept(pos.south(2), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
            placeLog(levelSimulatedReader, biConsumer, random, pos.south(2), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north())) {
            biConsumer.accept(pos.north(), logState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.north(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north(2))) {
            biConsumer.accept(pos.north(2), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
            placeLog(levelSimulatedReader, biConsumer, random, pos.north(2), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east())) {
            biConsumer.accept(pos.east(), logState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.east(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east(2))) {
            biConsumer.accept(pos.east(2), logState.setValue(PNLog.AXIS, Direction.Axis.X));
            placeLog(levelSimulatedReader, biConsumer, random, pos.east(2), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west())) {
            biConsumer.accept(pos.west(), logState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.west(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west(2))) {
            biConsumer.accept(pos.west(2), logState.setValue(PNLog.AXIS, Direction.Axis.X));
            placeLog(levelSimulatedReader, biConsumer, random, pos.west(2), treeConfiguration);
        }

        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east().above())) {
            biConsumer.accept(pos.east().above(), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.east().above(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east().above(2))) {
            biConsumer.accept(pos.east().above(2), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.east().above(2), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west().above())) {
            biConsumer.accept(pos.west().above(), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.west().above(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west().above(2))) {
            biConsumer.accept(pos.west().above(2), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.west().above(2), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south().above())) {
            biConsumer.accept(pos.south().above(), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.south().above(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south().above(2))) {
            biConsumer.accept(pos.south().above(2), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.south().above(2), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north().above())) {
            biConsumer.accept(pos.north().above(), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.north().above(), treeConfiguration);
        }
        if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north().above(2))) {
            biConsumer.accept(pos.north().above(2), woodState);
            placeLog(levelSimulatedReader, biConsumer, random, pos.north().above(2), treeConfiguration);
        }

        height = 18;
        height = height + (int) Math.round((Math.random() * 100D) / 8D);

        counter = 0;
        while (counter <= height) {
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.above(1 + counter))) {
                biConsumer.accept(pos.above(1 + counter), logState);
                placeLog(levelSimulatedReader, biConsumer, random, pos.above(1 + counter), treeConfiguration);
            }
            counter += 1;
        }

        //counter = counter - 1;

        //Leaves:
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter + 1, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, counter, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(3, counter, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, counter, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-3, counter, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter, 2), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter, 3), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter, -1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter, -2), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter, -3), 0, true));

        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 1, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(3, counter - 1, 0), 0, true));

        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 1, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-3, counter - 1, 0), 0, true));

        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 1, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 1, 3), 0, true));

        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 1, -1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 1, -3), 0, true));

        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 2, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 2, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 2, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 2, -1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 2, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 2, -1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 2, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 2, -1), 0, true));

        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 3, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 3, 0), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 3, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 3, -1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 3, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 3, -1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 3, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 3, -1), 0, true));

        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 3, 2), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, counter - 3, -2), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 3, 2), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, counter - 3, -2), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, counter - 3, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, counter - 3, -1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, counter - 3, 1), 0, true));
        list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, counter - 3, -1), 0, true));

        int yy;
        //North
        if (Math.random() >= 0.75) {
            //Drop the branch a row
            yy = (int) counter - 4;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north().above(yy))) {
                biConsumer.accept(pos.north().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.north().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north(2).above(yy))) {
                biConsumer.accept(pos.north(2).above(), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.north(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, -2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, -2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -3), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -4), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -5), 0, true));
            yy = (int) counter - 5;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -5), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 6, -5), 1, true));
            }
        }
        else {
            yy = (int) counter - 3;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north().above(yy))) {
                biConsumer.accept(pos.north().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.north().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.north(2).above(yy))) {
                biConsumer.accept(pos.north(2).above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.north(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, -2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, -2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -3), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -4), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -5), 0, true));
            yy = (int) counter - 4;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, -5), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 5, -5), 1, true));
            }
        }

        //South
        if (Math.random() >= 0.75) {
            //Drop the branch a row
            yy = (int) counter - 4;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south().above(yy))) {
                biConsumer.accept(pos.south().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.south().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south(2).above(yy))) {
                biConsumer.accept(pos.south(2).above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.south(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 3), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 4), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 5), 0, true));
            yy = (int) counter - 5;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 5), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 6, 5), 1, true));
            }
        }
        else {
            yy = (int) counter - 3;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south().above(yy))) {
                biConsumer.accept(pos.south().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.south().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.south(2).above(yy))) {
                biConsumer.accept(pos.south(2).above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.Z));
                placeLog(levelSimulatedReader, biConsumer, random, pos.south(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 2), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 3), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 4), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 5), 0, true));
            yy = (int) counter - 4;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, yy, 5), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 5, 5), 1, true));
            }
        }

        //East
        if (Math.random() >= 0.75) {
            //Drop the branch a row
            yy = (int) counter - 4;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east().above(yy))) {
                biConsumer.accept(pos.east().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.east().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east(2).above(yy))) {
                biConsumer.accept(pos.east(2).above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.east(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(3, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(4, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(5, yy, 0), 0, true));
            yy = (int) counter - 5;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(5, yy, 0), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(5, counter - 6, 0), 1, true));
            }
        }
        else {
            yy = (int) counter - 3;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east().above(yy))) {
                biConsumer.accept(pos.east().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.east().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.east(2).above(yy))) {
                biConsumer.accept(pos.east(2).above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.east(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(1, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(2, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(3, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(4, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(5, yy, 0), 0, true));
            yy = (int) counter - 4;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(5, yy, 0), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(5, counter - 5, 0), 1, true));
            }
        }

        //West
        if (Math.random() >= 0.75) {
            //Drop the branch a row
            yy = (int) counter - 4;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west().above(yy))) {
                biConsumer.accept(pos.west().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.west().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west(2).above(yy))) {
                biConsumer.accept(pos.west(2).above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.west(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-3, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-4, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-5, yy, 0), 0, true));
            yy = (int) counter - 5;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-5, yy, 0), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-5, counter - 6, 0), 1, true));
            }
        }
        else {
            yy = (int) counter - 3;
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west().above(yy))) {
                biConsumer.accept(pos.west().above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.west().above(yy), treeConfiguration);
            }
            if (PNTreeFeature.canLogReplaceBlock(levelSimulatedReader, pos.west(2).above(yy))) {
                biConsumer.accept(pos.west(2).above(yy), logState.setValue(PNLog.AXIS, Direction.Axis.X));
                placeLog(levelSimulatedReader, biConsumer, random, pos.west(2).above(yy), treeConfiguration);
            }

            //Foliage:
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, yy, 1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, yy, -1), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-1, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-2, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-3, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-4, yy, 0), 0, true));
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-5, yy, 0), 0, true));
            yy = (int) counter - 4;
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-5, yy, 0), 0, true));

            //Strobili:
            if ((Math.random() > 0.4)) {
                list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-5, counter - 5, 0), 1, true));
            }
        }

        
        //Strobili:
        if ((Math.random() > 0.4)) {
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(3, counter - 2, 0), 1, true));
        }
        if ((Math.random() > 0.4)) {
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(-3, counter - 2, 0), 1, true));
        }
        if ((Math.random() > 0.4)) {
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 2, 3), 1, true));
        }
        if ((Math.random() > 0.4)) {
            list.add(new FoliagePlacer.FoliageAttachment(pos.offset(0, counter - 2, -3), 1, true));
        }

        return list;
    }

}
