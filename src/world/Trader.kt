package world

class Trader(val name: String,
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun showAvailableQuests() {
        println("Доступные квесты от $name:")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - " +
                    "Награда: ${quest.reward} золота") }
    }
    fun giveQuest(index: Int): Quest {
        return quests[index - 1]
    }
    fun addQuest(quest: Quest){
        quests.add(quest)
        println("Квест '${quest.title}'добвален в список $name.")
    }
    fun removeQuest(index: Int) {
        if (index in 1..quests.size) {
            println("Квест '${quests[index - 1].title}' выдан и удалён.")
            quests.removeAt(index - 1)
        } else {
            println("Некорректный индекс!")
        }
    }
    fun start() {
        while (true) {
            println("1 - Добавить квест")
            println("2 - Показать все квесты")
            println("3 - Взять квест (удалить из списка)")
            println("0 - Выйти")
            print("Выберите действие: ")
            when (readln()) {
                "1" -> {
                    print("Введите название квеста: ")
                    val title = readln()
                    print("Введите длительность (часы): ")
                    val duration = readln().toIntOrNull() ?: 0
                    print("Введите награду (золото): ")
                    val reward = readln().toIntOrNull() ?: 0
                    print("Введите сложность: ")
                    val difficulty = readln()
                    print("Введите тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
                    val typeInput = readln()
                    val questType = try {
                        QuestType.valueOf(typeInput.uppercase())
                    } catch (_: Exception) {
                        QuestType.EXPLORE
                    }
                    addQuest(Quest(title, duration, reward, difficulty, questType))
                }
                "2" -> showAvailableQuests()
                "3" -> {
                    showAvailableQuests()
                    print("Введите номер квеста для выдачи: ")
                    val index = readln().toIntOrNull()
                    if (index != null) removeQuest(index)
                    else println("Ошибка: введите номер!")
                }
                "0" -> return
                else -> println("Неизвестная команда!")
            }
        }
    }

}