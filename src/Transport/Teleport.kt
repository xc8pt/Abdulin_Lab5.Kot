package Transport

class Teleport : Transport("Телепорт", 9999, 1) {
    override fun move() {
        println("мгновенно перемещается в другое место")
    }

    override fun specialAbility() {
        println("нужна мана для активации, мгновенное перемещение")
    }
}