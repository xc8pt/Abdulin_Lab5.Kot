package Transport

class Dragon : Transport("Дракон", 100, 2) {
    override fun move() {
        println("летит высоко над землёй")
    }

    override fun specialAbility() {
        println("дышит огнём и перевозит героя по воздуху")
    }
}