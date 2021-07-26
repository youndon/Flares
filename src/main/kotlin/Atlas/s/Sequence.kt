package Atlas.s

import kotlinx.coroutines.runBlocking
import java.util.Comparator
import kotlin.Suppress
import kotlin.sequences.SequenceScope

private interface Sequence {
    /**
     * A sequence that returns values through its iterator.
     * The values are evaluated lazily, and the sequence is potentially infinite.
     * Most Sequence members is familiar wit iterable, so you can go back to Iterable to find
     * the descriptions of the members, except constrainOnce() and ifEmpty(),
     * So Then What's the different between Iterable and Sequence.
          -> Sequence are "processed" lazily, Iterable eagerly.
     */

   private suspend fun SequenceScope<Int>.mySequence() {

        yield(10)
        yieldAll(sequence { })

        "Madagascar".asSequence().apply {
            all { it == it }
            any { it == it }
            asIterable()
            asSequence()
            associateBy { Pair(it, it) }
            associateWith { it }
            associateByTo(mutableMapOf()) { any -> any }
            associateWithTo(mutableMapOf()) { it }
            associateWith { any -> any }
            associateWithTo(mutableMapOf()) { any -> any }
            chunked(2) { it == it }
            contains('s')
            count()
            distinct()
            distinctBy { }
            elementAt(0)
            elementAtOrElse(2) { }
            elementAtOrNull(2)
            first()
            firstOrNull()
            find { it == 's' }
            findLast { it == 's' }
            flatMap { this }
            flatMapTo(mutableListOf()) { this }
            flatMapIndexed { index: Int, c: Char -> this }
            flatMapIndexedTo(mutableListOf()) { index: Int, c: Char -> this }
            forEach { print(it) }
            forEachIndexed { index, any -> }
            fold("") { acc, any -> acc + any }
            foldIndexed("") { index, acc, any -> acc + any + index }
            filter { it == it }
            filterNot { it == it }
            filterIndexed { index, it -> it == it }
            filterIsInstance<Any>()
            filterIsInstanceTo(mutableListOf(""))
            filterTo(mutableListOf()) { it == it }
            filterNotTo(mutableListOf()) { it == it }
            filterNotNull()
            groupBy { it == 's' }
            groupByTo(mutableMapOf(), { it }, { it })
            groupingBy { it }
            indexOf(Any())
            indexOfFirst { it == it }
            indexOfLast { it == it }
            iterator()
            joinTo(StringBuffer())
            joinToString()
            last()
            lastOrNull()
            lastIndexOf('t')
            map { }
            mapTo(mutableListOf()) { }
            mapNotNull { }
            mapNotNullTo(mutableListOf()) { }
            mapIndexed { index, any -> }
            mapIndexedNotNull { index, any -> any; index }
            mapIndexedNotNullTo(mutableListOf()) { index, any -> any; index }
            maxOrNull()
            maxByOrNull { it }
            maxWithOrNull { t, t2 -> t.compareTo(t2) }
            minOrNull()
            minByOrNull { it.isLowerCase() }
            minWithOrNull { t, t2 -> t.compareTo(t2) }
            minus('z')
            minusElement('z')
            none { c: Char -> c == 'z' }
            onEach { println(it) }
            reduce { acc, c -> acc }
            reduceOrNull { acc, c -> c }
            reduceIndexed { index, acc, c -> c }
            scan("") { acc: String, c: Char -> "$acc*$c" }
            scanIndexed("") { index, acc, c -> "$acc-$c-$index" }
            runningReduce { acc, c -> c }
            runningReduceIndexed { index, acc, c -> c }
            single { it == it }
            singleOrNull()
//          sumOf<T> { 1 }
            sortedBy { null }
            sortedByDescending { null }
            plus('z')
            plusElement('z')
            partition { it == it }
            toCollection(mutableListOf<Any>())
            toHashSet()
            toList()
            toMutableList()
            toSet()
            toSortedSet()
            toMutableSet()
            windowed(3)
            withIndex()
            zip(this).run {
                unzip()
            }
            zipWithNext { a: Char, b: Char -> a + "" + b }
            shuffled()

            // special for sequence.
            this.ifEmpty { sequence { } } // TODO: 25/07/2021
            this.constrainOnce()  // TODO Returns a wrapper sequence that provides values of this sequence, but ensures it can be iterated only one time.
        }
    }
}