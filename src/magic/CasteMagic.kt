package magic

fun main(){
//    val fireWall = Spell("Огненная Стена",
//        5,
//        3,
//        "\uD83D\uDD25")
////    fireWall.cats()
//
//    val iceSheet = Spell("Ледянной щит",
//        4,
//        "\u2744\uFE0F")
//    iceSheet.cats()
//    val spell = magic.Spell()
//    spell.cats()

//    println(fireWall.area())
//    println(iceSheet.area())
//    println(spell.area())

    val fireball = Spell("Огненная Шар",
        3,
        3,
        "\uD83D\uDD25")

    val heal = InstantSpell("Лечение",
        "\uD83D\uDC9A",
        5)

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration}")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration}")
}