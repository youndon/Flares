package collections

/** A generic unordered collection of elements that does not support duplicate elements. */
fun mySet(){
    // Set.
    val set : Set<Any> = setOf(1,2,2,3,4,14,10,5,6,7,8)
    with(set){
          toTypedArray() // Returns a typed array containing all of the elements of this collection.
          plus(1)
          plusElement(1)
          minus(1)
          minusElement(1)
    }
    // MutableSet.
    mutableSetOf(1,2,2,3,4,14,10,5,6,7,8)

    // AbstractSet.
    val myAbstractSet = set as AbstractSet

    // AbstractMutableSet.
    val myAbstractMutableSet = set as AbstractMutableSet

    // HashSet.
    val myHashSet = set as HashSet

    // LinkedHashSet.
    val myLinkedHashSet = set as LinkedHashSet

}