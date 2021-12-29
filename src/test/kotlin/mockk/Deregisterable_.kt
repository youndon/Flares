package mockk

import io.mockk.Deregisterable

interface Deregisterable_ {
        val Deregisterable.kk : Any?
        get() {
            return this.deregister()
        }
 }