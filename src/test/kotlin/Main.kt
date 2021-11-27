import kotlin.test.AsserterContributor
import kotlin.test.*
import kotlin.test.junit.JUnitContributor

private class Main {

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