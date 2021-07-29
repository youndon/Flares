package Atlas.c

import kotlin.collections.Collection


private interface Collection {
    var mutableCollection: MutableCollection<Char>
    var matchNamedGroupCollection: MatchNamedGroupCollection
    var matchGroupCollection: MatchGroupCollection

    /**
     * A generic collection of elements.
     * Methods in this interface support only read-only access to the collection;
     * read/write access is supported through the [MutableCollection] interface.
     * @param E the type of elements contained in the collection.
     * The collection is covariant on its element type.
     */
    fun <E> myCollection() {
        val collection: Collection<Int> = listOf()
        with(collection) {
            this.size
            this.indices
            this.parallelStream()
            this.stream()
            this.contains(0)
            this.containsAll(listOf())
            this.isEmpty()
            this.isNotEmpty()
            count { it == 0 } // count the size of "it".
            plus(0) // Returns an array containing all elements of the original array and then all elements of the given elements array.
            plusElement(3) // Returns an array containing all elements of the original array and then the given element.
            this.random()
            this.randomOrNull()
            this.toMutableList()
            this.toTypedArray()
        }
        with(mutableCollection) {
            this.remove('z')
            this.removeAll(listOf())
            this.removeIf { it == 'z' }
            this.add('*')
            this.addAll(listOf('*'))
            this.plusAssign(listOf())
            this.minusAssign(listOf())
            this.retainAll(listOf())
            this.clear()
        }
        matchGroupCollection
        matchNamedGroupCollection
    }
}