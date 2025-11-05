package artifact

class Relic(
    name: String,
    power: Int,
    rarity: String,
    val origin: String,
    var charges: Int
) : MagicItem(name, power, rarity) {

    override fun describe() {
        println("Название: $name, Сила: $power, Редкость: $rarity")
        println("Происхождение: $origin, Заряды: $charges")
    }

    override fun use(): String {
        if (charges > 0) {
            charges -= 1
            return "Реликвия использована, осталось зарядов: $charges"
        } else {
            return "Нет зарядов для использования реликвии!"
        }
    }
}