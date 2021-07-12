package a
import kotlin.annotation.AnnotationRetention
enum class AnnotationRetention {   ;
    init {
        AnnotationRetention.BINARY
        AnnotationRetention.RUNTIME
        AnnotationRetention.SOURCE
    }
}