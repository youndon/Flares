import kotlinx.coroutines.processNextEventInCurrentThread
import java.util.function.UnaryOperator

fun main(){

    println("check it out.")


}

// Balance checker
fun balance() {
    val accountMoney = readLine()!!.toInt()
    val purchases = readLine()!!.split(' ').map { it.toInt() }

    if (accountMoney >= purchases.sum()) {
        println("Thank you for choosing us to manage your account! You have ${accountMoney-purchases.sum()} money.")
    } else {
        purchases.reduce { acc, s ->
            if (acc+s > accountMoney)
                println("Error, insufficient funds for the purchase. You have ${acc}, but you need $s.")
            s + acc
        }
    }
}