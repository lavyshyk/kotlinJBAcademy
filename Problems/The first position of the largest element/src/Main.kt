import java.util.*

fun main() {
    var maxNum = Int.MIN_VALUE
    var idNum = 0
    var currId = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val number = scanner.nextInt()
        idNum++
        if (number > maxNum) {
            maxNum = number
            currId = idNum
        }

    }
    print("$maxNum $currId")
}