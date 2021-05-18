fun main() {
    val n = readLine()!!.toInt()
    var min = Int.MAX_VALUE
    for (i in 1..n){
        val k = readLine()!!.toInt()
        if (k < min) min = k
    }
    print(min)
}