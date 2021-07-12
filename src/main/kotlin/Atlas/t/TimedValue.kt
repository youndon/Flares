package t

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.TimedValue

private class TimedValue {
    @ExperimentalTime
    fun main() {
     var timedValue = TimedValue(10, Duration.INFINITE)

    }
}