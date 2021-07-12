package c

import kotlin.contracts.ConditionalEffect
import kotlin.contracts.ExperimentalContracts
@Deprecated("don't have attachment!")
interface ConditionalEffect {
    @ExperimentalContracts
     var conditionalEffect: ConditionalEffect
    @ExperimentalContracts
    fun main() {
        conditionalEffect
    }
}
