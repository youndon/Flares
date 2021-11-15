import kotlin.math.hypot

fun main() {

}



// Properties accessors comparison
fun sqdsqd() {
    val city = mutableMapOf(
        "Dubai" to readLine()!!.toInt(),
        "Moscow" to readLine()!!.toInt(),
        "Hanoi" to readLine()!!.toInt()
    )
        .filterNot { it.value in -92..57 }
    if (city.size > 1)
        println("neither")
    else city.keys.forEach {
        println(it)
    }
}