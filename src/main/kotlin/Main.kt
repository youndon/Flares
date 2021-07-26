import kotlin.coroutines.coroutineContext
import kotlin.reflect.typeOf

fun main() {

    val dd = "0123456".asIterable()
    dd.plus(8)
    println(dd)

}


// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
// UUID ???
//

val arr = arrayOf(1,2,3)
val lis = listOf(1,2,3)
val arrlis = arrayListOf(1,2,3)
val mutlis = mutableListOf(1,2,3)
