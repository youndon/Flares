package AtlasTime

import kotlinx.datetime.*
import kotlinx.datetime.Instant

class Instant {
    init {
        Instant.apply {
            this.DISTANT_FUTURE
            this.DISTANT_PAST
            this.fromEpochMilliseconds(1)
            this.fromEpochSeconds(1,1)
            this.parse("").apply {
                this.epochSeconds
                this.nanosecondsOfSecond
//                this.minus()
//                this.plus()
                this.toEpochMilliseconds()
                this.isDistantFuture
                this.isDistantPast
//                this.daysUntil()
//                this.monthsUntil()
//                this.offsetIn()
//                this.periodUntil()
                this.toJavaInstant()
//                this.toLocalDateTime()
//                this.until()
//                this.yearsUntil()
            }
        }
    }
}