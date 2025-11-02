package characters

import magic.Spell


class Hero{
        var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var ur: Int = 0
    var St: String = "Неизвестно"

    fun sayHello(){
        println("Я -- $name, мой путь только начинается!")
    }
    fun showStats(){
        println("Имя: $name | Класс: $role | НР: $hp | МР: $mp | " +
                "Level: $ur | Element: $St")
    }
    fun meditate(){
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }
    fun takeDamage(){
        println("$name получает урон!")
        hp -= 10
        println("Осталось здоровье: $hp")
    }
    fun castSpell() {
        if (mp >= 10) {
            mp -= 10
            println("Герой применяет магию! Осталось mp: $mp")
        } else {
            println("Мана закончилась! Вы не можете использовать магию.")
        }
    }
    fun heal() {
        println("Лечусь! Восстановлено здоровье, потрачено 10 маны.")
        if (mp >= 10) {
            hp += 10
            mp -= 10
            println("Герой восстановил 10 hp! Сейчас hp: $hp, mp: $mp")
        } else {
            println("Недостаточно маны! У вас только $mp.")
        }
    }
    fun greet(name: String){
        println("Прривет, $name!")
    }
//    fun castSpellOn(enemy: characters.Enemy, spellName: String, damage: Int) {
//        println("$name использует заклинание '$spellName' против ${enemy.name}!")
//        if (element == enemy.element) {
//            println("Стихии совпадают! Урон снижен.")
//            val reducedDamage = damage / 2
//            enemy.takeDamage(amount = reducedDamage)
//        } else {
//            enemy.takeDamage(amount = damage)
//        }
//    }
    fun duel(oppenent: Hero){
        println("Дуэль между $name и ${oppenent.name} начинается!")
        println("$name атакует первым!")
        oppenent.takeDamage()
        println("${oppenent.name} отвечает!")
        this.takeDamage()
        println("Дуэль завершена.")
        println("Состояние героев: ")
        this.showStats()
        oppenent.showStats()
    }
    fun isAlive(): Boolean {
        return hp > 0
    }
//    fun canAcceptQuest(quest: world.Quest): Boolean{
//        val canAccept = when (quest.difficulty.lowercase()){
//            "лёгкий" -> level >= 1
//            "средний" -> level >= 3
//            "сложный" -> level >= 5
//            else -> false
//        }
//        if (canAccept){
//            println("$name может принять квест <${quest.title}>!")
//        } else {
//            println("$name не может принять квест <${quest.title}>." +
//                    "Требуется более высокий уровень.")
//        }
//        return canAccept
//    }

    /*
    ZAD3 LAB6
     */
//    fun canCast(spell: Spell): Boolean{
//        return spell.name.length <= level * 2 && spell.width <= 5 && spell.height <= 5
//}

}