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
    @ExperimentalStdlibApi
    fun myIterable() {
        val iterable  =  "string".asIterable()

        with(iterable) {
            this.all { it == 's' } // check each index equal some specific value.
            this.any { it == 's' } // check if some value existing in any index.
            this.asSequence().run {
                /**@see Atlas.s.Sequence */
            }
            this.associateWith { it }.run {
                /** @see collections.maps*/
            }
            this.associateBy { Pair(it, it) } //
            this.associateWithTo(mutableMapOf()) { it } //
            this.associateByTo(mutableMapOf()) { any -> any }
            this.associateWith { any -> any } //
            this.associateWithTo(mutableMapOf()) { any -> any } //
            this.chunked(2) { it == it } //
            this.contains('s') // check if the text has specific char or CharSequence.
            this.count() // size indexes.
            this.distinct() // TODO
            this.distinctBy { } // TODO
            this.elementAt(0) // return the index number 0.
            this.elementAtOrElse(2) { 'z' } // return the index number, if not else 'z'.
            this.elementAtOrNull(2) // return the index number, or null.
            this.first() // to get first index.
            this.firstOrNull() // to get first index or null.
            this.firstNotNullOf {  }
            this.firstNotNullOfOrNull {  }
            this.find { it == 's' } // to find and get 's' char from the text if it existing, or null.
            this.findLast { it == 's' }
            this.flatMap { listOf('z') } //
            this.flatMapTo(mutableListOf()) { listOf('z') } //
            this.forEach { print(it) }
            this.forEachIndexed { index, any -> println("$index; $any") }
            this.fold("") { acc, any -> acc + any } //
            this.foldIndexed("") { index, acc, any -> acc + any + index }
            this.filter { it == it }
            this.filterNot { it == it }
            this.filterIndexed { index, it -> it == it }
            this.filterIsInstanceTo(mutableListOf(""))
            this.filterTo(mutableListOf()) { it == it }
            this.filterNotTo(mutableListOf()) { it == it }
            this.groupByTo(mutableMapOf(), { it }, { it }) //
            this.groupBy { it == 's' } //
            this.groupingBy { it }.run {
                /**@see Atlas.g.Grouping*/
            }
            this.indexOf(Any()) // return index of char 's'.
            this.indexOfFirst { it == 's' }
            this.indexOfLast { it == 'g' }
            this.iterator().run {
                /**@see Atlas.i.Iterator*/
            }
            this.joinTo(StringBuilder("")) // TODO: 29/05/2021
            this.joinToString()
            this.last() // last index value.
            this.lastOrNull() // last index value, if the string is empty return null.
            this.lastIndexOf('t') //  last index number of 't' char.
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
            this.none { c: Char -> c == 'z' } // return true if the char not existing in text.
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
            this.single { it == 't' } // Returns the single character if it was existing.
            this.singleOrNull()
//            this.sumOf { 1 } // TODO: 25/05/2021
            this.sortedBy { it }
            this.sortedByDescending { it }
            this.plus('z')
            this.plusElement('z')
            this.toCollection(mutableListOf<Any>()).run {
                /**@see collections.lists*/
            }
            this.toHashSet() //
            this.toList().run {
                /**@see collections.lists*/
            }
            this.toMutableList() //
            this.toSet() //
            this.toSortedSet() //
            this.toMutableSet()
            this.windowed(3) // [str, tri, rin, ing].
            this.withIndex().run {
            }
            this.zip(listOf('1', '2', '3')).run {
                /**@see collections.lists*/
            } // [(s, 1), (t, 2), (r, 3)]
            this.zipWithNext { a: Char, b: Char -> a + "" + b } // [st, tr, ri, in, ng]
            this.spliterator().run {
                /**@see AtlasJ.JSpliterator*/
            }
            this.union(this) // TODO
            this.shuffled() // TODO
            this.partition { it == it } // TODO
            this.reversed()
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
