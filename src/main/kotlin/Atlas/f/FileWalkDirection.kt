package Atlas.f

import kotlin.io.FileWalkDirection

private class FileWalkDirection {
    /**An enumeration to describe possible walk directions.*/
    lateinit var fileWalkDirection: FileWalkDirection
    init {
        FileWalkDirection.BOTTOM_UP
        FileWalkDirection.TOP_DOWN
        FileWalkDirection.values()
    }
}