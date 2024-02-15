package gay.asoji.internalpastelslib.items

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

object RegisterItems {
    fun registerItem(modID: String, name: String, item: Item): Item {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation(modID, name), item)
    }

    fun registerRegularItem(modID: String, name: String): Item {
        return registerItem(modID, name, Item(Item.Properties()))
    }

    fun registerBlockItem(modID: String, name: String, block: Block, tab: Int, properties: Item.Properties): BlockItem {
        return Registry.register(
            BuiltInRegistries.ITEM, ResourceLocation(modID, name), BlockItem(block, properties)
        )
    }
}