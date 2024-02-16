package gay.asoji.internalpastelslib.foods

import gay.asoji.internalpastelslib.items.CandyTooltipItem
import gay.asoji.internalpastelslib.misc.secondsToTicks
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.effect.MobEffect
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items

object RegisterFood {
    fun registerCandy(
        modID: String,
        name: String,
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
                )
            )
        ) as CandyTooltipItem
    }

    fun registerCandy(modID: String, name: String, nutrition: Int, saturation: Int, amplifier: Int): CandyTooltipItem {
        return Items.registerItem(
            ResourceLocation(modID, name), CandyTooltipItem(
                Item.Properties().food(
                    FoodProperties.Builder()
                        .nutrition(nutrition)
                        .saturationMod(saturation.toFloat())
                        .fast()
                        .alwaysEat()
                        .build()
                )
            )
        ) as CandyTooltipItem
    }

    fun registerTaffy(modID: String, name: String, effect: MobEffect, seconds: Int): CandyTooltipItem {
        return registerCandy(modID, name, 2, 2, effect, 0, seconds)
    }

    fun registerTaffy(modID: String, name: String): CandyTooltipItem {
        return registerCandy(modID, name, 2, 2, 0)
    }

    fun registerCottonCandy(modID: String, name: String, effect: MobEffect, seconds: Int): CandyTooltipItem {
        return registerCandy(modID, name, 3, 2, effect, 1, seconds)
    }

    fun registerCottonCandy(modID: String, name: String): CandyTooltipItem {
        return registerCandy(modID, name, 3, 2, 1)
    }

    fun registerHardCandy(modID: String, name: String, effect: MobEffect, seconds: Int): CandyTooltipItem {
        return registerCandy(modID, name, 3, 2, effect, 2, seconds)
    }

    fun registerHardCandy(modID: String, name: String): CandyTooltipItem {
        return registerCandy(modID, name, 3, 2, 2)
    }

    fun registerIceCream(modID: String, name: String): Item {
        return Items.registerItem(ResourceLocation(modID, name), Item(Item.Properties().food(FoodProperties.Builder().nutrition(3).saturationMod(5f).build()))
        )
    }
}