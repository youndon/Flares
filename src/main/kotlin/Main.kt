import AtlasLib.ConsoleColor
import androidx.compose.animation.Animatable
import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp

fun main() {
        println(Main.FILENAME)
}
class Main  {
        companion object {
                const val FILE_EXTENSION = ".png"
                val FILENAME:String
              get()  = "Img_" + System.currentTimeMillis() + FILE_EXTENSION
        }
}
@Composable
@Preview
fun land() {
        MaterialTheme{
                Column {
                        Button({}) {
                                Text("land rover!!")
                        }
                        Spacer(Modifier.size(Dp(20f)))
                        Card (){
                                Text("fnqpfipqzofmj")
                        }
                        TextButton(onClick = { println("46654564")}){
                                Text("this text button!!")
                        }
                        TextField("",{},visualTransformation = PasswordVisualTransformation())

                }
        }
}