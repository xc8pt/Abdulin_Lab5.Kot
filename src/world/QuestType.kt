package world

enum class QuestType(val description: String) {
    DELIVERY("Доставка предмета"),
    ELIMINATION("Устранение врага"),
    ESCORT("Сопровождение персонажа"),
    EXPLORE("Исследование новой территории"),
    BOSSFIGHT("Битва с боссом"),
    HUNT("Охота на монстров"),
    PUZZLE("Решение загадки")
}