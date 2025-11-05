package artifact

open class MagicItem(
    val name: String,
    val power: Int,
    val rarity: String // Common/Rare/Epic
) {
    open fun describe() {
        println("Название: $name, Сила: $power, Редкость: $rarity")
    }

    open fun use(): String {
        return "Использован артефакт $name"
    }
}