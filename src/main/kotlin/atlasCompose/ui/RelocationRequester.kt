package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.layout.RelocationRequester

@OptIn(ExperimentalComposeUiApi::class)
private class RelocationRequester {
    init {
        RelocationRequester().bringIntoView()
    }
}