package Atlasx.test

import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineContext
import java.util.concurrent.TimeUnit

@ObsoleteCoroutinesApi
@Deprecated("replaced!")
class TestCoroutineContext {
    @ObsoleteCoroutinesApi
    lateinit var testCoroutineContext: TestCoroutineContext

    init {
        testCoroutineContext.run {
            this.exceptions
            this.advanceTimeBy(1L,TimeUnit.MILLISECONDS)
            this.advanceTimeTo(1L,TimeUnit.MILLISECONDS)
            this.assertAllUnhandledExceptions("") { throwable -> true }
            this.assertAnyUnhandledException("") { throwable -> true }
            this.assertExceptions("") { list: List<Throwable> -> true }
            this.assertUnhandledException("") { throwable -> true }
            this.now()
            this.triggerActions()
        }
    }

}