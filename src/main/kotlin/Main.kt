import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

fun main() {
        Window(title = "window") {
                Button({}) {
                        Text("land rover!!")
                }
        }
}

@Composable
@Preview
fun land() {
        Text("land rover!!")
}