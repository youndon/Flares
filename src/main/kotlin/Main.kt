fun main() {


    val list = mutableListOf<Long>()
    while (true) {
        val put = readLine() ?: break
        list.add(put.toLong())
    }
    val max = list.maxOf { it }
    val occ = list.count { it == max }
    println("$max $occ")

}