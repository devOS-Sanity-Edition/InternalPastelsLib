package gay.asoji.innerpastels.tags

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.level.block.Block

object InnerPastelsBlockTags {
    // A bunch of these tags are *probably* not needed but do they hurt to make? no not rly
    val VALID_PORTAL: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:valid_portal"))

    // Softer
    val PASTEL_BLOCKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:pastel_blocks"))
    val PASTEL_POWDER_BLOCKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:pastel_powder_blocks"))
    val FENCES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:fences"))
    val FENCE_GATES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:fence_gates"))
    val WALLS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:walls"))
    val SLABS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:slabs"))
    val WOOLS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:wools"))
    val LIGHTS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:lights"))
    val CARPETS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:carpets"))
    val GLASS_BLOCKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:glass_blocks"))
    val GLASS_PANES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:glass_panes"))

    // Desolated
    val ORES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:ores"))
    val LOGS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:logs"))
    val PLANKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:planks"))
    val LEAVES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:leaves"))
    val DIRT: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:dirt"))
    val GRASS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:grass"))
    val STONES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("innerpastels:stones"))
}