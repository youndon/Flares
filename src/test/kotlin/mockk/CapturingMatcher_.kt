package mockk

import io.mockk.CapturingMatcher

private interface CapturingMatcher_<K> {
    object kk : CapturingMatcher {
        override fun capture(arg: Any?) {

        }
    }
}