package Transport

open class Transport(
    val name: String,
    val speed: Int,
    val capacity: Int
) {
    open fun describe() {
        println("$name: скорость $speed, вместимость $capacity")
    }

    open fun move() {
        println("Передвигается...")
    }

    open fun specialAbility() {
        println("Особая способность отсутствует.")
    }
}