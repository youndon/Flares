//
//import io.mockk.internalSubstitute
//import junit.extensions.*
//import junit.framework.*
//import junit.framework.*
//import junit.runner.*
//import junit.textui.ResultPrinter
//import junit.textui.TestRunner
//import org.jetbrains.annotations.Contract
//import kotlin.test.*
//import kotlin.test.Test
//import kotlin.test.junit.JUnitContributor
//
//class KotlinTest {
//        @Ignore
//        @BeforeTest
//        @AfterTest
//        @Test
//        fun kTest() {
//                asserter
//                assertContains(array = arrayOf(), 0, "")
//                assertContentEquals(expected = arrayOf(""), actual = arrayOf(""), "")
//                assertEquals("", "", "")
//                assertNotEquals("", "", "")
////        assertFails()
////        assertFailsWith()
//                assertFalse("") { false }
//                assertIs<String>("", "")
//                assertIsNot<String>("", "")
//                assertNotNull("", "") { it }
//                assertNotSame("", "", "")
//                assertNull("", "")
//                assertSame("", "", "")
//                assertTrue("") { true }
//                currentStackTrace()
//                expect("", "") { "..." }
////        fail()
//                todo {}
//                JUnitContributor().contribute()
//
//
////                junit.textui.*
//                TestRunner()
//                        .run {
//                                doRun()
//                                setPrinter()
//                                start()
//                        }
//                ResultPrinter()
//                        .run {
//                                writer
//                                printDefect()
//                        }
//
////                junit.framework.*
//                object : Test {
//                        override fun countTestCases(): Int {
//                                return 0
//                        }
//
//                        override fun run(result: TestResult?) {
//                        }
//
//                }
//                Protectable { }
//                object : TestCase() {}
//                TestSuite().run {
//                        name
//                        addTest()
//                        runTest()
//                        addTestSuite()
//                        testAt()
//                        testCount()
//                        tests()
//                }
//                AssertionFailedError("")
//                ComparisonCompactor(1, "", "").run {
//                        compact("")
//                }
//                ComparisonFailure("", "", "").run {
//                        actual
//                        expected
//                }
//                JUnit4TestAdapter(null).run {
//                        tests
//                        testClass
//                }
//                JUnit4TestAdapterCache().run {
//                        asTest()
//                        asTestList()
//                        getNotifier()
//                }
////                JUnit4TestCaseFacade() // TODO: 26/12/2021 "privet"
//                TestFailure(null, null).run {
//                        failedTest()
//                        isFailure
//                        trace()
//                        exceptionMessage()
//                        thrownException()
//                }
//                TestResult().run {
//                        endTest()
//                        errors()
//                        startTest()
//                        addFailure()
//                        addError()
//                        addListener()
//                        errorCount()
//                        failureCount()
//                        failures()
//                        removeListener()
//                        runCount()
//                        runProtected()
//                        shouldStop()
//                        stop()
//                        wasSuccessful()
//                }
//
////                junit.runner.*
//                object : BaseTestRunner() {
//                        override fun testStarted(testName: String?) {
//
//                        }
//
//                        override fun testEnded(testName: String?) {
//                        }
//
//                        override fun testFailed(status: Int, test: Test?, e: Throwable?) {
//                        }
//
//                        override fun runFailed(message: String?) {
//
//                        }
//
//                }
//                TestRunListener.STATUS_ERROR
//                TestRunListener.STATUS_FAILURE
//                object : TestRunListener {
//                        override fun testRunStarted(testSuiteName: String?, testCount: Int) {
//                        }
//
//                        override fun testRunEnded(elapsedTime: Long) {
//                        }
//
//                        override fun testRunStopped(elapsedTime: Long) {
//                        }
//
//                        override fun testStarted(testName: String?) {
//                        }
//
//                        override fun testEnded(testName: String?) {
//                        }
//
//                        override fun testFailed(status: Int, testName: String?, trace: String?) {
//                        }
//
//                }
//                Version.id()
//                Version.main(arrayOf())
//
////                junit.extensions.*
//                ActiveTestSuite().run {
//                        runFinished()
//                }
//                RepeatedTest(null, 1)
//                TestSetup(null)
//                TestDecorator(null).run {
//                        basicRun(null)
//                }
//
//        }
//
//}
//
