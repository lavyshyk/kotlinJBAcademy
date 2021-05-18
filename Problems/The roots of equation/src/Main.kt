fun main() {
    val (a, b, c, d) = Array(4){ readLine()!!.toInt() }
    for (i in 0..1000){
        if ((a * Math.pow((i * 1.0) ,3.0) + b * Math.pow((i * 1.0), 2.0) + c * i + d) == 0.0) {
            println(i)

        }
    }

}