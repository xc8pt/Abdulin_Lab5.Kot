package world

class Quest(
    var title: String,
    var duration: Int,
    var reward: Int,
    var difficulty: String
) {

    fun printInfo(){
        println("Название квеста: ${this.title} Время выполнения: ${this.duration} Награда:" +
                "${this.reward} золотых Уровень сложности: ${this.difficulty}")
    }
    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }
}