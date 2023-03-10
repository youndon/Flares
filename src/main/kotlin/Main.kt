import org.jetbrains.annotations.NonNls

fun main() {



    println(1)
    lax {
        return@lax
    }
    println(3)



}

inline fun lax(@NonNls c:()->Unit) {
    c.invoke()
}
fun <T> filterNonNullValues(l: List<Any?>) = l.filterNotNull() as List<T>