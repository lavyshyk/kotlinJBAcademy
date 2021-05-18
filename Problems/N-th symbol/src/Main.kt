fun main() {
    val str = readLine()!!
    val i = readLine()!!.toInt()
    println("""Symbol # $i of the string "${str}" is '${str[i - 1]}'""")
}