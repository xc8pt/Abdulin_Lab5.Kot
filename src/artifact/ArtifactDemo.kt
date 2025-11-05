package artifact

fun main() {
    val magicItems: List<MagicItem> = listOf(
        Weapon("Огненный Меч", 80, "Epic", "Огонь", true),
        Potion("Зелье Лечения", 25, "Rare", 30, true),
        Relic("Амулет Эльфов", 50, "Epic", "эльфийское", 3)
    )

    for (item in magicItems) {
        item.describe()
        println(item.use())
        println()
    }
}