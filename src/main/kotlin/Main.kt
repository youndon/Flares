import androidx.compose.desktop.Window
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.window.Notifier
import javax.management.Notification

fun main() {
    Window {
        Button(onClick = { println("this compose!!")}){
            Text("notify")
        }
    }
}