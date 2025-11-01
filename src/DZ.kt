/*
ZAD1
 */
//class Weapon(
//    var name: String = "Оружие",
//    var damage: Int = 10,
//    var durability: Int = 100,
//    var type: String = "Обычное"
//) {
//    fun showInfo() {
//        println("Название: $name")
//        println("Тип: $type")
//        println("Урон: $damage")
//        println("Прочность: $durability")
//    }
//
//    fun use() {
//        durability -= 10
//        if (durability <= 0) {
//            durability = 0
//            println("Оружие сломано!")
//        }
//    }
//
//    fun upgrade(bonus: Int) {
//        damage += bonus
//    }
//}
//fun main() {
//    val sword = Weapon()
//    sword.showInfo()
//    sword.use()
//    sword.upgrade(5)
//    sword.showInfo()
//}
/*
ZAD2
 */
//class Student(val name: String, var age: Int) {
//    init {
//        println("Создан студент")
//    }
//
//    fun introduce() {
//        println("Меня зовут $name, мне $age лет")
//    }
//
//    fun haveBirthday() {
//        age += 1
//        println("$name празднует день рождения! Теперь ему $age лет")
//    }
//}
//fun main() {
//    val rinat = Student("Rinat", 19)
//    rinat.introduce()
//    rinat.haveBirthday()
//}
/*
ZAD3
 */
//class Group(val groupName: String) {
//    val students = mutableListOf<Student>()
//
//    init {
//        println("Создана группа")
//    }
//
//    fun addStudent(student: Student) {
//        students.add(student)
//        println("Студент ${student.name} добавлен в группу $groupName")
//    }
//
//    fun listStudents() {
//        println("Студенты группы $groupName:")
//        for (student in students) {
//            student.introduce()
//        }
//    }
//
//    fun celebrateBirthdays() {
//        println("В группе $groupName празднуют дни рождения!")
//        for (student in students) {
//            student.haveBirthday()
//        }
//    }
//}
//fun main() {
//    val ivan = Student("Иван", 19)
//    val rinat = Student("Rinat", 19)
//    val group = Group("ИСП-231")
//    group.addStudent(ivan)
//    group.addStudent(rinat)
//    println()
//    group.listStudents()
//    println()
//    group.celebrateBirthdays()
//    println()
//    group.listStudents()
//}
/*
ZAD4*
 */
//class GeometryCalculator {
//
//    fun rectangleInfo(a: Int, b: Int) {
//        val perimeter = 2 * (a + b)
//        val area = a * b
//        println("Прямоугольник $a x $b:")
//        println("Периметр: $perimeter")
//        println("Площадь: $area")
//        if (perimeter == area) {
//            println("Удивительно! Периметр равен площади!")
//        }
//        println()
//    }
//
//    fun triangleInfo(a: Int, b: Int, c: Int) {
//        println("Треугольник со сторонами: $a, $b, $c")
//        val sides = listOf(a, b, c).sorted()
//        if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
//            println("Это прямоугольный треугольник!")
//        } else {
//            println("Это не прямоугольный треугольник")
//        }
//        val perimeter = a + b + c
//        println("Периметр: $perimeter")
//        println()
//    }
//
//    fun circleInfo(r: Double) {
//        val length = 2 * 3.14 * r
//        val area = 3.14 * r * r
//        println("Окружность с радиусом $r:")
//        println("Длина окружности: $length")
//        println("Площадь круга: $area")
//        println()
//    }
//}
//fun main() {
//    println("=== ПРЯМОУГОЛЬНИКИ ===")
//    val gc = GeometryCalculator()
//    gc.rectangleInfo(4, 5)
//    gc.rectangleInfo(3, 6)
//
//    println("=== ТРЕУГОЛЬНИКИ ===")
//    gc.triangleInfo(3, 4, 5)
//    gc.triangleInfo(5, 5, 5)
//    gc.triangleInfo(2, 3, 4)
//
//    println("=== ОКРУЖНОСТИ ===")
//    gc.circleInfo(5.0)
//    gc.circleInfo(10.0)
//}

