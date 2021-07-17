import org.jetbrains.annotations.Nullable
import java.util.Comparator

private fun some(){
    val ss :Int? = readLine()?.toIntOrNull()

    // ! isn't
    ss!=null

    // ?. ...
    if (ss!=null) println("not null") // or do something.
    // or
    ss ?.let { println("not null") }

    // ?:
    if (ss==null) println("null!!") // or do something.
    // or
    ss ?: println("null!!")

    //  ?. with ?:
     ss ?.let { println("not null") } ?: println("null!!")

}
