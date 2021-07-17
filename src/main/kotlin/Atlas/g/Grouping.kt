package Atlas.g

import kotlin.collections.Grouping

interface Grouping {
    val grouping : Grouping<Any,Any>

    /** A [Grouping] structure serves as an intermediate step in group-and-fold operations:
     * they group elements by their keys and then fold each group with some aggregating operation.
     */
    fun some() {
        with(grouping) {
            this.keyOf(0)
            this.sourceIterator()
//        this.aggregate { key, accumulator, any, first ->  }
//        this.aggregateTo(mutableMapOf(),{key, accumulator, element, first ->  })
            this.eachCount()
            this.eachCountTo(mutableMapOf())
//        this.fold({key, element ->  },{accumulator, element ->  })
//        this.foldTo({ mutableMapOf<Any,Any>()},{key, element ->  },{accumulator, element ->  })
            this.reduce { key, accumulator, element -> accumulator }
            this.reduceTo(mutableMapOf()) { key, accumulator, element -> accumulator }
        }
    }
}