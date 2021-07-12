package d

import kotlin.DeprecationLevel
class DeprecationLevel {
    lateinit var deprecationLevel: DeprecationLevel
    init {
        deprecationLevel
        DeprecationLevel.ERROR
        DeprecationLevel.HIDDEN
        DeprecationLevel.WARNING
        DeprecationLevel.values()

    }
}