package gay.asoji.innerpastels.datagen

import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.model.ModelLocationUtils
import net.minecraft.data.models.model.ModelTemplates
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block

/**
 * Model Generators used for Model Data Generation, creating required JSON models for certain blocks, meant to be used with your ModelProvider datagen.
 */
object ModelGenerators {
    /**
     * Creates a slab model based off another block, `block:` being the reference block, `slab:` being the target slab, and just call your normal BlockStateModelGenerator after
     *
     * Example:
     * ```kotlin
     * class SofterPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
     *     override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
     *         createSlabs(SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK, blockStateModelGenerator)
     *     }
     * }
     * ```
     */
    fun createSlabs(block: Block, slab: Block, blockStateModelGenerator: BlockModelGenerators) {
        val texturedModel = TexturedModel.CUBE[block]
        val fullSlabModel = ModelLocationUtils.getModelLocation(block)
        val bottomSlab: ResourceLocation = ModelTemplates.SLAB_BOTTOM.create(
            slab,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val topSlab: ResourceLocation = ModelTemplates.SLAB_TOP.create(
            slab,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        blockStateModelGenerator.blockStateOutput.accept(
            BlockModelGenerators.createSlab(
                slab,
                bottomSlab,
                topSlab,
                fullSlabModel
            )
        )
        blockStateModelGenerator.delegateItemModel(slab, bottomSlab)
    }

    /**
     * Creates a stair model based off another block, `block:` being the reference block, `stair:` being the target stair, and just call your normal BlockStateModelGenerator after
     *
     * Example:
     * ```kotlin
     * class SofterPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
     *     override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
     *         createStairs(SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK, blockStateModelGenerator)
     *     }
     * }
     * ```
     */
    fun createStairs(block: Block, stairs: Block, blockStateModelGenerator: BlockModelGenerators) {
        val texturedModel = TexturedModel.CUBE[block]
        val innerStairs: ResourceLocation = ModelTemplates.STAIRS_INNER.create(
            stairs,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val straightStairs: ResourceLocation = ModelTemplates.STAIRS_STRAIGHT.create(
            stairs,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val outerStairs: ResourceLocation = ModelTemplates.STAIRS_OUTER.create(
            stairs,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        blockStateModelGenerator.blockStateOutput.accept(
            BlockModelGenerators.createStairs(
                stairs,
                innerStairs,
                straightStairs,
                outerStairs
            )
        )
        blockStateModelGenerator.delegateItemModel(stairs, straightStairs)
    }

    /**
     * Creates a fence model based off another block, `block:` being the reference block, `fence:` being the target fence, and just call your normal BlockStateModelGenerator after
     *
     * Example:
     * ```kotlin
     * class SofterPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
     *     override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
     *         createFence(SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK, blockStateModelGenerator)
     *     }
     * }
     * ```
     */
    fun createFence(block: Block, fence: Block, blockStateModelGenerator: BlockModelGenerators) {
        val texturedModel = TexturedModel.CUBE[block]
        val fencePost: ResourceLocation = ModelTemplates.FENCE_POST.create(
            fence,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val fenceSide: ResourceLocation = ModelTemplates.FENCE_SIDE.create(
            fence,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        blockStateModelGenerator.blockStateOutput.accept(
            BlockModelGenerators.createFence(
                fence,
                fencePost,
                fenceSide,
            )
        )
        val fenceInventoryModel: ResourceLocation = ModelTemplates.FENCE_INVENTORY.create(
            fence,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        blockStateModelGenerator.delegateItemModel(fence, fenceInventoryModel)
    }

    /**
     * Creates a fence gate model based off another block, `block:` being the reference block, `fenceGate:` being the target fence gate, and just call your normal BlockStateModelGenerator after
     *
     * Example:
     * ```kotlin
     * class SofterPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
     *     override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
     *         createFenceGate(SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK, blockStateModelGenerator)
     *     }
     * }
     * ```
     */
    fun createFenceGate(block: Block, fenceGate: Block, blockStateModelGenerator: BlockModelGenerators) {
        val texturedModel = TexturedModel.CUBE[block]
        val fenceGateOpen: ResourceLocation = ModelTemplates.FENCE_GATE_OPEN.create(
            fenceGate,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val fenceGateClosed: ResourceLocation = ModelTemplates.FENCE_GATE_CLOSED.create(
            fenceGate,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val fenceGateWallOpen: ResourceLocation = ModelTemplates.FENCE_GATE_WALL_OPEN.create(
            fenceGate,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val fenceGateWallClose: ResourceLocation = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(
            fenceGate,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        blockStateModelGenerator.blockStateOutput.accept(
            BlockModelGenerators.createFenceGate(
                fenceGate,
                fenceGateOpen,
                fenceGateClosed,
                fenceGateWallOpen,
                fenceGateWallClose,
                true
            )
        )
        blockStateModelGenerator.delegateItemModel(fenceGate, fenceGateClosed)
    }

    /**
     * Creates a wall model based off another block, `block:` being the reference block, `wall:` being the target wall, and just call your normal BlockStateModelGenerator after
     *
     * Example:
     * ```kotlin
     * class SofterPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
     *     override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
     *         createWall(SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK, blockStateModelGenerator)
     *     }
     * }
     * ```
     */
    fun createWall(block: Block, wall: Block, blockStateModelGenerator: BlockModelGenerators) {
        val texturedModel = TexturedModel.CUBE[block]
        val wallPost: ResourceLocation = ModelTemplates.WALL_POST.create(
            wall,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val wallLowSide: ResourceLocation = ModelTemplates.WALL_LOW_SIDE.create(
            wall,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        val wallTallSide: ResourceLocation = ModelTemplates.WALL_TALL_SIDE.create(
            wall,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        blockStateModelGenerator.blockStateOutput.accept(
            BlockModelGenerators.createWall(
                wall,
                wallPost,
                wallLowSide,
                wallTallSide,
            )
        )
        val wallInventoryModel: ResourceLocation = ModelTemplates.WALL_INVENTORY.create(
            wall,
            texturedModel.mapping,
            blockStateModelGenerator.modelOutput
        )
        blockStateModelGenerator.delegateItemModel(wall, wallInventoryModel)
    }
}