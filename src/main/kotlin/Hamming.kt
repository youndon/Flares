object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        return if (leftStrand.length == rightStrand.length)
            leftStrand.zip(rightStrand).count { it.first != it.second }
        else throw IllegalArgumentException("left and right strands must be of equal length")
    }
}
