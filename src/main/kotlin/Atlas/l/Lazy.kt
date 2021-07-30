package Atlas.l

import kotlin.Lazy

private interface Lazy {
   companion object{
       private val <E> Lazy<E>.laz get() = this.apply {
            this.value
            this.isInitialized()
//            this.getValue(1,KProperty<*>) // TODO
        }
    }
}