

fun main() {
    var account = readLine()!!.toInt()
    val purchases = readLine()!!
    val array = purchases.split(" ").map { it.toInt() }.toIntArray()
    var i = 0
   while (i < array.size) {

       if (account - array[i] >= 0){
           account -= array[i]
           i++
       }else {
           println("""Error, insufficient funds for the purchase. You have $account, but you need ${array[i]}.""".trimMargin())
           break
       }
   }
    if (account == 0 && i == array.size){
        println("""Thank you for choosing us to manage your account! You have 0 money.""")
    }
   if (account > 0 && i == array.size) {
       println("""Thank you for choosing us to manage your account! You have $account money.""")
   }
}