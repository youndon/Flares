
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
        assertFails {}
//        assertFailsWith("") {} // TODO: 28/12/2021 "reified"
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
        todo {}
        fail("")
    }

}