package d

import kotlin.time.*
import kotlin.time.Duration
import kotlin.time.DurationUnit

class Duration {

    @ExperimentalTime
    fun main() {
        val duration = Duration

        duration.INFINITE.run {
            this.absoluteValue // Returns the absolute value.
            this.inNanoseconds // How much Nano's in the duration
            this.inMicroseconds // How much Micro's in the duration
            this.inMilliseconds // How much Milli's in the duration
            this.inSeconds // How much Sec's in the duration
            this.inMinutes // How much Min's in the duration
            this.inHours // How much Hour's in the duration
            this.inDays // How much Days in the duration
            this.div(0) // (÷)
            this.times(0) // (×)
            this.minus(Duration.ZERO) // (-)
            this.plus(Duration.ZERO) // (+)
            this.isFinite()
            this.isInfinite()
            this.isPositive()
            this.isNegative()
            this.unaryMinus() // Returns the negative of this value.
            this.toIsoString() // Returns an ISO-8601 based string representation of this duration, PT(presented).
            this.toInt(DurationUnit.SECONDS) // Return converting integer number.
            this.toDouble(DurationUnit.SECONDS) // Return converting double number
            this.toString() // Return the converted value by the low ... until the seconds,(`d`,`h`,`m`,`s`,`ms`,`us`,or`ns`).
            this.toLongNanoseconds() // Convert to Nano's.
            this.toLongMilliseconds() // Convert to Mill's.
            this.toComponents { days, hours, minutes, seconds, nanoseconds -> this } // TODO
        }
        duration.ZERO.run {
        }
        /** Converts the given time duration [value] expressed in the specified [sourceUnit] into the specified [targetUnit]. */
        duration.convert(value = 1.0 ,sourceUnit = DurationUnit.DAYS,targetUnit = DurationUnit.HOURS)

    }
}
