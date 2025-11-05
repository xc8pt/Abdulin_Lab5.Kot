package artifact

class Weapon(
    name: String,
    power: Int,
    rarity: String,
    val damageType: String,
    val isTwoHanded: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        println("Название: $name, Сила: $power, Редкость: $rarity")
        println("Тип урона: $damageType, Двуручное: $isTwoHanded")
    }

    override fun use(): String {
        return "Наносит $damageType урон силой [$power]"
    }
}