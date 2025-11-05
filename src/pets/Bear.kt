package pets

class Bear(name: String): Pet(name = name, speed = 50, maxHealth = 550) {
    override fun makeSound() {
        println("$name ревёт.")
    }
    override fun describe(){
        println("Имя: $name | Скорость: $speed | Здоровье: $maxHealth")
        println("У $name силушка богатырская - 350")
    }
}