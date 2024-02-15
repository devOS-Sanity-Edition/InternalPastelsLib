package gay.asoji.internalpastelslib.datagen

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.recipes.*
import net.minecraft.data.recipes.RecipeProvider.has
import net.minecraft.world.item.Items
import net.minecraft.world.level.ItemLike

object RecipeGenerators {
    // There's some naming inconsistencies in this file, I think, I'm a bit too tired to deal with it, I'll fix it
    // either before launching Softer Pastels v0.6.0, or after... we'll see

    // Generally, the order is register[TypeOfCrafting][PastelOrNone][NameOfItem][Item,Block,OrFoodName][VorNone]
    // is it lengthy? yes! is it verbose? yeah! does it tell you right away what it is? YES! and that helps imo

    // Documentation later
    fun registerSmeltingPastelGlass(
        exporter: RecipeOutput,
        smeltableList: List<ItemLike>,
        outputPastelGlassItem: ItemLike,
        group: String
    ) {
        return FabricRecipeProvider.oreSmelting(
            exporter,
            smeltableList,
            RecipeCategory.DECORATIONS,
            outputPastelGlassItem,
            0.7f,
            200,
            group
        )
    }

    fun registerSmeltingPastelHardCandy(
        exporter: RecipeOutput,
        smeltableList: List<ItemLike>,
        outputPastelHardCandyItem: ItemLike,
        group: String
    ) {
        return FabricRecipeProvider.oreSmelting(
            exporter,
            smeltableList,
            RecipeCategory.FOOD,
            outputPastelHardCandyItem,
            1f,
            200,
            group
        )
    }

