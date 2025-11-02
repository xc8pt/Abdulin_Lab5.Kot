package characters

class Enemy(string: String, i: Int) {
    var name: String = "Враг"
    var hp: Int = 50
    var element: String = "Огонь"
    var aggressionLevel: Int = 2


    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось HP врага: $hp")
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name ${enemy.name}")
        enemy.takeDamage(amount = damage)
    }
    fun isStrong(): Boolean {
        return hp > 100
    }
    /*
    ZAD4 LAB6
     */
    fun calculatePower(): Int {
        return hp * aggressionLevel
    }
}