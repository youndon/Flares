package AtlasJ

import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset

class JInstant {
    lateinit var instant: Instant
    init {
        Instant.EPOCH
        Instant.MAX
        Instant.MIN
        Instant.from(null)
        Instant.now()
        Instant.ofEpochMilli(0L)
        Instant.ofEpochSecond(0L)
        Instant.parse("")

        instant.run {
            this.epochSecond
            this.nano
            this.atOffset(ZoneOffset.UTC)
            this.atZone(ZoneId.systemDefault())
            this.isAfter(this)
            this.isBefore(this)
            this.minusNanos(0L)
            this.plusNanos(0L)
            this.minusMillis(0L)
            this.plusMillis(0L)
            this.minusSeconds(0L)
            this.plusSeconds(0L)
            this.toEpochMilli()
            this.truncatedTo(null)
        }
    }
}