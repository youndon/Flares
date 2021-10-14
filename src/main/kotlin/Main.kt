import AtlasLib.Coding
import AtlasLib.Uncoding
import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import java.math.RoundingMode
import java.util.*
import kotlin.math.pow
import kotlin.time.*

fun main() {



}


/*
Create a euphonious word.
    println("player".windowed(3).count {
   it.all { a -> a in "aeiouy" } xor it.none { a -> a in "aeiouy" } })


Cutting out the middle of a string.
    val s = "ab*cd"
    if (s.length % 2 == 0) {
        s.chunked(s.length/2).also { println(it.first().dropLast(1)+it.last().drop(1)) }
    } else println(s.removeRange(s.lastIndex/2..(s.lastIndex/2)))

Generating Password.
 val ns = "3 4 2 9".split(' ').map { it.first().digitToInt() }
   if (ns[0]+ns[1]+ns[2] <= ns[3]) {
      val list = mutableListOf<Any>()
      repeat(ns[0]) { list.add(('a'..'z').random()) }
      repeat(ns[1]) { list.add(('A'..'Z').random()) }
      repeat(ns[2]) { list.add(('0'..'9').random()) }
      println(list.shuffled().joinToString("").take(ns[3]))
   } else println()

Guard On The Gate.
      println(s.plus(ss).joinToString())

Move The First N Character.
  val s = "Hello 3".split(' ')
    val n = s.last().last().digitToInt()-1
    print(s.first().takeLast(n)+s.first().dropLast(n))

Playing with Numbers.
    val s = "8 11 1 2 3"
    println(
        s.split(' ').sumOf { it.toInt() }.toString() + " " +
                s.removeRange(s.lastIndex-3,s.lastIndex-1)
    )


Playing with time.
    println("${calendar.day}${calendar.month}${calendar.year}")

A simple calculator.
 val n = "97 ! 50"
    val first = n.substringBefore(' ').toInt()
    val last= n.substringAfterLast(' ').toInt()
    try {
        println(when  {
           '+' in n -> first + last
           '-' in n -> first - last
           '/' in n -> first / last
           '*' in n -> first * last
           else -> "Unknown operator"
        })
    } catch (e: Exception) {
        println("Division by 0!")
    }

*/

