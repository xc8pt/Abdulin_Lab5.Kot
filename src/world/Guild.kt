package world

fun main(){
//    val quest = world.Quest("Охота на гоблинов", 2, 3400, "легкий")
//    quest.printInfo()
//
//    print("Введите название квеста: ")
//    val title = readln()
//    print("Введите время выполнения (в часах): ")
//    val duration = readln().toInt()
//    print("Введите награду (в монетах): ")
//    val reward = readln().toInt()
//    print("Введите уровень сложности: ")
//    val difficulty = readln()
//
//    quest.title = title
//    quest.duration = duration
//    quest.reward = reward
//    quest.difficulty = difficulty
//
//    quest.printInfo()
////    quest.init(title, duration, reward, difficulty)
////    quest.init("Охота на тролля", 3,500,"Средний")
//
//    val quests = mutableListOf<world.Quest>()
//
//
//    for (i in 1..3){
//        println("Добавим квест #$i")
//        val q = world.Quest("Охота на гоблинов", 2, 3400, "легкий")
//        print("Введите название квеста: ")
//        val title = readln()
//        print("Введите время выполнения (в часах): ")
//        val duration = readln().toInt()
//        print("Введите награду (в монетах): ")
//        val reward = readln().toInt()
//        print("Введите уровень сложности: ")
//        val difficulty = readln()
//
////        q.init(title, duration, reward, difficulty)
//        quests.add(q)
//        println()
//    }
//    println("Все доступные квесты: ")
//    for (q in quests){
//        q.printInfo()
//    }
//    val quest = world.Quest("Побег из замка", 5, 700, "Сложный")
//    println("Квест сложный? ${quest.isHard()}")

//    val quest = Quest("Поиск артефактов",
//        3,
//        800,
//        "Средний")
//    val contract = Contract("Защита каравана",
//        "Гильдия купцов",
//        "Охрана груза",
//        1200)
//    val specialOp = SpecialOperation("Операция 'Тень'",
//        2500,
//        2,
//        true)
//    println("Информация о квесте: ")
//    println("Название: ${quest.title}, Награда: ${quest.reward}")
//
//    println("\nИнформация о контракте: ")
//    println("Название: ${contract.title}, Заказчик: ${contract.clientName}")
//
//    println("\nИнформация о спецуперации: ")
//    println("Название: ${specialOp.title}")
//    specialOp.showReward()

//    val missions = listOf<Mission>(
//        Quest("Охота на монстров",
//            3,
//            600,
//            "Средний"),
//        SpecialOperation("Ночной рейд",
//            1500,
//            requiredClearance = 2,
//            isConvert = true),
//        Contract("Сопровождение каравана",
//            "Гильдия Торговец",
//            "Доставить груз через лес",
//            800,
//            isUrgent = true)
//
//    )
//    for (mission in missions){
//        mission.describe()
//        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
//        println()
//    }

    val escortQuest = Quest(
        title = "Сопроводи торговца до деревни",
        duration = 4,
        reward = 120,
        difficulty = "Средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()
}