package mockk

import io.mockk.InternalCounter

interface InternalCounter_ {
     object kk: InternalCounter {
         override val value: Long
             get() = 0

         override fun increment(): Long {
             return 0
         }
     }

}