package world

class Quest(
    title: String,
    var duration: Int,
    reward: Int,
    var difficulty: String,
    val questType: QuestType
) : Mission(title, reward) {

    fun printInfo(){
        println("Название квеста: ${this.title} Время выполнения: ${this.duration} Награда:" +
                "${this.reward} золотых Уровень сложности: ${this.difficulty}")
        println("Тип квеста: ${questType.description}")
    }
    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
        println("Тип квеста: ${questType.description}")
    }

    fun goldPerHour(): Int {
        require(value = duration >= 0) {
            "Длительность не может быть отрицательной!" }
        return if (duration == 0) 0 else reward / duration
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

}
