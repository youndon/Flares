@file:Suppress("IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION", "UNREACHABLE_CODE")

package Atlas.i

import java.util.Comparator
import kotlin.text.StringBuilder

private interface Iterable {
    var mutableIterable: MutableIterable<String>

    /**
     * Classes that inherit from this interface can be represented as a sequence of elements that can
     * be iterated over.
     * @param T the type of element being iterated over.
     * The iterator is covariant on its element type.
     */
    fun myIterable() {
        val iterable  =  "Argentina".asIterable()

        with(iterable) {
            all { it == 's' } // check each index equal some specific value.
            any { it == 's' } // check if some value existing in any index.
            asSequence().run {
                /**@see Atlas.s.Sequence */
            }
            associateWith { it }.run {
                /** @see collections.maps*/
            }
            this.associateBy { Pair(it, it) } //
            this.associateWithTo(mutableMapOf()) { it } //
            this.associateByTo(mutableMapOf()) { any -> any }
            this.associateWith { any -> any } //
            this.associateWithTo(mutableMapOf()) { any -> any } //
            chunked(2) { it == it } // Splits this collection into several lists
            contains('s') // check if the text has specific char or CharSequence.
            count { it == 's' } // count the size of "it".
            this.distinct() // TODO Returns a list containing only distinct elements from the given collection.
            this.distinctBy { } // TODO
            elementAt(0) // return the element of index.
            elementAtOrElse(2) { 'z' } // , or 'z' if the index is out of bounds of this collection.
            elementAtOrNull(2) //, or null if the index is out of bounds of this collection.
            first() // to get first index.
            firstOrNull() // to get first index or null.
            firstNotNullOf { it=='t' } // to get first index of "it".
            firstNotNullOfOrNull { it=='t' } //  or null if no non-null value was produced.
            find { it == 's' } // to find and get "it" from the text if it existing, or null if wasn't.
            findLast { it == 's' }
            this.flatMap { listOf('z') }
            this.flatMapTo(mutableListOf()) { listOf('z') } //
            forEach { print(it) }
            this.forEachIndexed { index, any -> println("$index; $any") }
            this.fold("") { acc, any -> acc + any } //
            this.foldIndexed("") { index, acc, any -> acc + any + index }
            filter { it == 's' } // for get only "it" from the string.
            filterNot { it == 's' } // for get all the text except "it".
            filterIndexed { index, it -> it == it }
            filterIndexedTo(mutableListOf()) { index, it -> it == it }
            this.filterIsInstanceTo(mutableListOf(""))
            this.filterTo(mutableListOf()) { it == it }
            this.filterNotTo(mutableListOf()) { it == it }
            this.groupByTo(mutableMapOf(), { it }, { it }) //
            this.groupBy { it == 's' } //
            this.groupingBy { it }.run {
                /**@see Atlas.g.Grouping*/
            }
            indexOf('s') // return index of char 's'.
            indexOfFirst { it == 's' }
            indexOfLast { it == 'g' }
            iterator().run {
                /**@see Atlas.i.Iterator*/
            }
            joinTo(StringBuilder("")) //
            joinToString()
            last() // last index value.
            lastOrNull() // last index value, if the string is empty return null.
            lastIndexOf('t') //  last index of the element.
            this.map { '*' } // [*, *, *, *, *, *]
            this.mapTo(mutableListOf()) { '*' } // [*, *, *, *, *, *]
            this.mapNotNull { '*' } // [*, *, *, *, *, *], if {null}==[].
            this.mapNotNullTo(mutableListOf()) { '*' } // [*, *, *, *, *, *], if {null}==[].
            this.mapIndexed { index, any -> any;index } //
            this.mapIndexedNotNull { index, any -> any; index } //
            this.mapIndexedNotNullTo(mutableListOf()) { index, any -> any; index } //
            this.maxOrNull() // return max value.
            this.maxByOrNull { it.isLowerCase() }
            this.maxWithOrNull(Comparator { t, t2 ->
                when {
                    t > t2 -> 1
                    t == t2 -> 0
                    else -> -1
                }
            })
            this.minOrNull() // return min value.
            this.minByOrNull { it.isLowerCase() }
            this.minWithOrNull(Comparator { t, t2 ->
                when {
                    t > t2 -> 1
                    t == t2 -> 1
                    else -> -1
                }
            })
            this.minus('z')
            this.minusElement('z')
            none { it == 'z' } // return true if the char not existing in the string.
            this.onEach { println(it) }
            this.reduce { acc, c -> c }
            this.reduceOrNull { acc, c -> c }
            this.reduceIndexed { index, acc, c -> c }
            this.runningReduce { acc, c -> c }
            this.runningReduceIndexed { index, acc, c -> c }
            this.scanIndexed("") { index, acc, c -> "$acc-$c-$index" }
            this.scan("") { acc: String, c: Char -> "$acc*$c" } // [, *s, *s*t, *s*t*r, *s*t*r*i, *s*t*r*i*n, *s*t*r*i*n*g].
            this.runningReduce { acc, c -> c }
            this.runningReduceIndexed { index, acc, c -> c }
            single { it == 't' } // Returns the single element if existing, or throw exception.
            singleOrNull() // , or null if not exist.
//            this.sumOf { c: Char -> c } // TODO: 25/05/2021
            this.sortedBy { it }
            this.sortedByDescending { it }
            this.plus('z')
            this.plusElement('z')
            toCollection(mutableListOf<Any>()).run {
                /**@see collections.lists*/
            }
            toHashSet() // Returns a new HashSet of all elements.
            toList().run {
                /**@see collections.lists*/
            }
            toMutableList() // Returns a new MutableList filled.
            toSet() // Returns a Set of all elements.
            toSortedSet() // Returns a Set of all elements.
            toMutableSet() // Returns a new MutableSet.
            windowed(3) // [str, tri, rin, ing].
            withIndex() // Returns a lazy Iterable that wraps each element with his index.
            this.zip(listOf('1', '2', '3')).run {
                /**@see collections.lists*/
            } // [(s, 1), (t, 2), (r, 3)]
            this.zipWithNext { a: Char, b: Char -> "$a$b" } // [st, tr, ri, in, ng]
            spliterator().run {
                /**@see AtlasJ.JSpliterator*/
            }
            union("...".asIterable()) // Returns a set containing all distinct elements from both collections.
            shuffled() // Returns a new list with the elements of this list randomly shuffled.
            this.partition { it == 't' } // TODO
            reversed()
        }
        // collection type of integer only.
        listOf(1,2,3,4,5,6,7,8,9).asIterable().average() // Returns an average value of elements in the collection.

        mutableIterable.run {
            this.removeAll { it == it }
            this.retainAll { it == it }
        }
    }
    // So What's the different between Iterable and Sequence.
    // -> Sequence are "processed" lazily, Iterable eagerly.
}
