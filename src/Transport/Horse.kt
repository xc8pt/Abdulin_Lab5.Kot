package Transport

class Horse : Transport("Лошадь", 60, 1) {
    override fun describe() {
        println("Это скакун")
    }

    override fun move() {
        println("скачет по равнинам")
    }

    override fun specialAbility() {
        println("может ускориться в бою")
    }
}