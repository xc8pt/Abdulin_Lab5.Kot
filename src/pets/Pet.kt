package pets

open class Pet(
    val maxHealth: Int,
    val name: String,
    val speed: Int,
) {
    open fun describe(){
        println("Имя: $name | Скорость: $speed | Здоровье: $maxHealth")
    }
    open fun makeSound(){
        println("$name подает голос!")
    }
}