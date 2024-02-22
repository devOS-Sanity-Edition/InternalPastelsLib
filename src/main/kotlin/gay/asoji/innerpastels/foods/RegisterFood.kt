package gay.asoji.innerpastels.foods

import gay.asoji.innerpastels.items.CANDY_TRANSLATION_STRING
import gay.asoji.innerpastels.items.CandyTooltipItem
import gay.asoji.innerpastels.misc.secondsToTicks
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.effect.MobEffect
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items


object RegisterFood {
    /**
     * Registers a candy food item
     *
     * @property modID The namespace you're using, like `SofterPastels.MOD_ID`
     * @property name Candy's Item ID [like `white_taffy`]
     * @property candyTranslationString Type of candy for hunger translation string
     * @property nutrition Candy's nutrition value in [Int]
     * @property saturation Candy's saturation value in [Int]
     * @property effect [MobEffect] tied to eating the candy
     * @property amplifier Potency of said [MobEffect] after eating it
     * @property seconds Amount of time the effect lasts in seconds
     */
    fun registerCandy(
        modID: String,
        name: String,
        candyTranslationString: CANDY_TRANSLATION_STRING,
        nutrition: Int,
        saturation: Int,
        effect: MobEffect,
        amplifier: Int,
        seconds: Int
    ): CandyTooltipItem {
        return Items.registerItem(
            ResourceLocation(modID, name), CandyTooltipItem(
                Item.Properties().food(
                    FoodProperties.Builder()
                        .nutrition(nutrition)
                        .saturationMod(saturation.toFloat())
                        .fast()
                        .alwaysEat()
                        .effect(MobEffectInstance(effect, seconds.secondsToTicks(), amplifier), 1.0f).build()
                ),
                candyTranslationString
            )
        ) as CandyTooltipItem
    }

    /**
     * Registers a candy food item
     *
     * @property modID The namespace you're using, like `SofterPastels.MOD_ID`
     * @property name Candy's Item ID [like `white_taffy`]
     * @property candyTranslationString Type of candy for hunger translation string
     * @property nutrition Candy's nutrition value in [Int]
     * @property saturation Candy's saturation value in [Int]
     */
    fun registerCandy(modID: String, name: String, candyTranslationString: CANDY_TRANSLATION_STRING, nutrition: Int, saturation: Int): CandyTooltipItem {
        return Items.registerItem(
            ResourceLocation(modID, name), CandyTooltipItem(
                Item.Properties().food(
                    FoodProperties.Builder()
                        .nutrition(nutrition)
                        .saturationMod(saturation.toFloat())
                        .fast()
                        .alwaysEat()
                        .build()
                ),
                candyTranslationString
            )
        ) as CandyTooltipItem
    }

    fun registerTaffy(modID: String, name: String, effect: MobEffect, seconds: Int): CandyTooltipItem {
        return registerCandy(modID, name, CANDY_TRANSLATION_STRING.TAFFY, 2, 2, effect, 0, seconds)
    }

    fun registerTaffy(modID: String, name: String): CandyTooltipItem {
        return registerCandy(modID, name, CANDY_TRANSLATION_STRING.TAFFY, 2, 2)
    }

    fun registerCottonCandy(modID: String, name: String, effect: MobEffect, seconds: Int): CandyTooltipItem {
        return registerCandy(modID, name, CANDY_TRANSLATION_STRING.COTTON, 3, 2, effect, 1, seconds)
    }

    fun registerCottonCandy(modID: String, name: String): CandyTooltipItem {
        return registerCandy(modID, name, CANDY_TRANSLATION_STRING.COTTON, 3, 2)
    }

    fun registerHardCandy(modID: String, name: String, effect: MobEffect, seconds: Int): CandyTooltipItem {
        return registerCandy(modID, name, CANDY_TRANSLATION_STRING.HARD, 3, 2, effect, 2, seconds)
    }

    fun registerHardCandy(modID: String, name: String): CandyTooltipItem {
        return registerCandy(modID, name, CANDY_TRANSLATION_STRING.HARD, 3, 2)
    }

    fun registerIceCream(modID: String, name: String): Item {
        return Items.registerItem(ResourceLocation(modID, name), Item(Item.Properties().food(FoodProperties.Builder().nutrition(3).saturationMod(5f).build()))
        )
    }
}