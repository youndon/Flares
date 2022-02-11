import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

}

fun berty() {
    when (readln()) {
        "triangle" -> {
            val (a, b, c) = Array(3) { readLine()!!.toInt() }
            val p = (a + b + c) / 2
            println(sqrt((p * (p - a) * (p - b) * (p - c)).toFloat()))
        }
        "rectangle" -> {
            println(readln().toFloat() * readln().toFloat())
        }
        else -> {
            println("%.1f".format(readln().toFloat().pow(2f) * Math.PI))
        }
    }
}

fun mlogit() {

}