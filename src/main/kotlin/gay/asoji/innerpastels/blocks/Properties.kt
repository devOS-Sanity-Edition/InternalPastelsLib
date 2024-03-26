package gay.asoji.innerpastels.blocks

import gay.asoji.innerpastels.crab.CrabInTheCode
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.LeavesBlock
import net.minecraft.world.level.block.state.BlockBehaviour

/**
 * A list of Block Properties, mostly copyOf's, to be used with making new blocks.
 */
object Properties {
    /**
     * Default properties for a Pastel Block, being a copy of WHITE_CONCRETE
     */
    fun PastelBlock(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)
    }

    /**
     * Default properties for a Pastel Powder Block, being a copy of WHITE_CONCRETE_POWDER
     */
    fun PastelPowder(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE_POWDER)
    }

    /**
     * Default properties for a Pastel Glass Pane, being a copy of WHITE_STAINED_GLASS, with vision not being blocked, and can't suffocate
     */
    fun PastelGlassPane(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)
            .blockVision(Blocks::never)
            .suffocates(Blocks::never)
    }

    /**
     * Default properties for a Pastel Fence, being a copy of NETHER_BRICK_FENCE
     */
    fun PastelFence(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE)
    }

    /**
     * Default properties for a Pastel Fence Gate, being a copy of Stone's properties, will probably get reworked in the future.
     */
    fun PastelFenceGate(): FabricBlockSettings {
        return FabricBlockSettings.copyOf(Blocks.STONE)
    }

    /**
     * Default properties for a Pastel Wall, being a copy of STONE_BRICK_WALL
     */
    fun PastelWall(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)
    }

    /**
     * Default properties for a Pastel Slab, being a copy of STONE_SLAB
     */
    fun PastelSlab(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
    }

    /**
     * Default properties for a Pastel Stair, being a copy of STONE_STAIRS
     */
    fun PastelStair(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)
    }

    /**
     * Default properties for a Pastel Wool, being a copy of WHITE_WOOL
     */
    fun PastelWool(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)
    }

    /**
     * Default properties for a Pastel Light, being a copy of GLOWSTONE
     */
    fun PastelLight(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.GLOWSTONE)
    }

    /**
     * Default properties for a Pastel Carpet, being a copy of WHITE_CARPET
     */
    fun PastelCarpet(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)
    }

    /**
     * Default properties for a Pastel Glass, being a copy of WHITE_STAINED_GLASS
     */
    fun PastelGlass(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)
            .blockVision(Blocks::never)
            .suffocates(Blocks::never)
    }

    // **UNUSED**
    fun PastelCrops(): BlockBehaviour.Properties {
        return (FabricBlockSettings.copyOf(Blocks.WHEAT))
    }

    /**
     * Default properties for a Pastel Leaves, being a copy of OAK_LEAVES
     */
    fun PastelLeaves(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)
            .blockVision(Blocks::never)
            .suffocates(Blocks::never)
    }

    /**
     * Default properties for a Pastel Log, being a copy of OAK_LOG
     */
    fun PastelLogs(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.OAK_LOG)
    }

    /**
     * Default properties for a Pastel Plank, being a copy of OAK_PLANKS
     */
    fun PastelPlanks(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
    }

    /**
     * @suppress
     */
    object crab3 { val crab3 = CrabInTheCode.crabDeezNuts("according to all unknown laws of aviation, crabs can float and snip your hair off") }

    /**
     * Default properties for a Pastel Sand, being a copy of SAND
     */
    fun PastelSand(): BlockBehaviour.Properties {
        return FabricBlockSettings.copyOf(Blocks.SAND)
    }
}
