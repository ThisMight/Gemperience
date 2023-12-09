package com.gemperience.blocks.custom;

import com.gemperience.util.GemCrusherUtilities;
import com.gemperience.datagen.data.ModItemTag;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class GemGrinder extends Block {
    public GemGrinder(Settings settings, byte tier) {
        super(settings);
        this.tier = tier;
    }

    private final byte tier;

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static final VoxelShape SHAPE =
            Stream.of(
            Block.createCuboidShape(0, 0, 0, 2, 16, 16),
            Block.createCuboidShape(2, 0, 2, 14, 1, 14),
            Block.createCuboidShape(14, 0, 0, 16, 16, 16),
            Block.createCuboidShape(2, 0, 0, 14, 16, 2),
            Block.createCuboidShape(2, 0, 14, 14, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    //Deprecated, is fiiiineee.
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient && hand == Hand.MAIN_HAND) {
           if (player.getMainHandStack().isEmpty()){
               player.sendMessage(Text.translatable("block.grinder.info.item_empty"), true);
               return ActionResult.SUCCESS;
           } else if (player.getMainHandStack().isIn(ModItemTag.GEMS)) {
                //If the item that we're holding is a gem, continue here.
                GemCrusherUtilities.GemGrinder_Gems(tier, world, pos, (ServerPlayerEntity) player,
                        player.getMainHandStack(), null);
           } else if (player.getOffHandStack().isIn(ModItemTag.GEMS) && (player.getMainHandStack().isIn(ModItemTag.HAMMERS))){
               GemCrusherUtilities.GemGrinder_Gems(tier, world, pos, (ServerPlayerEntity) player,
                       player.getOffHandStack(), player.getMainHandStack());
           } else if (player.getMainHandStack().isIn(ModItemTag.HAMMERS)){
               player.sendMessage(Text.translatable("block.grinder.info.hammer_needs_gems"), true);
           }
            else {
                player.sendMessage(Text.translatable("block.grinder.info.item_unusable"), true);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.SUCCESS;
    }
}
