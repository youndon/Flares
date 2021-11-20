import org.jetbrains.annotations.TestOnly
import kotlin.test.Test
import kotlin.test.*
import kotlin.test.junit.*

private class Test {
    init {
        @Test
        @Ignore
        @BeforeTest
        @AfterTest
        fun kTest() {
        }
        asserter
        assertContains(arrayOf(),0,"")
//        assertContentEquals()
//        assertEquals()
//        assertNotEquals()
//        assertFails()
//        assertFailsWith()
//        assertFalse()
//        assertIs<>()
//        assertIsNot<>()
//        assertNotNull()
//        assertNotSame()
//        assertNull()
//        assertSame()
//        assertTrue()
        currentStackTrace()
//        expect()
        fail()
        todo {  }
        JUnitContributor().contribute()
    }
}