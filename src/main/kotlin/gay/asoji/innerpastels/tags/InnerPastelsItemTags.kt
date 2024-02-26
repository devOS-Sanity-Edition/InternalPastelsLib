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
    /**
     * Items assigned with this tag are deemed as pastel block items to whatever looks for `#innerpastels:pastel_blocks`
     * @return [InnerPastelsItemTags.PASTEL_BLOCKS]
     */
    val PASTEL_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:pastel_blocks"))

    /**
     * Items assigned with this tag are deemed as pastel powder block items to whatever looks for `#innerpastels:pastel_powder_blocks`
     * @return [InnerPastelsItemTags.PASTEL_POWDER_BLOCKS]
     */
    val PASTEL_POWDER_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:pastel_powder_blocks"))

    /**
     * Items assigned with this tag are deemed as pastel fence block items to whatever looks for `#innerpastels:fences`
     * @return [InnerPastelsItemTags.FENCES]
     */
    val FENCES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:fences"))

    /**
     * Items assigned with this tag are deemed as pastel fence gates block items to whatever looks for `#innerpastels:fence_gates`
     * @return [InnerPastelsItemTags.FENCE_GATES]
     */
    val FENCE_GATES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:fence_gates"))

    /**
     * Items assigned with this tag are deemed as pastel wall block items to whatever looks for `#innerpastels:walls`
     * @return [InnerPastelsItemTags.WALLS]
     */
    val WALLS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:walls"))

    /**
     * Items assigned with this tag are deemed as pastel slabs block items to whatever looks for `#innerpastels:slabs`
     * @return [InnerPastelsItemTags.SLABS]
     */
    val SLABS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:slabs"))

    /**
     * Items assigned with this tag are deemed as pastel stair block items to whatever looks for `#innerpastels:stairs`
     * @return [InnerPastelsItemTags.STAIRS]
     */
    val STAIRS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:stairs"))

    /**
     * Items assigned with this tag are deemed as pastel wool block items to whatever looks for `#innerpastels:wools`
     * @return [InnerPastelsItemTags.WOOLS]
     */
    val WOOLS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:wools"))

    /**
     * Items assigned with this tag are deemed as pastel lights block items to whatever looks for `#innerpastels:lights`
     * @return [InnerPastelsItemTags.LIGHTS]
     */
    val LIGHTS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:lights"))

    /**
     * Items assigned with this tag are deemed as pastel carpets block items to whatever looks for `#innerpastels:carpets`
     * @return [InnerPastelsItemTags.CARPETS]
     */
    val CARPETS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:carpets"))

    /**
     * Items assigned with this tag are deemed as pastel glass block items to whatever looks for `#innerpastels:glass_blocks`
     * @return [InnerPastelsItemTags.GLASS_BLOCKS]
     */
    val GLASS_BLOCKS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:glass_blocks"))

    /**
     * Items assigned with this tag are deemed as pastel glass pane block items to whatever looks for `#innerpastels:glass_panes`
     * @return [InnerPastelsItemTags.GLASS_PANES]
     */
    val GLASS_PANES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:glass_panes"))


    /**
     * Items assigned with this tag are deemed as pastel powder items to whatever looks for `#innerpastels:powders`
     * @return [InnerPastelsItemTags.GLASS_PANES]
     */
    val POWDERS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:powders"))

    /**
     * Items assigned with this tag are deemed as taffy items to whatever looks for `#innerpastels:taffies`
     * @return [InnerPastelsItemTags.GLASS_PANES]
     */
    val TAFFIES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:taffies"))

    /**
     * Items assigned with this tag are deemed as cotton candy items to whatever looks for `#innerpastels:cotton_candies`
     * @return [InnerPastelsItemTags.GLASS_PANES]
     */
    val COTTON_CANDIES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:cotton_candies"))

    /**
     * Items assigned with this tag are deemed as hard candy items to whatever looks for `#innerpastels:hard_candies`
     * @return [InnerPastelsItemTags.GLASS_PANES]
     */
    val HARD_CANDIES: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation("innerpastels:hard_candies"))

    /**
     * Items assigned with this tag are deemed as ice cream items to whatever looks for `#innerpastels:ice_cream`
     * @return [InnerPastelsItemTags.GLASS_PANES]
     */
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