
package Atlas.c

import java.util.Comparator
import kotlin.CharSequence

interface CharSequence {

    @ExperimentalStdlibApi
    /**
     * Represents a readable sequence of [Char] values.
     */
    private fun attachmentOfTheCharSequence() {
        val charSequence: CharSequence = "string"

        with(charSequence) {
            this.all { it == 's' } // check each index equal some specific value.
            this.any { it == 's' } // check if some value existing in any index.
            this.asIterable().run {
                /**@see Atlas.i.Iterable*/
            }
            this.asSequence().run {
                /**@see Atlas.s.Sequence*/
            }
            this.associate { it to it }.run {
                /**@see collections.maps*/
            } // {s=s, t=t, r=r, i=i, n=n, g=g}.
            this.associateBy { Pair(it, it) } // {(s, s)=s, (t, t)=t, (r, r)=r, (i, i)=i, (n, n)=n, (g, g)=g}
            this.associateTo(destination = mutableMapOf(), transform = { Pair(it.isDigit(), it.isLetter()) }) // {s=s, t=t, r=r, i=i, n=n, g=g}
            this.associateByTo(destination = mutableMapOf(), keySelector = { c: Char -> c.isLetter() }) //{(s, s)=s, (t, t)=t, (r, r)=r, (i, i)=i, (n, n)=n, (g, g)=g}
            this.associateWith { c: Char -> c } // {s=s, t=t, r=r, i=i, n=n, g=g}
            this.associateWithTo(mutableMapOf()) { c: Char -> c } // {s=s, t=t, r=r, i=i, n=n, g=g}
            this.chunked(2) { it == "st" } // [true, false, false]
            this.chunkedSequence(2) { it == "st" } //
            this.commonPrefixWith("str000") // take the correct CharSequence from the start text. -> str
            this.commonSuffixWith("000ing") //  take the correct CharSequence from the end text. -> ing
            this.contains('s') // check if the text has specific char or CharSequence.
            this.count() // size indexes.
            this.elementAt(0) // return the index number 0.
            this.elementAtOrElse(2) { 'z' } // return the index number, if not else 'z'.
            this.elementAtOrNull(2) // return the index number, if not else null.
            this.endsWith("") // Returns `true` if this char sequence ends with the specified suffix.
            this.filter { it.isLowerCase() } // Returns a char sequence containing only those characters from the original char sequence that match the given [predicate].
            this.filterNot { it.isLowerCase() } // Returns a char sequence containing only those characters from the original char sequence that do not match the given [predicate].
            this.filterTo(StringBuilder("")) { it.isLowerCase() } // TODO: 27/05/2021
            this.filterNotTo(StringBuilder("")) { it.isLetter() } // TODO: 27/05/2021
            this.filterIndexed { index, it -> it.isLowerCase() }
            this.filterIndexedTo(StringBuilder("")) { index, c -> c.isLetter() } // TODO: 27/05/2021
            this.first() // to get first index.
            this.firstOrNull() // to get first index if not get null.
            this.find { it == 's' } // to find and get 's' char from the text if it existing, if not get null.
            this.findAnyOf(arrayListOf("")) // to find and get any string of the collection.
            this.findLast { it == 's' }
            this.findLastAnyOf(arrayListOf(""))
            this.flatMap { c: Char -> listOf(c) } // TODO: 27/05/2021
            this.flatMapTo(mutableListOf()) { c: Char -> listOf(c) } // TODO: 27/05/2021
            this.forEach { print(it) }
            this.forEachIndexed { index: Int, c: Char -> println(c + index) }
            this.fold(initial = "#", operation = { acc: String, c: Char -> "$acc*$c" }) // #*s*t*r*i*n*g
            this.foldRight(initial = "#", operation = { c: Char, acc: String -> "$c*$acc" }) // s*t*r*i*n*g*#
            this.foldIndexed(initial = "", operation = { index: Int, acc: String, c: Char -> "$acc*$c$index" })
            this.foldRightIndexed(initial = "", operation = { index: Int, c: Char, acc: String -> "$c*$acc$index" })
            this.getOrElse(0) { 'z' } // get the value of the index 0, or else get 'z'.
            this.getOrNull(0) // get the value of the index 0, or else get null.
            this.groupBy { it == 's' } // {true=[s], false=[t, r, i, n, g]}
            this.groupByTo(destination = mutableMapOf(), keySelector = { it }, valueTransform = { it }) // {s=[s], t=[t], r=[r], i=[i], n=[n], g=[g]}
            this.groupingBy { it }.run {
                /**@see Atlas.g.Grouping */
            }
            this.hasSurrogatePairAt(0) // TODO: 27/05/2021
            this.indices.run {
            } // the range: 0..5
            this.indexOf('s', 0, false) // return index of char 's'.
            this.indexOfAny(arrayListOf("string")) // return index of word "string".
            this.indexOfFirst { it == 's' }
            this.indexOfLast { it == 'g' }
            this.iterator().run {
            }
            this.ifBlank { "Blank!!" } // return "Blank!!" if the string is blank.
            this.isBlank() // check if the string has any value, Note: space=true.
            this.isNotBlank()
            this.isNullOrBlank() // accept the nullable value.
            this.ifEmpty { "Empty!!" } // return "Empty!!" if the string is empty.
            this.isEmpty() // check if the string has any value, Note: space=false.
            this.isNotEmpty()
            this.isNullOrEmpty() // accept the nullable value.
            this.lastIndex // last index number.
            this.last() // last index value.
            this.lastOrNull() // last index value, if the string is empty return null.
            this.lastIndexOf('t') //  last index number of 't' char.
            this.lastIndexOfAny(arrayListOf("string")) // last index number of "string" word.
            this.lines() // making each line in the text as index.
            this.lineSequence() // TODO: 27/05/2021
            this.map { '*' } // [*, *, *, *, *, *]
            this.mapTo(mutableListOf()) { '*' } // [*, *, *, *, *, *]
            this.mapNotNull { '*' } // [*, *, *, *, *, *], if {null}==[].
            this.mapNotNullTo(mutableListOf()) { '*' } // [*, *, *, *, *, *], if {null}==[].
            this.mapIndexed { index: Int, c: Char -> "$c-$index" } // [s-0, t-1, r-2, i-3, n-4, g-5].
            this.mapIndexedNotNull { index: Int, c: Char -> "$c-$index" } // [s-0, t-1, r-2, i-3, n-4, g-5], if {null}==[].
            this.mapIndexedNotNullTo(mutableListOf()) { index: Int, c: Char -> "$c-$index" } // [s-0, t-1, r-2, i-3, n-4, g-5], if {null}==[].
            this.maxByOrNull { it } // return max value.
            this.maxByOrNull { it.isLowerCase() }
            this.maxWithOrNull(Comparator { o1, o2 ->
                when {
                    o1 > o2 -> 1
                    o1 == o2 -> 0
                    else -> -1
                }
            })
            this.minOrNull() // return min value.
            this.minByOrNull { it.isUpperCase() }
            this.minWithOrNull(Comparator { t, t2 ->
                when {
                    t > t2 -> 1
                    t == t2 -> 1
                    else -> -1
                }
            })
            this.matches(Regex("")) // Returns `true` if this char sequence matches the given regular expression.
            this.none { c: Char -> c == 'z' } // return true if the char not existing in text.
            this.onEach { println(it) }
            this.random() // return random char from the string.
            this.randomOrNull() // return randomly Index?.
            this.repeat(2)
            this.subSequence(1..3) // -> tri
            this.scan("") { acc: String, c: Char -> "$acc*$c" } // [, *s, *s*t, *s*t*r, *s*t*r*i, *s*t*r*i*n, *s*t*r*i*n*g].
            this.scanIndexed("") { index, acc, c -> "$acc-$c-$index" }
            this.single { it == 't' } // Returns the single character if it was existing.
            this.singleOrNull()
            this.substring(0..3)
            this.split("str") // :[, ing] mean:Splits this char sequence to a list of strings around occurrences of the specified delimiters.
            this.splitToSequence("")
//            this.sumOf { 1 } // TODO: 27/05/2021
            this.toCollection(mutableListOf<Any>()).run {
                /**@see collections.lists*/
            } // [s, t, r, i, n, g].
            this.toHashSet() // [r, s, t, g, i, n], Note: The Hash not guaranty to get the string as Atlas.s.Sequence.
            this.toList().run {
                /**@see collections.lists*/
            } // [s, t, r, i, n, g].
            this.toMutableList() // [s, t, r, i, n, g].
            this.toSet() // [s, t, r, i, n, g], Returns a [Set] of all characters.
            this.toSortedSet() // [g, i, n, r, s, t], Returns a [SortedSet] of all characters.
            this.windowed(3) // [str, tri, rin, ing].
            this.windowedSequence(3).run {
                /**@see Atlas.s.Sequence*/
            }
            this.withIndex().run {
                /**@see Atlas.i.Iterable*/
            }
            this.zip("123456").run {
                /**@see collections.list*/
                this.unzip() // ([s, t, r, i, n, g], [1, 2, 3, 4, 5, 6]).
            } // [(s, 1), (t, 2), (r, 3), (i, 4), (n, 5), (g, 6)].
            this.zipWithNext { a: Char, b: Char -> a + "" + b } // [st, tr, ri, in, ng].
        }
    }
}