package gay.asoji.innerpastels.blocks

import gay.asoji.innerpastels.blocks.Properties.PastelBlock
import gay.asoji.innerpastels.blocks.Properties.PastelCarpet
import gay.asoji.innerpastels.blocks.Properties.PastelFence
import gay.asoji.innerpastels.blocks.Properties.PastelFenceGate
import gay.asoji.innerpastels.blocks.Properties.PastelGlass
import gay.asoji.innerpastels.blocks.Properties.PastelGlassPane
import gay.asoji.innerpastels.blocks.Properties.PastelLight
import gay.asoji.innerpastels.blocks.Properties.PastelPowder
import gay.asoji.innerpastels.blocks.Properties.PastelSlab
import gay.asoji.innerpastels.blocks.Properties.PastelStair
import gay.asoji.innerpastels.blocks.Properties.PastelWall
import gay.asoji.innerpastels.blocks.Properties.PastelWool
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.material.MapColor



// a lot of this was written by storm so if there's shit that could be reused/abstracted, yell at her, not me - asoji

/**
 * Registers a block to the Minecraft registry with the resource location set to the mod id
 * @property name the ID of the block
 * @return [Block]
 */
fun Block.registerBlock(modID: String, name: String): Block =
    Registry.register(BuiltInRegistries.BLOCK, ResourceLocation(modID, name), this)

/**
 * Registers an item to the Minecraft registry with the resource location set to the mod id
 * @property name the ID of the item
 * @return [BlockItem]
 */
fun Block.registerBlockItem(modID: String, name: String): BlockItem = Registry.register(
    BuiltInRegistries.ITEM,
    ResourceLocation(modID, name),
    BlockItem(this, Item.Properties())
)

/**
 * Registers a block & item to the Minecraft registry with the resource location set to the mod id
 * @property name the ID of the block
 * @return [Block]
 */
fun Block.registerBlockWithItem(modID: String, name: String): Block {
    this.registerBlockItem(modID, name)
    return this.registerBlock(modID, name)
}

/**
 * Registers a stained-glass block copying the settings of white stained-glass with the color based on a [DyeColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun DyeColor.registerGlassBlock(modID: String, name: String): Block =
    StainedGlassBlock(this, PastelGlass().mapColor(this)).registerBlock(modID, name)

/**
 * Registers a stained-glass pane block copying the settings of white stained-glass with the color based on a [DyeColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun DyeColor.registerGlassPaneBlock(modID: String, name: String): Block =
    StainedGlassPaneBlock(this, PastelGlassPane().mapColor(this)).registerBlock(modID, name)

/**
 * Registers a pastel block with an accompanying item with the color based on a [DyeColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun DyeColor.registerPastelBlock(modID: String, name: String): Block = Block(PastelBlock().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers a pastel block with an accompanying item with the color based on a [MapColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun MapColor.registerPastelBlock(modID: String, name: String): Block = Block(PastelBlock().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers a pastel powder block with an accompanying item with the color based on a [DyeColor], paired with an accompanying normal pastel block when touched with water
 * @property name the ID of the block
 * @property resultPastelBlock the accompanying normal pastel block
 * @return [ConcretePowderBlock]
 */
fun DyeColor.registerPastelPowderBlock(modID: String, name: String, resultPastelBlock: Block): Block =
    ConcretePowderBlock(resultPastelBlock, PastelPowder().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers a pastel powder block with an accompanying item with the color based on a [MapColor], paired with an accompanying normal pastel block when touched with water
 * @property name the ID of the block
 * @property resultPastelBlock the accompanying normal pastel block
 * @return [ConcretePowderBlock]
 */
fun MapColor.registerPastelPowderBlock(modID: String, name: String, resultPastelBlock: Block): Block =
    ConcretePowderBlock(resultPastelBlock, PastelPowder().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers a pastel fence block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceBlock]
 */
fun DyeColor.registerPastelFenceBlock(modID: String, name: String): Block =
    FenceBlock(PastelFence().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers a pastel fence block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceBlock]
 */
fun MapColor.registerPastelFenceBlock(modID: String, name: String): Block =
    FenceBlock(PastelFence().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel fence gate block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceGateBlock]
 */
fun DyeColor.registerPastelFenceGateBlock(modID: String, name: String): Block =
    FenceGateBlock(PastelFenceGate().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel fence gate block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceGateBlock]
 */
fun MapColor.registerPastelFenceGateBlock(modID: String, name: String): Block =
    FenceGateBlock(PastelFenceGate().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel wall block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the ID of the block
 * @return [WallBlock]
 */
fun DyeColor.registerPastelWallBlock(modID: String, name: String): Block =
    WallBlock(PastelWall().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel wall block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the ID of the block
 * @return [WallBlock]
 */
fun MapColor.registerPastelWallBlock(modID: String, name: String): Block =
    WallBlock(PastelWall().mapColor(this)).registerBlockWithItem(modID, name)

// i'm going to cry
// fucking same bestie
// feb 9th 2024, lets say asoji learned about the CTRL D bind from Storm and feels fucking stupid

/**
 * Registers the pastel slab block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [SlabBlock]
 */
fun DyeColor.registerPastelSlabBlock(modID: String, name: String): Block =
    SlabBlock(PastelSlab().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel slab block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [SlabBlock]
 */
fun MapColor.registerPastelSlabBlock(modID: String, name: String): Block =
    SlabBlock(PastelSlab().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel stair block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [StairBlocks]
 */
fun DyeColor.registerPastelStairsBlock(modID: String, name: String): Block = StairBlocks(
    Blocks.STONE_STAIRS.defaultBlockState(),
    PastelStair().mapColor(this)
).registerBlockWithItem(modID, name)

/**
 * Registers the pastel stair block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [StairBlocks]
 */
fun MapColor.registerPastelStairsBlock(modID: String, name: String): Block = StairBlocks(
    Blocks.STONE_STAIRS.defaultBlockState(),
    PastelStair().mapColor(this)
).registerBlockWithItem(modID, name)

/**
 * Registers the pastel wool block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun DyeColor.registerWoolBlock(modID: String, name: String): Block = Block(PastelWool().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel wool block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun MapColor.registerWoolBlock(modID: String, name: String): Block = Block(PastelWool().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel light block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun DyeColor.registerLightBlock(modID: String, name: String): Block = Block(PastelLight().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel light block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun MapColor.registerLightBlock(modID: String, name: String): Block = Block(PastelLight().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel carpet block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun DyeColor.registerCarpetBlock(modID: String, name: String): Block =
    CarpetBlock(PastelCarpet().mapColor(this)).registerBlockWithItem(modID, name)

/**
 * Registers the pastel carpet block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun MapColor.registerCarpetBlock(modID: String, name: String): Block =
    CarpetBlock(PastelCarpet().mapColor(this)).registerBlockWithItem(modID, name)
