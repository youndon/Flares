package mockk

import io.mockk.CoroutineCall

interface CoroutineCall {
      val <K> CoroutineCall<K>.kk : K?
//      get() = this.callWithContinuation() // TODO: 29/12/2021

 }