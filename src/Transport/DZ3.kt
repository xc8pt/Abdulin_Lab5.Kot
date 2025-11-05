package Transport

fun main() {
    val transports: List<Transport> = listOf(
        Horse(),
        Dragon(),
        Boat(),
        Teleport()
    )

    for (trans in transports) {
        trans.describe()
        trans.move()
        trans.specialAbility()
        println()
    }
}