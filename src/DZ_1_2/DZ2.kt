package DZ_1_2

/*
ZAD1
 */
//class Item(
//    val name: String,
//    val type: String,
//    val value: Int
//) {
//
//    constructor(name: String, type: String): this(name, type, 0)
//
//    fun printInfo() {
//        println("Название: $name")
//        println("Тип: $type")
//        println("Стоимость: $value")
//    }
//}
//fun main() {
//    val sword = Item("Меч", "оружие", 150)
//    val potion = Item("Зелье", "зелье")
//
//    sword.printInfo()
//    println()
//    potion.printInfo()
//}
/*
ZAD2
 */
//class Location(
//    val name: String,
//    val dangerLevel: String = "Низкий",
//    val requiredLevel: Int = 1
//) {
//    fun isDangerous(): Boolean {
//        return dangerLevel == "Высокий"
//    }
//}
//fun main() {
//    val loc1 = Location("Лес", "Средний", 3)
//    val loc2 = Location("Вулкан", "Высокий", 10)
//
//    println("${loc1.name}: опасно? ${loc1.isDangerous()}") // false
//    println("${loc2.name}: опасно? ${loc2.isDangerous()}") // true
//}
/*
ZAD3
 */
//fun main() {
//    val hero = Hero(3)
//    val spell1 = Spell("Fire", 3, 3)
//    val spell2 = Spell("MegaBlast", 6, 4)
//
//    println(hero.canCast(spell1)) // true
//    println(hero.canCast(spell2)) // false
//}
/*
ZAD4
 */
//fun main() {
//    val orc = Enemy("Орк", 60)
//    val boss = Enemy("Демон", 100)
//    val e = Enemy("Орк", 60)
//    println(e.calculatePower())
//
//    println(orc.calculatePower())
//    println(boss.calculatePower())
//}