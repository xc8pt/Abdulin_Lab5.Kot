import java.io.File

fun main(){
    val file = File("toDo.txt")
    while(true){
        println("\n=== МЕНЮ ЗАДАЧ ===")
        println("1 - Добавить задачу")
        println("2 - Показать все задачи")
        println("3 - Удалить задачу")
        println("0 - Выход")
        println("Выберите действие: ")
        when (readln()){
            "1" -> {
                print("Введите новую задачу: ")
                val task = readln()
                file.appendText("$task\n")
                println("Задача добавлена.")
            }
            "2" -> {
                println("Все задачи: ")
                if (file.exists() && file.readLines().isNotEmpty()){
                    file.readLines().forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                } else {
                    println("!!! Список задач пуст.")
                }
            }
            "3" -> {
                val tasks = file.readLines().toMutableList()
                if (tasks.isEmpty()){
                    println("Список задач пуст.")
                } else {
                    println("Задачи для удаления: ")
                    tasks.forEachIndexed {index, task ->
                        println("${index + 1}. $task")
                    }
                    print("Введите номер задачи для удаления: ")
                    val num = readln().toIntOrNull()
                    if (num == null || num !in 1..tasks.size){
                        println("Некорректный номер.")
                    } else {
                        val removed = tasks.removeAt(num - 1)
                        file.writeText("")
                        tasks.forEach {file. appendText("$it\n")}
                        println("Задача \"$removed\" удалена.")
                    }
                }
            }
            "0" -> {
                println("Выход из программы.")
                break
            }
            else -> println("Некорректный ввод. Попробуйте снова.")
        }
    }
}



//    --------
//    val file = File("ToDo.txt")
//    println("Welcome to TODO Application")
//    while(true){
//        print("input your task(input 0 for exit): ")
//        val userInput = readln()
//        if (userInput == "0"){
//            break
//        } else {
//            file.appendText("$userInput\n")
//            println("Задача сохранена!")
//        }
//    }
//    println("\nВаш список задач: ")
//    println(file.readText())
//    ------
//    val file = File("demo.txt")
//    val lines = file.readLines()
//    for ((index, line) in lines.withIndex()){
//        println("${index + 1}: $line")
//    }
//    file.appendText("Новая строка\n")
//    println(file.readText())
//    println("Создаём файл: ")
//    file.writeText("Привет!\n")
//    println("файл содержит: ")
//    println(file.readText())
//}
