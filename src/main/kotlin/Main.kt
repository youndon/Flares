import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

fun main() {
    /* Check the numbers.
    val a = List(readLine()!!.toInt()){ readLine()!!.toInt()}
    val b = readLine()!!.filterNot { it == ' ' }
        if (a.contains(b[0].digitToInt()) && a.contains(b[1].digitToInt()) &&
            (b[0]+1 == b[1] || b[0]-1 == b[1]) ) print("NO") else print("YES")
     */

    /* Cyclically shifting
       val ss = List(readLine()!!.toInt()){ readLine()!!.toInt()}.run {
           this.partition { it == this.last() }
       }
    print("${ss.first.joinToString(" ")} ${ss.second.joinToString(" ")}")

    Individual taxes.

    val n = readLine()!!.toInt()
     arrayListOf<Int>().run {
        repeat(n){ repeat(2){ this.add(readLine()!!.toInt()) } }
        this.run { println(this.chunked(1).last().run {
                    this.sorted().indexOfLast { index -> index ==  maxOf { it } } + 1 } ) }
    }


    // Right Rotation.
      List(readLine()!!.toInt()){ readLine()!!.toInt()}.run {
          val n = readLine()!!.toInt()
           println("${this.takeLast(n).joinToString(" ")} ${this.dropLast(n).joinToString(" ")}")
       }

     Triples.
    List(readLine()!!.toInt()) { readLine()!!.toInt() }.run {
        var n = 0 ; this.chunked(3).forEach {
             if(it[0] < it[1] && (it[1] < it[2])) n+=1 else n=n }
        println(n) }
     */
}
