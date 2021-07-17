import kotlinx.coroutines.*
import java.lang.Thread.*
import kotlin.concurrent.thread

/** The MultiThreading using for Implement many methods concurrently (in the same time). */
fun multiThreading() {

    // Thread Running.
     thread {
        for (ss in 'a'..'z') {
            sleep(500)
            println(ss)
        }
    }.start()
    thread {
        for (ss in 0..26) {
            sleep(500)
            println(ss)
        }
    }.start()


//     CoroutineScope.
    runBlocking {
        launch {  for (ss in 'a'.rangeTo('z')) {
            delay(500)
            println(ss)
        } }
        launch {  for (ss in 0.rangeTo(26)) {
            delay(500)
            println(ss)
        } }
    }
}