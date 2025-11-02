package magic

fun main(){
    val fireWall = Spell("Огненная Стена", 5, 3, "\uD83D\uDD25")
    fireWall.cats()

    val iceSheet = Spell("Ледянной щит", 4, "\u2744\uFE0F")
    iceSheet.cats()
//    val spell = magic.Spell()
//    spell.cats()

    println(fireWall.area())
    println(iceSheet.area())
//    println(spell.area())
}