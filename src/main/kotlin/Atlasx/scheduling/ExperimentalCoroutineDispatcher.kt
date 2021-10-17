package coroutines.scheduling

import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher

@InternalCoroutinesApi
class ExperimentalCoroutineDispatcher {
    @InternalCoroutinesApi
    lateinit var experimentalCoroutineDispatcher:ExperimentalCoroutineDispatcher

    init {
        experimentalCoroutineDispatcher.run {
            this.blocking()
            this.limited(0)
        }
    }

}