package AtlasLib
@Deprecated("Wrong name!!")
class Omission {
    fun omission() {
//        ProcessBuilder("clear").inheritIO().start()
        val gp = "if you life each day as it was your last ,someday you'll most sternly be right".
                 windowed(15).forEach{Thread.sleep(300); println("[$it]")}
        omission()
    } //  <<- [..you life each day as it was your..] <<-

}

