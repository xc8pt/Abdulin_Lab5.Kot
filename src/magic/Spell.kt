package magic

class Spell
    (
    val name: String,
    val width: Int,
    val height: Int,
    val symbol: String
) {

    //Для квадратных
    constructor(name: String, size: Int, symbol: String) : this(name, size, size, symbol)

    //по умолчанию
//    constructor() : this("", 0, 0, "")

    fun cats(){
        println("Кастуем $name!")
        repeat(height){
            repeat(width){
                print(symbol)
            }
            println()
        }
    }
    fun area(): Int {
        return width * height
    }
    fun description(): String {
        return "Заклинание $name занимает область ${width}x$height" +
                "и использует символ $symbol"
    }
}