package gay.asoji.innerpastels.tags

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

/**
 * A bunch of items tags meant to be used for tagging items to their respective tags.
 *
 * Now try saying tags 100 times over.
 */
object InnerPastelsItemTags {
    // Softer
    val PASTEL_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:pastel_blocks"))
    val PASTEL_POWDER_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:pastel_powder_blocks"))
    val FENCES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:fences"))
    val FENCE_GATES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:fence_gates"))
    val WALLS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:walls"))
    val SLABS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:slabs"))
    val STAIRS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:stairs"))
    val WOOLS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:wools"))
    val LIGHTS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:lights"))
    val CARPETS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:carpets"))
    val GLASS_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:glass_blocks"))
    val GLASS_PANES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:glass_panes"))

    val POWDERS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:powders"))
    val TAFFIES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:taffies"))
    val COTTON_CANDIES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:cotton_candies"))
    val HARD_CANDIES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:hard_candies"))
    val ICE_CREAM: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:ice_cream"))

    // Desolated
    val ORES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:ores"))
    val LOGS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:logs"))
    val PLANKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:planks"))
    val LEAVES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:leaves"))
    val DIRT: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:dirt"))
    val GRASS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:grass"))
    val STONES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:stones"))
}