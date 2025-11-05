package pets

class Wolf(name: String): Pet(name = name, speed = 100, maxHealth = 250) {
    override fun makeSound() {
        println("$name воет.")
    }
    override fun describe(){
        println("Имя: $name | Скорость: $speed | Здоровье: $maxHealth")
        println("У $name размер стаи - 5")
    }
}