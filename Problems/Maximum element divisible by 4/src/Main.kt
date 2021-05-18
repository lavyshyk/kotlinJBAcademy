fun main() {
    val count = readLine()!!.toInt()
    var num = 0
    repeat(count) {
        val n = readLine()!!.toInt()
        if (n % 4 == 0 && n > num) num = n
    }
    println(num)
}