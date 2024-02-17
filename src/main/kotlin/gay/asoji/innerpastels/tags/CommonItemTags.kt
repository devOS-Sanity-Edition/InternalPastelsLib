package gay.asoji.innerpastels.tags

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

object CommonItemTags {
    // Referred to list: https://fabricmc.net/wiki/community:common_tags

    // Here lies the tag spam of shame, tsk tsk tsk.
    // Here also previously lies an angry rant but i'd suggest you look at the links below for yourself. lol.
    // https://fabricmc.net/wiki/community:common_tags?s%5B%5D=glass
    // https://fabricmc.net/wiki/community:common_tags?s%5B%5D=concrete
    val CONCRETE: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:concrete"))
    val CONCRETES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:concretes"))
    val CONCRETE_POWDER: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:concrete_powder"))
    val CONCRETE_POWDERS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:concretes_powders"))
    val GLASS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:glass"))
    val GLASS_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:glass_blocks"))
    val GLASS_PANE: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:glass_pane"))
    val GLASS_PANES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:glass_panes"))
    val STAINED_GLASS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:stained_glass"))

    val FENCE_GATES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:fence_gates"))
    val GLOWSTONE_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:glowstone_blocks"))
    val GLOWSTONE_DUSTS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:glowstone_dusts"))
    val WOOLS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("c:wools"))

}