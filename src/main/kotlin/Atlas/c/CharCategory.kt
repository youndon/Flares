@file:Suppress("CAST_NEVER_SUCCEEDS")

package Atlas.c

import kotlin.text.CharCategory

private class CharCategory {
    var cc = 'A'.category
    /**
     * Represents the character general category in the Unicode specification.
     */
     init {
        cc.run {
            code // Must be two characters denotes about category name.
            value // TODO: 16.01.2021  
            contains('a')
            CharCategory.FORMAT //                   ⎫
            CharCategory.COMBINING_SPACING_MARK //   ⎪
            CharCategory.CONNECTOR_PUNCTUATION //    ⎪
            CharCategory.CONTROL //                  ⎪
            CharCategory.CURRENCY_SYMBOL //          ⎪
            CharCategory.DASH_PUNCTUATION //         ⎪
            CharCategory.START_PUNCTUATION //        ⎪
            CharCategory.END_PUNCTUATION //          ⎪
            CharCategory.ENCLOSING_MARK //           ⎪
            CharCategory.DECIMAL_DIGIT_NUMBER //     ⎪
            CharCategory.FINAL_QUOTE_PUNCTUATION //  ⎬- See charCategory package.
            CharCategory.LETTER_NUMBER //            ⎪
            CharCategory.UPPERCASE_LETTER //         ⎪
            CharCategory.MATH_SYMBOL //              ⎪
            CharCategory.MODIFIER_SYMBOL //          ⎪
            CharCategory.MODIFIER_LETTER //          ⎪
            CharCategory.NON_SPACING_MARK //         ⎪
            CharCategory.OTHER_NUMBER //             ⎪
            CharCategory.OTHER_PUNCTUATION //        ⎪
            CharCategory.OTHER_SYMBOL //             ⎪
            CharCategory.PRIVATE_USE //              ⎪
            CharCategory.TITLECASE_LETTER //         ⎪
            CharCategory.OTHER_LETTER //             ⎪
            CharCategory.LOWERCASE_LETTER //         ⎪
            CharCategory.INITIAL_QUOTE_PUNCTUATION //⎪
            CharCategory.UNASSIGNED //               ⎭
            CharCategory.SPACE_SEPARATOR // Whitespace.
            CharCategory.LINE_SEPARATOR // Whitespace.
            CharCategory.PARAGRAPH_SEPARATOR // Whitespace.
            CharCategory.SURROGATE // it.isSurrogate().
        }
    }
}