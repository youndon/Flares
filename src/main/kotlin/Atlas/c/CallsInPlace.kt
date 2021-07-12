package c

import kotlin.contracts.CallsInPlace
import kotlin.contracts.ExperimentalContracts
@Deprecated("don't have attachment!")
class CallsInPlace{
@ExperimentalContracts
lateinit var callsInPlace: CallsInPlace
@ExperimentalContracts
fun main() {
    callsInPlace
}
}
