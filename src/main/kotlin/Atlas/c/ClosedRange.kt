@file:Suppress("UNREACHABLE_CODE")

package c

import kotlin.ranges.ClosedRange

interface ClosedRange {
     var closedRange: ClosedRange<Int>

    fun main(){
        closedRange.run {
            this.endInclusive
            this.start
            this.contains(1)
            this.isEmpty()
        }
    }

}