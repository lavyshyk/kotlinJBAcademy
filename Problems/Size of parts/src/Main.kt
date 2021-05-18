fun main() {
    val n = readLine()!!.toInt()
    var smaller = 0
    var larger = 0
    var perfect = 0
    repeat(n){
         readLine()!!.toInt().let {
            if (it == 0) perfect++
            if (it == 1) larger++
            if (it == -1) smaller++
        }
    }
    print("$perfect $larger $smaller")
}