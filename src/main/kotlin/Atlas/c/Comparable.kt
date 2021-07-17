package Atlas.c

import kotlin.Comparable

interface Comparable {
     var comparable: Comparable<Int>

    /**
     * Classes which inherit from this interface have a defined total ordering between their instances.
     */
    fun myComparable() {
    comparable.compareTo(1)
    }
}