//fun main(){
//    val quest = Quest()
//    print("Введите название квеста: ")
//    val title = readln()
//
//    print("Введите время выполнения (в часах): ")
//    val duration = readln().toInt()
//
//    print("Введите награду (в монетах): ")
//    val reward = readln().toInt()
//
//    print("Введите уровень сложности: ")
//    val difficulty = readln()
//
//    println("Название квеста: ${quest.title} Время выполнения: ${quest.duration}" +
//            " Награда: ${quest.reward} золотых Уровень сложности: ${quest.difficulty}")
//    quest.init("Охота на тролля", 3,500,"Средний")
//    for (i in 1..3){
//        val q = Quest()
//        print("Введите название квеста: ")
//        val title = readln()
//
//        print("Введите время выполнения (в часах): ")
//        val duration = readln().toInt()
//
//        print("Введите награду (в монетах): ")
//        val reward = readln().toInt()
//
//        print("Введите уровень сложности: ")
//        val difficulty = readln()
//        q.init(title, duration, reward, difficulty)
//        quest.add(q)
//        println()
//    }
//    println("Все доступные квесты: ")
//    for (q in quests)
//}