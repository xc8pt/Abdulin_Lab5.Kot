package Transport

class Boat : Transport("Лодка", 30, 5) {
    override fun move() {
        println("плывёт по воде")
    }

    override fun specialAbility() {
        println("может перевозить группу по рекам и озёрам")
    }
}