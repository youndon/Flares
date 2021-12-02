import kotlin.random.Random

fun main() {


}

/* println("12345".let {
        val mid = it.length / 2
        if (it.length % 2 == 0) {
            it.take(mid).dropLast(1) + it.takeLast(mid).drop(1)
        } else {
            it.take(mid) + it.takeLast(mid)
        }
    })*/

/*Array(4) { readLine()!!.toInt() }.let {
        runCatching {
            require(it.contentEquals(it.sortedArray()))
        }.onSuccess { print("YES") }
            .onFailure { print("NO") }
    }*/

    fun generatePredictablePassword(seed: Int): String {
        val randomPassword = ""
        repeat(10) {
            randomPassword + Random(seed).nextInt(33, 126).toChar()
        }
        return randomPassword
    }

    fun List<Int>.findPairsWithGivenDifference(k: Int): MutableList<Pair<Int, Int>> {
        val l = mutableListOf<Pair<Int, Int>>()
        this.sortedBy { it == it }.zipWithNext { a, b ->
            if (a + k == b) l.add(Pair(a, b))
        }
        return l
    }

//fun <F> genericF(f:F): F where F:CharSequence = f