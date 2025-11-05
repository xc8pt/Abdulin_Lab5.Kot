package magic

class Spell
    (
    name: String,
    val width: Int = 0,
    val height: Int = 0,
    symbol: String
) : MagicEffect(name,symbol, 10){

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