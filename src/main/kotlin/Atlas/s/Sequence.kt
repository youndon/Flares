@file:Suppress("IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package Atlas.s

import kotlinx.coroutines.runBlocking
import java.util.Comparator
import kotlin.Suppress
import kotlin.sequences.SequenceScope

interface Sequence {
    /**
     * A sequence that returns values through its iterator. The values are evaluated lazily, and the sequence
     * is potentially infinite.
     */
    @Suppress("UNREACHABLE_CODE")
    @ExperimentalStdlibApi

  suspend fun SequenceScope<Int>.mySequence() {

        yield(10)
        yieldAll(sequence {  })

        val sequence = "String".asSequence()

        with(sequence) {
            this.all { it == 's' } // check each index equal some specific value.
            this.any { it == 's' } // check if some value existing in any index.
            this.asIterable().run {} //
            this.asSequence().run {}
            this.associateWith { it }.run {
            } //
            this.associateBy { Pair(it, it) } //
            this.associateWithTo(mutableMapOf()) { it } //
            this.associateByTo(mutableMapOf()) { any -> any }
            this.associateWith { any -> any } //
            this.associateWithTo(mutableMapOf()) { any -> any } //
            this.chunked(2) { it == it } //
            this.contains('s') // check if the text has specific char or CharSequence.
            this.count() // size indexes.
            this.constrainOnce() // TODO
            this.distinct() // TODO
            this.distinctBy { } // TODO
            this.elementAt(0) // return the index number 0.
            this.elementAtOrElse(2) { 'z' } // return the index number, if not else 'z'.
            this.elementAtOrNull(2) // return the index number, if not else null.
            this.first() // to get first index.
            this.firstOrNull() // to get first index if not get null.
            this.find { it == 's' } // to find and get 's' char from the text if it existing, if not get null.
            this.findLast { it == 's' }
            this.flatMap {this} // TODO
            this.flatMapTo(mutableListOf()) { this } // TODO
            this.forEach { print(it) }
            this.forEachIndexed { index, any -> println("$index; $any") }
            this.fold("") { acc, any -> acc + any } //
            this.foldIndexed("") { index, acc, any -> acc + any + index }
            this.filter { it == it }
            this.filterNot { it == it }
            this.filterIndexed { index, it -> it == it }
            this.filterIsInstance<Any>()
            this.filterIsInstanceTo(mutableListOf(""))
            this.filterTo(mutableListOf()) { it == it }
            this.filterNotTo(mutableListOf()) { it == it }
            this.filterNotNull()
            this.groupBy { it == 's' } //
            this.groupByTo(mutableMapOf(), { it }, { it }) //
            this.groupingBy { it }.run {
            } // the range: 0..5
            this.indexOf(Any()) // return index of char '.s'.
            this.indexOfFirst { it == 's' }
            this.indexOfLast { it == 'g' }
            this.iterator().run {
            }
            this.ifEmpty { this } // return "Empty!!" if the string is empty.
//            this.joinTo() // TODO
            this.joinToString() // TODO
            this.last() // last index value.
            this.lastOrNull() // last index value, if the string is empty return null.
            this.lastIndexOf('t') //  last index number of '.t' char.
            this.map { '*' } // [*, *, *, *, *, *]
            this.mapTo(mutableListOf()) { '*' } // [*, *, *, *, *, *]
            this.mapNotNull { '*' } // [*, *, *, *, *, *], if {null}==[].
            this.mapNotNullTo(mutableListOf()) { '*' } // [*, *, *, *, *, *], if {null}==[].
            this.mapIndexed { index, any -> any;index } //
            this.mapIndexedNotNull { index, any -> any; index } //
            this.mapIndexedNotNullTo(mutableListOf()) { index, any -> any; index } //
            this.maxOrNull() // return max value.
            this.maxByOrNull { it }
            this.maxWithOrNull(Comparator { t, t2 ->
                when {
                    t > t2 -> 1
                    t == t2 -> 0
                    else -> -1
                }
            })
            this.minOrNull() // return min value.
            this.minByOrNull { it.isLowerCase() }
            this.minWithOrNull { t, t2 ->
                when {
                    t > t2 -> 1
                    t == t2 -> 0
                    else -> -1
                }
            }
            this.minus('z')
            this.minusElement('z')
            this.none { c: Char -> c == 'z' } // return true if the char not existing in text.
            this.onEach { println(it) }
            this.reduce { acc, c -> acc }
            this.reduceOrNull { acc, c -> c }
            this.reduceIndexed { index, acc, c -> c }
            this.scan("") { acc: String, c: Char -> "$acc*$c" } // [, *.s, *.s*.t, *.s*.t*.r, *.s*.t*.r*.i, *.s*.t*.r*.i*.n, *.s*.t*.r*.i*.n*.g].
            this.scanIndexed("") { index, acc, c -> "$acc-$c-$index" }
            this.runningReduce { acc, c -> c }
            this.runningReduceIndexed { index, acc, c -> c }
            this.single { it == 't' } // Returns the single character if it was existing.
            this.singleOrNull()
//            this.sumOf<T> { 1 } // TODO: 25/05/2021
            this.sortedBy { null }
            this.sortedByDescending { null }
            this.plus('z')
            this.plusElement('z')
            this.partition { it == it }
            this.toCollection(mutableListOf<Any>()).run {
            }
            this.toHashSet() //
            this.toList().run {
            }
            this.toMutableList() // [.s, .t, .r, .i, .n, .g].
            this.toSet() // [.s, .t, .r, .i, .n, .g].
            this.toSortedSet() // like reversed(), [.g, .i, .n, .r, .s, .t].
            this.toMutableSet()
            this.windowed(3) // [str, tri, rin, ing].
            this.withIndex().run {
            }
            this.zip(this).run {
                this.unzip() // ([.s, .t, .r, .i, .n, .g], [1, 2, 3, 4, 5, 6]).
            } // [(.s, 1), (.t, 2), (.r, 3), (.i, 4), (.n, 5), (.g, 6)].
            this.zipWithNext { a: Char, b: Char -> a + "" + b } // [st, tr, ri, in, ng].

        }
    }
}