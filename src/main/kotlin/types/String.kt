@file:Suppress("IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION", "DEPRECATED_IDENTITY_EQUALS")

package types

import jetbrains.datalore.base.json.escape
import java.util.*

/**
 Using the String type for creating text and control it.
 String is kotlin Class has overriding 4 function and 1 variable,
 but all others attachment in String class came from Comparable,
 and CharSequence interfaces and the extensions functions and the some from java.String
*/
// Note: Some Attachment has void run block,
// you can find those in the path of package.

 val str = String.CASE_INSENSITIVE_ORDER // TODO A Comparator that orders strings ignoring character case.

private fun some(){
    //
    """..."""
val string = "\n-> next line," +
             "\r-> hide all the chars before it" +
             "\b ..." +
             "\t-> tap space, " +
             "\$-> print $ itself, " +
             "\'-> print apostrophe itself, " +
             "\\-> print back_slash itself, " +
             "\"-> print quotation_marks itself  " +
             "\u1FC8-> unicode."

    // StringBuilder. typealias StringBuilder = java.lang.StringBuilder
    with(StringBuilder("string")){
        append("...")
        appendLine("...")
        appendRange("...",0,3)
        clear()
        deleteAt(0)
        deleteRange(0,3)
        insertRange(0,"...",0,3)
        set(0,'a')
        setRange(0,3,"...")
        toCharArray(charArrayOf())
        appendCodePoint(0) // Return the Unicode of this number.
        capacity() // TODO("why +16")
        ensureCapacity(0) // TODO: 31/05/2021
    }

   // String Attachment:
    with(string) {
        byteInputStream().run {
        } // -> .JStream.kt
        chars().run {
            /**@see AtlasJ.JStream.intStream*/
        } // -> .JStream.kt
        compareTo("string") // Compare by size indexes.
        codePoints().run {
            /**@see AtlasJ.JStream.intStream*/
        }
        codePointAt(1) // Return the decimal of the index.
        codePointBefore(1) // Return the decimal of the index before that index.
        codePointCount(1, 2) // Return a count between start_index and end_index.
        contentEquals("") // Check if the value is a same.
        coerceIn("st","string") // Return the max.Value if the text get it, else min.Value.
        coerceAtMost("string")
        coerceAtLeast("st")
        drop(0) // Remove n indexes from start.
        dropLast(0) // Remove from the end.
        dropWhile { it == 's' } // Remove all 's' char from the start.
        dropLastWhile { it == 'g' } // Remove all 's' char from the end.
        lowercase() // Make All the String as lowercase.
        endsWith("ing") // Check if the text end with some char or char_sequence.
        encodeToByteArray().run{
            /**@see types.byteArr*/
        }
        filter { it == 's' } // for get only "it" from the string.
        filterNot { it == 's' } // for get all the text except "it".
        filterIndexed { index: Int, c: Char -> c == c + index }
        filterIndexedTo(StringBuilder("")) { index, c -> c == c + index }
        format() /**@see AtlasJ.JFormat*/
        this[0] // Get the value of the index 0.
        hashCode() // TODO: 03/06/2021
        intern() /** @see AtlasBox.Interning_Of_String*/
        this::class.run{
            /**@see Atlas.k.KClass*/
        }
        javaClass.run {
            /**@see AtlasJ.JClass*/
        }
        length // Index size.
        orEmpty() // Returns the string if it is not null, or the empty string otherwise.
        offsetByCodePoints(0, 3) // TODO: Returns the index within this String that is offset from the given index by codePointOffset code points. Unpaired surrogates within the text range given by index and codePointOffset count as one code point each.
        plus("value") // Add "value" from the end.
        padEnd(1, '*') // *string.
        padStart(1, '*') // string*
        partition { true } // Splits the original string into pair of strings, {true}==(string, ), {false}== ( ,string).
        prependIndent() //  Prepends indent to every line of the original string.
        uppercase() // Making All the String as capital.
        reader().run {
        }
        regionMatches(0, "string", 0, 6) // Returns true if the specified range in this string is equal to the specified range in another string.
        replace('s', '*', false) // *tring
        replaceAfter('r', "*", this) // str*
        replaceAfterLast('r', "*", this) // str*
        replaceBefore('r', "*", this) // *ing
        replaceBeforeLast('r', "*", this) // *ing
        replaceRange(0, 3, "*") // *ing
        replaceFirst('t', '*', false) // s*ring
        replaceFirstChar { uppercase() } // String, or lowercase() -> string.
        replaceIndent("") // Return newIndent in front the text with the text have indent or not.
        replaceIndentByMargin("","") // If the indent of the text equal the marginPrefix then will replace it with newIndent.
        removeSuffix("ing") // -> str.
        removePrefix("str") // -> ing.
        removeSurrounding("st", "ng") // -> ri.
        removeRange(0..3) // -> ng.
        rangeTo("other") // string..other.
        runCatching { /**@see Blocks*/ }
        reversed() // -> return all the text as reversed.
        slice(0..2) // -> str
        startsWith("") // Returns true if this string starts with the specified prefix.
        substring(3) // -> ing
        substringBefore('i') // -> str
        substringBeforeLast('i')
        substringAfter('r') // -> ing
        substringAfterLast('r')
        toBoolean() // Returns true if the orchid.contents of this string is equal to the word "true", ignoring case, and false otherwise.
        toByteArray().run {
            /**@see types.byteArr*/
        }
        toCharArray().run {
            /**@see types.charArray*/
        }
        toBooleanStrict() // TODO: 18/07/2021
        toBooleanStrictOrNull() // TODO: 18/07/2021
        toBigDecimal() // Parses the string as a java.math.BigDecimal number and returns the result.
        toBigDecimalOrNull() //  or null if the string is not a valid.
        toBigInteger() //         ⎫
        toBigIntegerOrNull() //   ⎪
        toByte() //               ⎪
        toUByte() //              ⎪
        toByteOrNull() //         ⎪
        toUByteOrNull() //        ⎪
        toDouble() //             ⎪
        toDoubleOrNull() //       ⎪
        toInt() //                ⎬- Parses the string as a Type number and returns the result.
        toIntOrNull() //          ⎪
        toFloat() //              ⎪
        toFloatOrNull() //        ⎪
        toLong() //               ⎪
        toLongOrNull() //         ⎪
        toULong() //              ⎪
        toULongOrNull() //        ⎪
        toShort() //              ⎪
        toShortOrNull() //        ⎪
        toUShort() //             ⎪
        toUShortOrNull() //       ⎭
        lowercase()
        toPattern().run {
            /**@see AtlasJ.JPattern*/
        }
        toRegex().run {
            /** @see RegularExpression.kt */
        }
        take(3) // Take numbers of the values, (n:3) -> str.
        takeLast(0) // Take from the last.
        takeIf { it == "string" } // Returns this value if it satisfies the given predicate or null, if it doesn't.
        takeUnless { it == "string" } // Returns this value if it _does not_ satisfy the given predicate or null, if it does.
        takeWhile { it == 's' } // Returns a string containing the first characters that satisfy the given predicate.
        takeLastWhile { it == 'g' } // Returns a string containing last characters that satisfy the given predicate.
        trim() // Returns a string having leading and trailing whitespace removed.
        trimStart() // Returns a string having leading whitespace removed from the start.
        trimEnd() // Returns a string having leading whitespace removed from the End.
        trimMargin("str") // ing.
        trimIndent() //
        }
}
