package pets

class Eagle(name: String): Pet(name = name, speed = 250, maxHealth = 50) {
    override fun makeSound() {
        println("$name кричит.")
    }
    override fun describe(){
        println("Имя: $name | Скорость: $speed | Здоровье: $maxHealth")
        println("$name своим острым взглядом видит всё далеко")
    }
}
