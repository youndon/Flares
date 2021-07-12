@file:Suppress("UNREACHABLE_CODE")

package Atlas.c

import kotlin.collections.Collection

interface Collection {
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
    @ExperimentalStdlibApi
    fun <E>myCollection() {
        val collection :Collection<Char> = listOf('a','b')

        with(collection) {
            this.size
            this.indices
            this.parallelStream()
            this.stream()
            this.contains('z')
            this.containsAll(listOf())
            this.isEmpty()
            this.isNotEmpty()
            this.count()
            this.plus('z')
            this.plusElement('z')
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
        matchGroupCollection[1]
        matchNamedGroupCollection[""]
    }
}