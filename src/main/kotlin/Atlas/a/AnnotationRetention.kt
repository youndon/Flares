package Atlas.a

import kotlin.annotation.AnnotationRetention

private enum class AnnotationRetention { ;
    init {
        AnnotationRetention.BINARY
        AnnotationRetention.RUNTIME
        AnnotationRetention.SOURCE
    }
}