package atlasCompose.ui

import androidx.compose.ui.platform.DesktopPlatform

private enum class DesktopPlatform {
    Linux,
    Windows,
    MacOS;
    init {
        DesktopPlatform.Current
    }
}