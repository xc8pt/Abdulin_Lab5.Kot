package pets

fun main(){
//    val pets1 = listOf<Pet>(
//        Wolf("Фенрир"),
//        Cat("Барсик"),
//        Eagle("АРЁЛ"),
//        Bear("Мишка"),
//        "Hello"
//    )
    val pets = listOf(
        Wolf("Фенрир"),
        Cat("Барсик"),
        Eagle("АРЁЛ"),
        Bear("Мишка")
    )
    for (pet in pets){
        pet.describe()
        pet.makeSound()
        println()
    }
}