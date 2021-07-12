package n

import kotlin.Number

private class Number {
    /** The number class accept any type of numbers (integer,decimal,hex,octal...)
     and you can convert it to any another type of number. */
     val num: Number = 10
    init {
        num.run {
            this.toByte() //      ⎫
            this.toChar() //      ⎪
            this.toDouble() //    ⎪
            this.toFloat() //     ⎬- convert to the types.
            this.toInt() //       ⎪
            this.toLong() //      ⎪
            this.toShort() //     ⎭
        }
    }
}