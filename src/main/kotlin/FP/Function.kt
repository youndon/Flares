@file:Suppress("UNUSED_PARAMETER")

package FP

import kotlinx.coroutines.delay

//Function declarations
//Functions in Kotlin are declared using the fun keyword:
 fun myint(x: Int): Int {
 return 2 * x
 }
// or shortly
fun myint2() = 32 + 6

// Generic Function.
 fun <T>general(a:T):T {
    val go :T
    return a
}
// fun return Pair.
 fun myPair(int: Int,string: String):Pair<Int,String>{
    return Pair(int,string)
}
// also equality:
fun  deafening() = 10 to 20

// fun return Triple.
 fun myTriple(int: Int,string: String,char: Char):Triple<Int,String,Char>{
    return Triple(int,string,char)
}
// Array return .
 fun myMutable(vararg long: Long): ArrayList<*> {
    return arrayListOf(long)
}
// Anonymous fun.
fun myAnonymous() = fun (){}

// High-Order fun.
fun myExtension(a: () -> Unit) {}

// Lambda fun.High-Order.
fun myLambda() =  { a:Int,b:Int -> a + b }

// infix notation.
// infix function must by extension function and have one parameter value.
private infix fun Any.divide(int: Int){}

// suspend Fun.
 private suspend fun mySuspend(){ delay(1000) }

// Local fun.
 fun firstFloor(){
    fun secondFloor(){
    }
}
// operator Fun.
// operator function must by extension function and have one parameter value.
// its powerful modifier used for make possibility operation between two values.
private operator fun Any.plus(int: Int){}

/* inline Fun.
 Normally it's used in high-order functions, and when you have parameter as function
 the inline keyword came to make the implantation of your code more efficiency
 it's substitutes the body of parameter function directly into place where the function gets called,
 the system doesn't suggested this option because it strong. */
 inline fun myInline(a:()->Unit){}

// noinline.
// Add noinline for exclude that functions you won't make it inline.
inline fun myInlineFun(a:()->Unit,noinline b:()->Unit){}

inline fun myInlineFunction(crossinline a:()->Unit){} // TODO: 10/06/2021 crossinline

// external modifier.
// If you need to access a class implemented in JavaScript from Kotlin in a typesafe way,
// you can write a Kotlin declaration using the external modifier.
 external fun myExternal()

/**
methods vs functions:
[Method] is a [function] associated to an object.
Definitely all top-level [functions] are not [methods].
 */

/* parameter vs argument:
Parameter is variable defined in function declaration.
 Argument is the actual value of this variable that get passed to the function. */
// example :
@Suppress("UNREACHABLE_CODE")
private fun randomString(length: Int): String {
    /*                      ↑
                         parameter                 */
    return "it's $length"
}
object Some {
    init {
        randomString(10) // 10 is an argument
    }
//In this example length is a parameter, and 10 (used in function call) is an argument.
}

// where option.
fun <F> genericF(f:F): F where F:CharSequence = f // TODO: 14/12/2021
