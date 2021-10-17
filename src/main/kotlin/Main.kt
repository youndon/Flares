import kotlinx.coroutines.processNextEventInCurrentThread
import java.util.function.UnaryOperator

fun main() {

}

fun solution(products: List<String>, product: String) {
    products.withIndex().forEach {
       if (it.value == product) { println(it.index) }
    }
}

fun solution(strings: MutableList<String>, str: String): MutableList<String> {
   strings.forEach { if (it == str) {
       strings[strings.indexOf(it)] = "+++" }
   }
    return strings
}