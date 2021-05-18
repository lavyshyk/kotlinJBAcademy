fun main() {
    // write your code here
    val ch = readLine()!!.first()
    println(ch.isUpperCase() || (ch.isDigit() && ch != '0'))
}