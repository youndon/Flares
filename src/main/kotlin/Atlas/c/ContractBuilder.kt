package Atlas.c

import kotlin.contracts.ContractBuilder
import kotlin.contracts.ExperimentalContracts

interface ContractBuilder {
    @ExperimentalContracts
     var contractBuilder: ContractBuilder

    @ExperimentalContracts
    fun main() {
//        contractBuilder.callsInPlace() // todo Function??
        contractBuilder.returns()
        contractBuilder.returnsNotNull()
    }
}
