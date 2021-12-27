import java.io.File

fun main() {
"""
AnnotationHelper
AnnotationRegistry
FieldMapping
MethodDescriptor
MethodFilter
TransformedHeader
    """.trimIndent().lines().forEach {
        File("$it.kt").run {
//            mkdir()
            writeText("class $it { \n }")
        }
    }
}
