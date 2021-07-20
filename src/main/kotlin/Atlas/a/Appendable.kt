package Atlas.a

import java.lang.StringBuilder
import kotlin.text.Appendable

private class Appendable {
    init {
        val appendable:Appendable = StringBuilder("App")
        appendable.run {
            this.append("") // Add some string or chars from the end.
            this.appendLine("") // Add in next line.
        }
    }
}