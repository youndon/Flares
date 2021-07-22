import AtlasLib.blueItalic
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.Dp
import jetbrains.datalore.plot.config.asMutable

fun main() {
        val arr = arrayOf(1,2,3)
        val lis = listOf(1,2,3)
        val arrlis = arrayListOf(1,2,3)
        val mutlis = mutableListOf(1,2,3)

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
