package oop

/** polymorphism. mean using the function by many forms out the class. */

open class KotlinV() {
    open fun myKotlinVersion() {
        println(KotlinVersion.CURRENT) // kotlin version.
    }

}

class KotlinVPatch : KotlinV(){
    override fun myKotlinVersion() {
        super.myKotlinVersion()
        println(KotlinVersion.CURRENT.patch)
    }
}

class KotlinVMajor : KotlinV() {
    override fun myKotlinVersion() {
        super.myKotlinVersion()
        println(KotlinVersion.CURRENT.major)
    }

}

class Green(){
    fun greenFunction(a: KotlinV){
        a.myKotlinVersion()
    }
}

fun main() {

    // polymorphism as simple.
    val kotlinV = KotlinV()
    kotlinV.myKotlinVersion()

    val kotlinVPatch = KotlinVPatch()
    kotlinVPatch.myKotlinVersion()

    val kotlinVMajor = KotlinVMajor()
    kotlinVMajor.myKotlinVersion()

    // polymorphism as Array.
    val arr = Array(2){ KotlinV() }
    arr[0] = KotlinVPatch()
    arr[1] = KotlinVMajor()
    for (ss in 0..arr.size){
        arr[ss].myKotlinVersion()
    }

    // another polymorphism form.
    val s = Green()
    s.greenFunction(kotlinVPatch)
    s.greenFunction(kotlinVMajor)
    // mean: the element of the function accept the 'Object' of class oop.KotlinV,
    // and the classes they inherited it.

}

