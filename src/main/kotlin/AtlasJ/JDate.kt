package AtlasJ

import java.time.Instant
import java.util.*

class JDate {
    lateinit var date: Date

    init {
        Date.from(Instant.EPOCH)

        date.run {
            this.time
            this.after(this)
            this.before(this)
            this.toInstant().run {
            }
        }
    }
}