fun main() {


    mapOf(1 to "one" , 2 to "two", 2 to "two" ,null to null)



}


fun <F> genericF(f:F): F where F:CharSequence = f

/*The Map is an interface, and HashMap is a class of the Java collection framework.
The Map interface can be implemented by using its implementing classes. In comparison, the HashMap class implements the Map interface.
The Map contains unique key-pair values. But, the HashMap can hold duplicate values.
The Map does not allow null values. But the HashMap can have one null key and multiple values.
The Map has two implementations, which are HashMap and TreeMap. Whereas HashMap implements Map interface and extends AbstractMap class.
There is no difference between the Map and HashMap objects.
*/