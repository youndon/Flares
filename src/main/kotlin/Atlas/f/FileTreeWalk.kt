package Atlas.f

import java.io.File
import kotlin.io.FileTreeWalk

class FileTreeWalk {
    lateinit var fileTreeWalk: FileTreeWalk
    fun main() {
        fileTreeWalk.run {
            this.maxDepth(0)
            this.onEnter {file: File -> true }
            this.onFail { file, ioException -> }
            this.onLeave { }
        }
    }
}