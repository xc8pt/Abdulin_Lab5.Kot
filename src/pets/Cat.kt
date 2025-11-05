package pets

class Cat(name: String): Pet(name = name, speed = 80, maxHealth = 150) {
    override fun makeSound(){
        println("$name мяукает.")
    }
    override fun describe(){
        println("Имя: $name | Скорость: $speed | Здоровье: $maxHealth")
        println("Наш $name очень скрытный (90 скрытность) и тихий!")
    }
}