package gay.asoji.innerpastels.blocks

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.LeavesBlock
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.state.BlockBehaviour

object Properties {
    fun PastelBlock(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)
    }

    fun PastelPowder(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)
    }

    fun PastelGlassPane(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)
            .blockVision(Blocks::never)
            .suffocates(Blocks::never)
    }

    fun PastelFence(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE)
    }

    fun PastelFenceGate(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.STONE)
    }

    fun PastelWall(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)
    }

    fun PastelSlab(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
    }

    fun PastelStair(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
    }

    fun PastelWool(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)
    }

    fun PastelLight(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.GLOWSTONE)
    }

    fun PastelCarpet(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)
    }

    fun PastelGlass(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)
    }

    fun PastelCrops(): BlockBehaviour.Properties {
        return (FabricBlockSettings.copyOf(Blocks.WHEAT))
    }

    fun PastelLeaves(): LeavesBlock {
        return LeavesBlock(
            FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)
                .nonOpaque()
                .blockVision(Blocks::never)
                .suffocates(Blocks::never)
        )
    }

    fun PastelLogs(): Block {
        return RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG))
    }

    fun PastelPlanks(): Block {
        return Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS))
    }

    fun PastelSand(): Block {
        return Block(FabricBlockSettings.copyOf(Blocks.SAND))
    }
}
