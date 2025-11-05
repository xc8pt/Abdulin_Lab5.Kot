package world

class SpecialOperation(
    title: String,
    reward: Int,
    val requiredClearance: Int,
    val isConvert: Boolean
) : Mission(title, reward)  {

    fun showReward(){
        println("Требуемый допуск: $requiredClearance")
        println("Режим секретности: ${if (isConvert) "Совершенно секретно" else "Обычный"}")
    }

    override fun describe() {
        println("Спецоперация '$title'. Уровень допуска: $requiredClearance ," +
                " режим: ${if (isConvert) "Секретно" else "Открыто"}, награда: $reward")
    }
}