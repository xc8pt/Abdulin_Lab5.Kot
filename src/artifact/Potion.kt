package artifact

class Potion(
    name: String,
    power: Int,
    rarity: String,
    val effectDuration: Int,
    val isConsumable: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        println("Название: $name, Сила: $power, Редкость: $rarity")
        println("Длительность эффекта: $effectDuration сек, Одноразовое: $isConsumable")
    }

    override fun use(): String {
        return if (isConsumable)
            "Выпито зелье. Эффект длится $effectDuration секунд."
        else
            "Многоразовое зелье: эффект $effectDuration секунд активирован."
    }
}