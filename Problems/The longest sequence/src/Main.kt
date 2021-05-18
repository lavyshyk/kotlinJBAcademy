fun main() {
    val times = readLine()!!.toInt()
    var res = 1
    var resTemp = 1
    val arr = Array(times){ readLine()!!.toInt() }
    for (i in 0 until arr.size -1) {
        if (arr[i] <= arr[i + 1]) {
            resTemp++
            if (res < resTemp) res = resTemp
        } else resTemp = 1
    }
    print(res)

}