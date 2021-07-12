@file:Suppress("UNREACHABLE_CODE")

package l

import kotlin.Lazy

interface Lazy {
     var lazy:Lazy<Int>
    fun main(){
        lazy.run {
            this.value
            this.isInitialized()
//            this.getValue(1,KProperty<*>) // TODO
        }
    }
}