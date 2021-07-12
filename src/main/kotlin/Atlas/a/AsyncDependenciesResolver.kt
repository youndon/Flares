@file:Suppress("UNREACHABLE_CODE")

package a

import kotlinx.coroutines.runBlocking

class AsyncDependenciesResolver{
lateinit var adr: AsyncDependenciesResolver

init {
    runBlocking {
//        adr.resolveAsync(environment = mapOf(),
//                scriptContents = ScriptContents)
//            .run {
//            this.dependencies
//            this.reports
        }
    }
}
