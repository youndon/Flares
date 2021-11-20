package Atlas.c

private interface Comparable {
     var comparable: Comparable<Any>

    /**
     * Classes which inherit from this interface have a defined total ordering between their instances.
     */
    fun myComparable() {
    comparable.compareTo(1)
    }
}