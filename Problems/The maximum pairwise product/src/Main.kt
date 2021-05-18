import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()
    var m1 = readLine()!!.toInt()
    var m2 = 1
    for (i in 2..n){
            val number = readLine()!!.toInt()
            if (number > m1 ) {
                m2 = m1
                m1 = number
            }else if (number > m2) {
                m2 = number
            }
        }

    println(m1 * m2)
}