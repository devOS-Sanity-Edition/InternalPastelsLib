package gay.asoji.innerpastels.items

import net.minecraft.network.chat.Component
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.TooltipFlag
import net.minecraft.world.item.alchemy.PotionUtils
import net.minecraft.world.level.Level
import java.util.*

/**
 * Translation string to show which candy shows how much hunger.
 * [actual strings in library's /src/main/resources/assets/innerpastels/lang/en_us.json]
 */
enum class CANDY_TRANSLATION_STRING(val candyHungerString: String) {
    TAFFY("item.innerpastels.candies.hunger.description.taffy"),
    COTTON("item.innerpastels.candies.hunger.description.cotton"),
    HARD("item.innerpastels.candies.hunger.description.hard")
}

class CandyTooltipItem(properties: Properties, val candyTranslationString: CANDY_TRANSLATION_STRING) : Item(properties) {
    override fun appendHoverText(itemStack: ItemStack, level: Level?, list: MutableList<Component>, tooltipFlag: TooltipFlag) {
        list.add(Component.translatable(candyTranslationString.candyHungerString))

        val effects = LinkedList<MobEffectInstance>()

        if (itemStack.foodComponent != null) {
            for (effect in itemStack.foodComponent!!.effects) {
                effects.add(effect.first)
            }
        }

        PotionUtils.addPotionTooltip(effects, list, 1.0f, level?.tickRateManager()?.tickrate() ?: 20.0f)
        list.add(Component.translatable("item.innerpastels.candies.hunger.alwayseat"))
    }
}
