package Atlas.f

import kotlin.jvm.functions.FunctionN

interface FunctionN {
     var functionN: FunctionN<Char>
    fun main() {
        functionN.invoke()
        functionN.arity
    }
}