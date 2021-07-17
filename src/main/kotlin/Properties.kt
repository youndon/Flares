

// The properties has two different terms.
// val: the value on val property not allowed to changing.
private const val ONE = 2020
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

// Using the property for creating anonymous class/object and function.
private val anonymousObject = object {/*...*/}
private val anonymousClass = object:Any() {/*...*/ }
private val anonymousFunction = fun() {/*...*/ }

// creating Lambda function.
private val lamb =  {a:Int, b:Int -> a + b}

// Create Extension property.
private val Any.go:Int get() = 0
// this mean we creating property for the Boss class out the class.

// Generic Extension property.
private val <Y> Array<Y>.fame: Y? get() = null

// Gave the property keyword name.
private lateinit var `var`:Any
// Note: this also can working with the function and the class.

// by keyword.
private val some:Any? by lazy { null }

