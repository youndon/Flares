import kotlin.math.hypot

fun main() {

}

fun perimeter(x1: Double, y1: Double,
              x2: Double, y2: Double,
              x3: Double, y3: Double,
              x4: Double = x1, y4: Double = y1): Double {
    return hypot(hypot(x1, y1),hypot(x2, y2)) +
            hypot(hypot(x2, y2),hypot(x3, y3)) +
            hypot(hypot(x3, y3),hypot(x4, y4)) +
            hypot(hypot(x4, y4),hypot(x1, y1))

}



