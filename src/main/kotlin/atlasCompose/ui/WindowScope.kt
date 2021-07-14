package atlasCompose.ui

import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.WindowScope

private interface WindowScope {
    val WindowScope.ss: Any
        get() = this.apply {
            this.window
            this.MenuBar { }
        }
}