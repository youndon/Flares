package Atlas.g

import kotlin.collections.Grouping

interface Grouping {
    val grouping: Grouping<Any, Any>

    /** A [Grouping] structure serves as an intermediate step in group-and-fold operations:
     * they group elements by their keys and then fold each group with some aggregating operation.
     */
    fun some() {
        with(grouping) {
            this.keyOf(0)
            this.sourceIterator()
//        this.aggregate({key: Any, accumulator:String, element: Any, first: Boolean ->  })
//        this.aggregateTo(mutableMapOf(),{key, accumulator, element, first ->  })
            this.eachCount() // TODO: 30/07/2021
            this.eachCountTo(mutableMapOf())
            this.fold(1) { accumulator, element -> 1 }
            this.foldTo(mutableMapOf(), 1) { accumulator, element -> 1 }
            this.reduce { key, accumulator, element -> accumulator }
            this.reduceTo(mutableMapOf()) { key, accumulator, element -> accumulator }
        }
    }
}