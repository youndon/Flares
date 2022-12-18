
data class Ship(val name: String, val ammunition: Int)

fun main() {
    readln().split(' ').map {
        Ship(it.split('-')[0], it.split('-')[1].toInt())
    }.let { ls ->
        print(ls.groupBy { it.name }.mapValues { it.value.sumOf { c -> c.ammunition } })
    }
}
