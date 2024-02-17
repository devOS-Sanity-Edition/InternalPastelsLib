package gay.asoji.innerpastels.tags

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

object InnerPastelsItemTags {
    // Softer
    val PASTEL_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:pastel_blocks"))
    val PASTEL_POWDER_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:pastel_powder_blocks"))
    val FENCES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:fences"))
    val FENCE_GATES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:fence_gates"))
    val WALLS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:walls"))
    val SLABS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:slabs"))
    val WOOLS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:wools"))
    val LIGHTS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:lights"))
    val CARPETS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:carpets"))
    val GLASS_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:glass_blocks"))
    val GLASS_PANES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:glass_panes"))

    // Desolated
    val ORES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:ores"))
    val LOGS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:logs"))
    val PLANKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:planks"))
    val LEAVES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:leaves"))
    val DIRT: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:dirt"))
    val GRASS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:grass"))
    val STONES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:stones"))
}