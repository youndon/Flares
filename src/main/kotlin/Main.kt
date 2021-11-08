import java.io.File
import java.io.IOException

fun main() {


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

// The first position of the largest element.
fun sdfsdfs() {
    /*Write a program that reads a sequence of numbers of undefined size and prints the largest number and the position of its first
occurrence. The position starts from 1*/

    val lis = listOf(1,2,3,4,5,6,7,6,7)
    print("${lis.maxOf { it }} ${lis.count { co -> co == lis.maxOf { it } }}")

}


// The try-catch-finally statement Complex handling
fun suspiciousFunction (param: Int) = param.runCatching {
    when (this) {
        0 -> throw Exception("Some exceptions?")
        1 -> throw ArithmeticException("Division by zero")
        2 -> throw Exception("An exception occurred here")
        else -> throw IOException("The IOException occurred")
    }
}.onSuccess { println("Handling completed successfully!") }

