package AtlasTime

import kotlinx.datetime.DateTimePeriod

class DateTimePeriod {
    val ss  =DateTimePeriod
    init {
        ss.parse("").apply {
            this.nanoseconds
            this.seconds
            this.minutes
            this.hours
            this.days
            this.months
            this.years
        }
    }
}