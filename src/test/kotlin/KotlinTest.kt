
import org.junit.jupiter.api.Test
import kotlin.test.*

class KotlinTest {
    @Ignore
    @BeforeTest
    @AfterTest
    @Test
    fun kTest() {
        asserter
        assertContains(array = arrayOf(), 0, "")
        assertContentEquals(expected = arrayOf(""), actual = arrayOf(""), "")
        assertEquals("", "", "")
        assertNotEquals("", "", "")
//        assertFails()
//        assertFailsWith()
        assertFalse("") { false }
        assertIs<String>("", "")
        assertIsNot<String>("", "")
        assertNotNull("", "") { it }
        assertNotSame("", "", "")
        assertNull("", "")
        assertSame("", "", "")
        assertTrue("") { true }
        currentStackTrace()
        expect("", "") { "..." }
//        fail()
        todo {}

    }

    fun mockk() {
        io.mockk.*
        io.mockk.junit5.MockKExtension
        io.mockk.proxy.common.*
        io.mockk.proxy.common.transformation.*
        io.mockk.proxy.jvm.*
        io.mockk.proxy.jvm.advice.jvm.*
        io.mockk.proxy.jvm.dispatcher
        io.mockk.proxy.jvm.transformation
        io.mockk.impl.log.*
        io.mockk.impl.annotations.*
        io.mockk.impl.platform.*
        io.mockk.impl.verify.*
        io.mockk.impl.eval.*
        io.mockk.impl.instantiation.*
        io.mockk.impl.recording.*
        io.mockk.impl.recording.states.*
        io.mockk.impl.stub.*

    }
}