object Pangram {

    fun isPangram(input: String): Boolean {
        return if (input.isNotEmpty()) input
            .lowercase()
            .filter { it.isLetter() }
            .toSortedSet()
            .size == 26
        else false
    }
}
