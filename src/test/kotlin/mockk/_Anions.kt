package mockk

import io.mockk.*

private fun anions() {
//    clearMocks()
    clearAllMocks()
    clearConstructorMockk()
    clearStaticMockk()
    coEvery {  }
    coVerify {  }
    coJustRun {  }
    coExcludeRecords {  }
    coVerifyAll {}
    coVerifyOrder {  }
    coVerifySequence {  }
    confirmVerified()
    every {  }
    excludeRecords {  }
//    mockk<>()
//    mockkClass()
    mockkObject()
//    mockkStatic()
    mockkConstructor()
//    isMockKMock()
    registerInstanceFactory {  }
//    slot<>()
//    spyk<>()
    stackTracesAlignmentValueOf("")
    unmockkAll()
    unmockkConstructor()
    unmockkObject()
    unmockkStatic("")
    withInstanceFactory ({},{})
}