package gay.asoji.innerpastels.tags

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.level.block.Block

object BlockTags {
    // Referred to list: https://fabricmc.net/wiki/community:common_tags

    val CONCRETE: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("c:concrete"))
    val CONCRETE_POWDER: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("c:concrete_powder"))
    val FENCE_GATES: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("c:fence_gates"))
    val GLOWSTONE_BLOCKS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("c:glowstone_blocks"))
}