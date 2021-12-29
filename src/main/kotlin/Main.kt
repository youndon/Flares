fun main() {

}

fun com(): Int {
    val n = readLine()!!.toInt()
    val company = mutableListOf<Int>()
    val tax = mutableListOf<Int>()
    repeat(n) {
        company += readLine()!!.toInt()
    }
    repeat(n){
        tax += readLine()!!.toInt()
    }
    val highest = mutableListOf<Double>()
    company.zip(tax).forEach {
        highest += (it.first * it.second) / 100.0
    }
    println(highest)
      return  highest.indexOf(highest.maxOrNull()) + 1
}
