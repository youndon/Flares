import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.coroutines.coroutineContext
import kotlin.reflect.typeOf

@OptIn(ExperimentalContracts::class)
fun main() {

    val ss = sequence{
        yield(1)
        yieldAll(sequenceOf(1,2,3,4,5,5,68,7,9,0))
    }
    iterator {
        yield(2)
    }

}


// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

val arr = arrayOf(1,2,3)
val lis = listOf(1,2,3)
@OptIn(ExperimentalStdlibApi::class)
val builis = buildList<Int>{

}
val arrlis = arrayListOf(1,2,3)
val mutlis = mutableListOf(1,2,3)
