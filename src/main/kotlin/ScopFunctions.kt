import androidx.compose.desktop.Window
import androidx.compose.material.Text

/*
 ...
 */
/** [Delegation].
  Kotlin supports [delegation] design pattern by introducing a new keyword [by].
  Using this keyword or delegation methodology,
  Kotlin allows the derived class to access all the implemented public methods,
  of <<an interface through a specific object>>.
  */
/**@see appeana.d.Delegates*/
 // Example:
    interface Base{
      fun printk() // abstract method.
  }
    class BaseImp(private val ss:String):Base{
        override fun printk() {
            // create print format.
            println(ss) //implementation of the method.
        }
    }
    class Delegation(cc:Base):Base by cc // delegation the public method.

/** [Lazy].
Lazy is a lambda function which takes a property as an input and in return
gives an instance of Lazy<T> ,
where <T> is basically the type of the properties it is using.
 */
 val ww:String by lazy{
    "quasar.."
}
// or..
val mm:String by lazyOf("Anything..")


fun main() {
    //
    Delegation(BaseImp("lalaland...")).printk()

    //
    println(ww + "whatever..")

    /** [with] method. */
    val one = 10
    with(one){
        /* action something */
    }
    /** [apply] method. */
    val two = 'd'.apply {
        /* action something */
    }
    /** [let]. */
    val three = "three!!".let {
       /* action something */
    }
    /** [also]. */
    val four = true.also {
        /* action something */
    }
    /** [run]. */
    val five = 11.5.run {
        /* action something */
    }
    /** [runCatching].
     The main different between [run] and [runCatching] is this last has [try] block
     */
    val six = "six".runCatching {
        /* action something */
    }
    // this seems like:
    six.run {
        return try {
            /* do something */
        } catch (e: Throwable) {
            return@run e.message
        }
    }
}