    fun registerCraftingPastelPowderBlock(
        exporter: RecipeOutput,
        inputPastelPowderItem: ItemLike,
        outputPastelPowderBlock: ItemLike
    ) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, outputPastelPowderBlock, 8)
            .requires(Items.SAND)
            .requires(Items.SAND)
            .requires(Items.SAND)
            .requires(Items.SAND)
            .requires(Items.GRAVEL)
            .requires(Items.GRAVEL)
            .requires(Items.GRAVEL)
            .requires(Items.GRAVEL)
            .requires(inputPastelPowderItem)
            .unlockedBy(RecipeProvider.getHasName(Items.SAND), RecipeProvider.has(Items.SAND))
            .unlockedBy(RecipeProvider.getHasName(Items.GRAVEL), RecipeProvider.has(Items.GRAVEL))
            .unlockedBy(RecipeProvider.getHasName(inputPastelPowderItem), RecipeProvider.has(inputPastelPowderItem))
            .unlockedBy(RecipeProvider.getHasName(outputPastelPowderBlock), RecipeProvider.has(outputPastelPowderBlock))
            .save(exporter)
    }

    fun registerCraftingPastelSlabBlock(
        exporter: RecipeOutput,
        inputPastelBlock: ItemLike,
        outputPastelSlabBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, outputPastelSlabBlock, 6)
            .pattern("AAA")
            .define('A', inputPastelBlock)
            .unlockedBy(RecipeProvider.getHasName(inputPastelBlock), RecipeProvider.has(inputPastelBlock))
            .unlockedBy(RecipeProvider.getHasName(outputPastelSlabBlock), RecipeProvider.has(outputPastelSlabBlock))
            .save(exporter)
    }

    fun registerCraftingPastelStairBlock(
        exporter: RecipeOutput,
        inputPastelBlock: ItemLike,
        outputPastelStairBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, outputPastelStairBlock, 4)
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', inputPastelBlock)
            .unlockedBy(RecipeProvider.getHasName(inputPastelBlock), RecipeProvider.has(inputPastelBlock))
            .unlockedBy(RecipeProvider.getHasName(outputPastelStairBlock), RecipeProvider.has(outputPastelStairBlock))
            .save(exporter)
    }

    fun registerCraftingPastelWoolBlockV(
        exporter: RecipeOutput,
        inputPastelPowderItem: ItemLike,
        outputPastelWoolBlock: ItemLike
    ) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, outputPastelWoolBlock, 1)
            .requires(Items.WHITE_WOOL)
            .requires(inputPastelPowderItem)
            .unlockedBy(RecipeProvider.getHasName(Items.WHITE_WOOL), RecipeProvider.has(Items.WHITE_WOOL))
            .unlockedBy(RecipeProvider.getHasName(inputPastelPowderItem), RecipeProvider.has(inputPastelPowderItem))
            .unlockedBy(RecipeProvider.getHasName(outputPastelWoolBlock), RecipeProvider.has(outputPastelWoolBlock))
            .save(
                exporter,
                outputPastelWoolBlock.toString().lowercase().removePrefix("block{softerpastels:")
                    .replace("}", "") + "_v"
            )
    }

    fun registerCraftingPastelWoolBlock(
        exporter: RecipeOutput,
        inputPastelPowderItem: ItemLike,
        inputPastelWoolBlock: ItemLike,
        outputPastelWoolBlock: ItemLike
    ) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, outputPastelWoolBlock, 1)
            .requires(inputPastelWoolBlock)
            .requires(inputPastelPowderItem)
            .unlockedBy(RecipeProvider.getHasName(inputPastelWoolBlock), has(inputPastelWoolBlock))
            .unlockedBy(RecipeProvider.getHasName(inputPastelPowderItem), RecipeProvider.has(inputPastelPowderItem))
            .unlockedBy(RecipeProvider.getHasName(outputPastelWoolBlock), RecipeProvider.has(outputPastelWoolBlock))
            .save(exporter)
    }

    fun registerCraftingPastelCarpetBlock(
        exporter: RecipeOutput,
        inputPastelWoolBlock: ItemLike,
        outputPastelCarpetBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelCarpetBlock, 3)
            .pattern("AA")
            .define('A', inputPastelWoolBlock)
            .unlockedBy(RecipeProvider.getHasName(inputPastelWoolBlock), RecipeProvider.has(inputPastelWoolBlock))
            .unlockedBy(RecipeProvider.getHasName(outputPastelCarpetBlock), RecipeProvider.has(outputPastelCarpetBlock))
            .save(exporter)
    }

    fun registerCraftingPastelFenceBlock(
        exporter: RecipeOutput,
        inputPastelBlock: ItemLike,
        outputPastelFenceBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelFenceBlock, 3)
            .pattern("ABA")
            .pattern("ABA")
            .define('A', inputPastelBlock)
            .define('B', Items.STICK)
            .unlockedBy(RecipeProvider.getHasName(Items.STICK), RecipeProvider.has(Items.STICK))
            .unlockedBy(RecipeProvider.getHasName(inputPastelBlock), RecipeProvider.has(inputPastelBlock))
            .unlockedBy(RecipeProvider.getHasName(outputPastelFenceBlock), RecipeProvider.has(outputPastelFenceBlock))
            .save(exporter)
    }

    fun registerCraftingPastelFenceGateBlock(
        exporter: RecipeOutput,
        inputPastelBlock: ItemLike,
        outputPastelFenceGateBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelFenceGateBlock, 1)
            .pattern("BAB")
            .pattern("BAB")
            .define('A', inputPastelBlock)
            .define('B', Items.STICK)
            .unlockedBy(RecipeProvider.getHasName(Items.STICK), RecipeProvider.has(Items.STICK))
            .unlockedBy(RecipeProvider.getHasName(inputPastelBlock), RecipeProvider.has(inputPastelBlock))
            .unlockedBy(RecipeProvider.getHasName(outputPastelFenceGateBlock), RecipeProvider.has(outputPastelFenceGateBlock))
            .save(exporter)
    }

    fun registerCraftingPastelWallBlock(
        exporter: RecipeOutput,
        inputPastelBlock: ItemLike,
        outputPastelWallBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelWallBlock, 6)
            .pattern("AAA")
            .pattern("AAA")
            .define('A', inputPastelBlock)
            .unlockedBy(RecipeProvider.getHasName(inputPastelBlock), RecipeProvider.has(inputPastelBlock))
            .unlockedBy(RecipeProvider.getHasName(outputPastelWallBlock), RecipeProvider.has(outputPastelWallBlock))
            .save(exporter)
    }

    fun registerCraftingPastelGlassBlock(
        exporter: RecipeOutput,
        inputPastelPowderItem: ItemLike,
        outputPastelGlassBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelGlassBlock, 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.GLASS)
            .define('B', inputPastelPowderItem)
            .unlockedBy(RecipeProvider.getHasName(Items.GLASS), RecipeProvider.has(Items.GLASS))
            .unlockedBy(RecipeProvider.getHasName(inputPastelPowderItem), RecipeProvider.has(inputPastelPowderItem))
            .unlockedBy(RecipeProvider.getHasName(outputPastelGlassBlock), RecipeProvider.has(outputPastelGlassBlock))
            .save(exporter)
    }

    fun registerCraftingPastelGlassPaneBlock(
        exporter: RecipeOutput,
        inputPastelPowderItem: ItemLike,
        outputPastelGlassPaneBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelGlassPaneBlock, 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.GLASS_PANE)
            .define('B', inputPastelPowderItem)
            .unlockedBy(RecipeProvider.getHasName(Items.GLASS_PANE), RecipeProvider.has(Items.GLASS_PANE))
            .unlockedBy(RecipeProvider.getHasName(inputPastelPowderItem), RecipeProvider.has(inputPastelPowderItem))
            .unlockedBy(RecipeProvider.getHasName(outputPastelGlassPaneBlock), RecipeProvider.has(outputPastelGlassPaneBlock))
            .save(exporter)
    }

    fun registerCraftingPastelGlassPaneRectangleBlock(
        exporter: RecipeOutput,
        inputPastelGlassBlockItem: ItemLike,
        outputPastelGlassPaneBlock: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelGlassPaneBlock, 16)
            .pattern("AAA")
            .pattern("AAA")
            .define('A', inputPastelGlassBlockItem)
            .unlockedBy(RecipeProvider.getHasName(inputPastelGlassBlockItem), RecipeProvider.has(inputPastelGlassBlockItem))
            .unlockedBy(RecipeProvider.getHasName(outputPastelGlassPaneBlock), RecipeProvider.has(outputPastelGlassPaneBlock))
            .save(
                exporter,
                outputPastelGlassPaneBlock.toString().lowercase().removePrefix("block{softerpastels:")
                    .replace("}", "") + "_rect"
            )
    }

    fun registerCraftingPastelLightBlock(
        exporter: RecipeOutput,
        inputPastelPowderItem: ItemLike,
        outputPastelLightBlock: ItemLike
    ) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, outputPastelLightBlock, 1)
            .requires(Items.GLOWSTONE)
            .requires(inputPastelPowderItem)
            .unlockedBy(RecipeProvider.getHasName(Items.GLOWSTONE), RecipeProvider.has(Items.GLOWSTONE))
            .unlockedBy(RecipeProvider.getHasName(inputPastelPowderItem), RecipeProvider.has(inputPastelPowderItem))
            .unlockedBy(RecipeProvider.getHasName(outputPastelLightBlock), RecipeProvider.has(outputPastelLightBlock))
            .save(exporter)
    }

    fun registerPastelTaffyItem(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputTaffyItem: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, outputTaffyItem, 4)
            .requires(Items.PAPER)
            .requires(Items.HONEYCOMB)
            .requires(Items.SUGAR)
            .requires(inputPastelPowderItem)
            .unlockedBy(RecipeProvider.getHasName(Items.PAPER), RecipeProvider.has(Items.PAPER))
            .unlockedBy(RecipeProvider.getHasName(Items.HONEYCOMB), RecipeProvider.has(Items.HONEYCOMB))
            .unlockedBy(RecipeProvider.getHasName(Items.SUGAR), RecipeProvider.has(Items.SUGAR))
            .unlockedBy(RecipeProvider.getHasName(inputPastelPowderItem), RecipeProvider.has(inputPastelPowderItem))
            .unlockedBy(RecipeProvider.getHasName(outputTaffyItem), RecipeProvider.has(outputTaffyItem))
            .save(exporter)
    }

    fun registerCraftingPastelCottonCandyItem(
        exporter: RecipeOutput,
        inputTaffyItem: ItemLike,
        outputCottonCandyItem: ItemLike
    ) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, outputCottonCandyItem, 2)
            .pattern(" A ")
            .pattern("ABA")
            .pattern(" C ")
            .define('A', Items.STRING)
            .define('B', inputTaffyItem)
            .define('C', Items.STICK)
            .unlockedBy(RecipeProvider.getHasName(Items.STRING), RecipeProvider.has(Items.STRING))
            .unlockedBy(RecipeProvider.getHasName(Items.STICK), RecipeProvider.has(Items.STICK))
            .unlockedBy(RecipeProvider.getHasName(inputTaffyItem), RecipeProvider.has(inputTaffyItem))
            .unlockedBy(RecipeProvider.getHasName(outputCottonCandyItem), RecipeProvider.has(outputCottonCandyItem))
            .save(exporter)
    }
}