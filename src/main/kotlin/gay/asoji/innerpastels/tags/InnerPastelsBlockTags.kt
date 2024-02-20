package gay.asoji.innerpastels.tags

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.level.block.Block

/**
 * A bunch of block tags meant to be used for tagging blocks to their respective tags.
 *
 * Now try saying tags 100 times over.
 */
object InnerPastelsBlockTags {
    // A bunch of these tags are *probably* not needed but do they hurt to make? no not rly

    /**
     * Blocks assigned with this tag are deemed as portal blocks to whatever looks for `#innerpastels:valid_portal`
     * @return [InnerPastelsBlockTags.VALID_PORTAL]
     */
    val VALID_PORTAL: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:valid_portal"))

    // Softer
    /**
     * Blocks assigned with this tag are deemed as pastel blocks to whatever looks for `#innerpastels:pastel_blocks`
     * @return [InnerPastelsBlockTags.PASTEL_BLOCKS]
     */
    val PASTEL_BLOCKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:pastel_blocks"))

    /**
     * Blocks assigned with this tag are deemed as pastel powder blocks to whatever looks for `#innerpastels:pastel_powder_blocks`
     * @return [InnerPastelsBlockTags.PASTEL_POWDER_BLOCKS]
     */
    val PASTEL_POWDER_BLOCKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:pastel_powder_blocks"))

    /**
     * Blocks assigned with this tag are deemed as pastel fences to whatever looks for `#innerpastels:fences`
     * @return [InnerPastelsBlockTags.FENCES]
     */
    val FENCES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:fences"))

    /**
     * Blocks assigned with this tag are deemed as pastel fence gates to whatever looks for `#innerpastels:fence_gates`
     * @return [InnerPastelsBlockTags.FENCE_GATES]
     */
    val FENCE_GATES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:fence_gates"))

    /**
     * Blocks assigned with this tag are deemed as pastel walls to whatever looks for `#innerpastels:walls`
     * @return [InnerPastelsBlockTags.WALLS]
     *
     * By the way, I am living in your walls. **Boo.**
     */
    val WALLS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:walls"))

    /**
     * Blocks assigned with this tag are deemed as pastel slabs to whatever looks for `#innerpastels:slabs`
     * @return [InnerPastelsBlockTags.SLABS]
     */
    val SLABS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:slabs"))

    /**
     * Blocks assigned with this tag are deemed as pastel stairs to whatever looks for `#innerpastels:stairs`
     * @return [InnerPastelsBlockTags.STAIRS]
     */
    val STAIRS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:stairs"))

    /**
     * Blocks assigned with this tag are deemed as pastel wools to whatever looks for `#innerpastels:wools`
     * @return [InnerPastelsBlockTags.WOOLS]
     */
    val WOOLS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:wools"))

    /**
     * Blocks assigned with this tag are deemed as pastel lights to whatever looks for `#innerpastels:lights`
     * @return [InnerPastelsBlockTags.LIGHTS]
     */
    val LIGHTS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:lights"))

    /**
     * Blocks assigned with this tag are deemed as pastel carpets to whatever looks for `#innerpastels:carpets`
     * @return [InnerPastelsBlockTags.CARPETS]
     */
    val CARPETS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:carpets"))

    /**
     * Blocks assigned with this tag are deemed as pastel glass blocks to whatever looks for `#innerpastels:glass_blocks`
     * @return [InnerPastelsBlockTags.GLASS_BLOCKS]
     */
    val GLASS_BLOCKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:glass_blocks"))

    /**
     * Blocks assigned with this tag are deemed as pastel glass panes to whatever looks for `#innerpastels:glass_panes`
     * @return [InnerPastelsBlockTags.GLASS_PANES]
     */
    val GLASS_PANES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:glass_panes"))

    // Desolated
    // **UNDOCUMENTED FOR NOW**
    val ORES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:ores"))
    val LOGS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:logs"))
    val PLANKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:planks"))
    val LEAVES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:leaves"))
    val DIRT: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:dirt"))
    val GRASS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:grass"))
    val STONES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:stones"))
}