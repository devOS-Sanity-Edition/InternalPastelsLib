package gay.asoji.innerpastels.blocks

import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.state.BlockBehaviour

/**
 * A list of Block Properties, mostly copyOf's, to be used with making new blocks.
 */
object Properties {
    /**
     * Default properties for a Pastel Block, being a copy of WHITE_CONCRETE
     */
    fun pastelBlock(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)
    }

    /**
     * Default properties for a Pastel Powder Block, being a copy of WHITE_CONCRETE_POWDER
     */
    fun pastelPowder(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE_POWDER)
    }

    /**
     * Default properties for a Pastel Glass Pane, being a copy of WHITE_STAINED_GLASS, with vision not being blocked, and can't suffocate
     */
    fun pastelGlassPane(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS_PANE)
            .isViewBlocking(Blocks::never)
            .isSuffocating(Blocks::never)
    }

    /**
     * Default properties for a Pastel Fence, being a copy of NETHER_BRICK_FENCE
     */
    fun pastelFence(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE)
    }

    /**
     * Default properties for a Pastel Fence Gate, being a copy of Stone's properties, will probably get reworked in the future.
     */
    fun pastelFenceGate(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
    }

    /**
     * Default properties for a Pastel Wall, being a copy of STONE_BRICK_WALL
     */
    fun pastelWall(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
    }

    /**
     * Default properties for a Pastel Slab, being a copy of STONE_SLAB
     */
    fun pastelSlab(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB)
    }

    /**
     * Default properties for a Pastel Stair, being a copy of STONE_STAIRS
     */
    fun pastelStair(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS)
    }

    /**
     * Default properties for a Pastel Wool, being a copy of WHITE_WOOL
     */
    fun pastelWool(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
    }

    /**
     * Default properties for a Pastel Light, being a copy of GLOWSTONE
     */
    fun pastelLight(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
    }

    /**
     * Default properties for a Pastel Carpet, being a copy of WHITE_CARPET
     */
    fun pastelCarpet(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET)
    }

    /**
     * Default properties for a Pastel Glass, being a copy of WHITE_STAINED_GLASS
     */
    fun pastelGlass(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)
            .isViewBlocking(Blocks::never)
            .isSuffocating(Blocks::never)
    }

    // **UNUSED**
    fun pastelCrops(): BlockBehaviour.Properties {
        return (BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT))
    }

    /**
     * Default properties for a Pastel Leaves, being a copy of OAK_LEAVES
     */
    fun pastelLeaves(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)
            .isViewBlocking(Blocks::never)
            .isSuffocating(Blocks::never)
    }

    /**
     * Default properties for a Pastel Log, being a copy of OAK_LOG
     */
    fun pastelLogs(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
    }

    /**
     * Default properties for a Pastel Plank, being a copy of OAK_PLANKS
     */
    fun pastelPlanks(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
    }

    /**
     * Default properties for a Pastel Sand, being a copy of SAND
     */
    fun pastelSand(): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SAND)
    }
}
