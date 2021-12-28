import java.io.File

fun main() {
"""
AnswerAnsweringOpportunity
CommonClearer
ConstructorStub
MockKStub
MockType
SpyKStub
Stub
StubGatewayAccess
StubRepository
    """.trimIndent().lines().forEach {
        File("$it.kt").run {
//            mkdir()
            writeText("class $it { \n}")
        }
    }
}
