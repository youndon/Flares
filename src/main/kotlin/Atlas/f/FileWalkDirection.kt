package Atlas.f

private class FileWalkDirection {
    /**An enumeration to describe possible walk directions.*/
    lateinit var fileWalkDirection: FileWalkDirection
    init {
        FileWalkDirection.BOTTOM_UP
        FileWalkDirection.TOP_DOWN
        FileWalkDirection.values()
    }
}