package c

import kotlinx.coroutines.cancel
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.isActive
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.getPolymorphicElement
import kotlin.coroutines.minusPolymorphicKey

interface CoroutineContext {
    val cc : CoroutineContext
    val ele : CoroutineContext.Element
    val ke : CoroutineContext.Key<*>

    @ExperimentalStdlibApi
    fun some() {
        with(cc){
            cancel()
            cancelChildren()
//            this.fold()
            isActive
            minusKey(ke)
            plus(this)
            this[ke]
        }
        with(ele){
            key
            minusPolymorphicKey(ke)
            getPolymorphicElement(ke)
        }
    }
}