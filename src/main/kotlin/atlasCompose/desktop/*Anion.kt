package atlasCompose.desktop

import androidx.compose.desktop.*
import androidx.compose.runtime.Composable

@Composable
private fun void() {

    LocalAppWindow
    NoOpUpdate
    Window {  }
    DesktopMaterialTheme {  }
    DesktopTheme {  }
//    SwingPanel() // FIXME: 15/07/2021
}