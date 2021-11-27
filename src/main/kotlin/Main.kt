import java.nio.file.Watchable
import javax.lang.model.element.AnnotationValueVisitor

fun main() {
    noble(5645)

}
fun noble(t: Int) = println("$t Noble!")
open class MainClass<T>(){
   open fun range() {

    }
}
class SecondClass<T>
interface MainInterface<T>
interface SecondInterface<T>

fun <T>swung()
    where T: MainClass<T>,T : SecondInterface<T>, T: MainInterface<T> {}
fun MainClass<Any>.land() {
    this.range()
}

// change the code below
class SmartKitchen<T:Logger,R:Cooker> {
    fun <T>finishCooking(l: T) where T:Logger,T:Cooker
    {

    }
}
// don't change it!
interface Logger {
    fun log()
}
interface Cooker {
    fun cook()
}
class Microwave: Logger, Cooker {
    override fun log() = println("Microwave finished cooking!")
    override fun cook() = println("Microwave is cooking")
}
class MultiCooker: Logger, Cooker {
    override fun log() = println("Multicooker finished cooking!")
    override fun cook() = println("Multicooker is cooking")
}
