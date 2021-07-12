package AtlasLib

// console color allow you to control the output color and text_style and more.

sealed class ConsoleColor() {

 private companion object {  const val RESET = "\u001B[0m"  }

 object Color : ConsoleColor() {
  fun blue(input: Any) = ("\u001B[0;34m$input${RESET}")
  fun red(input: Any) = ("\u001B[0;31m$input${RESET}")
  fun white(input: Any) = ("\u001B[0;30m$input${RESET}")
  fun black(input: Any) = ("\u001B[0;37m$input${RESET}")
  fun yellow(input: Any) = ("\u001B[0;33m$input${RESET}")
  fun green(input: Any) = ("\u001B[0;32m$input${RESET}")
  fun cyan(input: Any) = ("\u001B[0;36m$input${RESET}")
  fun purple(input: Any) = ("\u001B[0;35m$input${RESET}")
 }

 object Bold : ConsoleColor() {
  fun blue(input: Any) = ("\u001B[1;34m$input${RESET}")
  fun red(input: Any) = ("\u001B[1;31m$input${RESET}")
  fun white(input: Any) = ("\u001B[130m$input${RESET}")
  fun black(input: Any) = ("\u001B[1;37m$input${RESET}")
  fun yellow(input: Any) = ("\u001B[1;33m$input${RESET}")
  fun green(input: Any) = ("\u001B[1;32m$input${RESET}")
  fun cyan(input: Any) = ("\u001B[1;36m$input${RESET}")
  fun purple(input: Any) = ("\u001B[1;35m$input${RESET}")
 }

 object Italic : ConsoleColor() {
  fun blue(input: Any) = ("\u001B[3;34m$input${RESET}")
  fun red(input: Any) = ("\u001B[3;31m$input${RESET}")
  fun white(input: Any) = ("\u001B[3;30m$input${RESET}")
  fun black(input: Any) = ("\u001B[3;37m$input${RESET}")
  fun yellow(input: Any) = ("\u001B[3;33m$input${RESET}")
  fun green(input: Any) = ("\u001B[3;32m$input${RESET}")
  fun cyan(input: Any) = ("\u001B[3;36m$input${RESET}")
  fun purple(input: Any) = ("\u001B[3;35m$input${RESET}")
 }
 object UnderLine : ConsoleColor() {
  fun blue(input: Any) = ("\u001B[4;34m$input${RESET}")
  fun red(input: Any) = ("\u001B[4;31m$input${RESET}")
  fun white(input: Any) = ("\u001B[4;30m$input${RESET}")
  fun black(input: Any) = ("\u001B[4;37m$input${RESET}")
  fun yellow(input: Any) = ("\u001B[4;33m$input${RESET}")
  fun green(input: Any) = ("\u001B[4;32m$input${RESET}")
  fun cyan(input: Any) = ("\u001B[4;36m$input${RESET}")
  fun purple(input: Any) = ("\u001B[4;35m$input${RESET}")
 }
 object Background : ConsoleColor() {
  fun blue(input: Any) = ("\u001B[7;34m$input${RESET}")
  fun red(input: Any) = ("\u001B[7;31m$input${RESET}")
  fun white(input: Any) = ("\u001B[7;30m$input${RESET}")
  fun black(input: Any) = ("\u001B[7;37m$input${RESET}")
  fun yellow(input: Any) = ("\u001B[7;33m$input${RESET}")
  fun green(input: Any) = ("\u001B[7;32m$input${RESET}")
  fun cyan(input: Any) = ("\u001B[7;36m$input${RESET}")
  fun purple(input: Any) = ("\u001B[7;35m$input${RESET}")
 }
 object MiddleLine : ConsoleColor() {
  fun blue(input: Any) = ("\u001B[9;34m$input${RESET}")
  fun red(input: Any) = ("\u001B[9;31m$input${RESET}")
  fun white(input: Any) = ("\u001B[9;30m$input${RESET}")
  fun black(input: Any) = ("\u001B[9;37m$input${RESET}")
  fun yellow(input: Any) = ("\u001B[9;33m$input${RESET}")
  fun green(input: Any) = ("\u001B[9;32m$input${RESET}")
  fun cyan(input: Any) = ("\u001B[9;36m$input${RESET}")
  fun purple(input: Any) = ("\u001B[9;35m$input${RESET}")
 }
}