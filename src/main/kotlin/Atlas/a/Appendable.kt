package Atlas.a

import kotlin.text.Appendable

private class kAppendable {

    init {
        val appendable: Appendable = StringBuilder("App")
        appendable.run {
            this.append("") // Add some string or chars from the end.
            this.appendLine("") // Add in next line.
        }
    }
}