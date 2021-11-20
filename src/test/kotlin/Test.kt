import kotlin.test.*
import kotlin.test.junit.JUnitContributor

private class Test {
    init {
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