import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond () {
    val date:LocalDateTime
        get() {
           return LocalDateTime.now()
        }

    constructor(other: LocalDate) : this() {
        val date =  LocalDate.of(other.year, other.month, other.dayOfMonth)
            .plusDays(11574)
    }
    constructor(otherTime: LocalDateTime) : this() {
        val date =  LocalDateTime.of(otherTime.year, otherTime.month,
            otherTime.dayOfMonth,otherTime.hour,otherTime.minute,otherTime.second)
            .plusSeconds(1000000000)
    }
}
