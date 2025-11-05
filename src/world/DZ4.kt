package world
/*
ZAD1
 */
//fun printExploreQuests(quests: List<Quest>) {
//    println("Квесты типа EXPLORE:")
//    for (q in quests) {
//        if (q.questType == QuestType.EXPLORE) {
//            q.describe()
//            q.printInfo()
//            println()
//        }
//    }
//}
//
//fun main() {
//    val q1 = Quest("Охота на волков", 3, 100, "Easy", QuestType.HUNT)
//    val q2 = Quest("Исследовать руины", 5, 200, "Medium", QuestType.EXPLORE)
//    val q3 = Quest("Сопроводить караван", 4, 160, "Hard", QuestType.ESCORT)
//    val q4 = Quest("Открыть тайник в лесу", 2, 120, "Medium", QuestType.EXPLORE)
//
//    val quests = listOf(q1, q2, q3, q4)
//
//    for (quest in quests) {
//        quest.describe()
//        quest.printInfo()
//        println()
//    }
//
//    printExploreQuests(quests)
//}
/*
ZAD2
 */
fun main() {
    val trader = Trader("Ринат")
    trader.start()
}