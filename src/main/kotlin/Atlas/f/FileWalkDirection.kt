package Atlas.f

import kotlin.io.FileWalkDirection

class FileWalkDirection {
    lateinit var fileWalkDirection: FileWalkDirection
    init {
        fileWalkDirection
        FileWalkDirection.BOTTOM_UP
        FileWalkDirection.TOP_DOWN
        FileWalkDirection.values()
    }
}