

// The properties has two different terms.
// val: the value on val property not allowed to changing.
private val ONE = 2020
fun main() {
//    ONE = 2021 // FIXME: error!
}
// the const mean constant or fix property using only on val in the objects and top-level property
// the const normally has Uppercase name.

// var: the value on var property allowed to change.
private var two = 100
// OR.
/**@see AtlasBox.property_And_field */
private var three :Int = 0
   set(value) {
       field = 10
   }

lateinit var late:Any

// Using the property for creating object class or function or another property.
private val boss = Any()

// Create Extension property.
private val Any.go:Int get() = 0
// this mean we creating property for the Boss class out the class.

// Generic Extension property.
private val <Y> Array<Y>.fame: Y? get() = null

// Gave the property keyword name.
private lateinit var `var`:Any
// Note: this also can working with the function and the class.

// by.
private val some:Any? by lazy { null }

/*
 const.
The `const` keyword is used to declare those properties which are immutable in nature.
But, the value of these properties must be known at the compile-time only
A property must satisfy the following to be a `const` property:
- must be at top-level or member of object or member of a companion object
- must be initialised with a `String` type or primitive type
- no custom getter
*/
object Properties{
    const val con = "constant"
}
// Why use "const" when we can use "val"?
