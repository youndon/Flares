import java.util.Collections
import kotlin.coroutines.Continuation

fun main() {
    (90..97).forEach {
        println("\u001b[0;${it}m Normal Text!")
    }
    println("\u001B[0m")
    (90..97).forEach {
        println("\u001b[1;${it}m Bold Text!")
    }
    println("\u001B[0m")
    (90..97).forEach {
        println("\u001b[3;${it}m Italic Text!")
    }
    println("\u001B[0m")
    (90..97).forEach {
        println("\u001b[4;${it}m UnderLine Text!")
    }
    println("\u001B[0m")
    (90..97).forEach {
        println("\u001b[9;${it}m MiddleLine Text!")
    }
    println("\u001B[0m")
    (90..97).forEach {
        println("\u001b[7;${it}m Background Text!")
    }
    println("\u001B[0m")

}

