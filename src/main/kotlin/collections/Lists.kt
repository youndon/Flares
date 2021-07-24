package collections

import kotlin.collections.*

@ExperimentalStdlibApi
private fun lists(){
    // List. read-only.
    listOf(0,1,2,3,4,5,6,7,8,9).apply {
        listIterator().run {
            /**@see Atlas.i.Iterator*/
        }
        spliterator().run {
            /**@see AtlasJ.JSpliterator*/ }
        shuffled() // Returns a new list with the elements of this list randomly shuffled.
        containsAll(listOf()) // return true if all the elements in the collection exist.
        subList(0, 2) // Returns a view of the portion of this list between the specified fromIndex and toIndex.
        stream().run {
            /**@see AtlasJ.JStream*/ }
        parallelStream().run {
            /**@see AtlasJ.JStream*/ }
        asReversed()
        binarySearch { 1 } /* Searches this list or it's range for the provided
                                [element] using the binary search algorithm. */
        binarySearchBy(1, 0, 3){it}
        component1() // Returns 1st element from the list, there is 5th.
        dropLast(1) // Returns a list containing all elements except last n elements.
        dropLastWhile { it==1 } // Returns a list containing all elements except last elements that satisfy the given predicate.
        elementAt(1) // Returns an element at the given index.
        elementAtOrNull(1) // ..., or null
        elementAtOrElse(1){ println() } // ... , or do something else!
        first() // Returns first element.
        firstOrNull() // ... , or null
        last() // Returns last element.
        lastOrNull() // ..., or null
        lastIndex // Returns the index of the last item in the list or -1 if the list is empty.
        lastIndexOf(1) // Returns the index of the last occurrence of the specified element in the list.
        findLast { it==1 } // Returns the last element matching the given predicate.
        takeLast(1) // Returns a list containing last n elements.
        takeLastWhile { it==1 } // Returns a list containing last elements satisfying the given predicate.
        indexOf(1) // Returns the index of the first occurrence of the specified element in the list.
        indexOfLast { it==1 } // Returns index of the last element matching the given predicate.
        indexOfFirst { it==1 } // Returns index of the first element matching the given predicate.
        reduceRight { i, acc -> acc+i } // Making operation between two elements from the right to the left, then the result will be as element to the next operation with next element.
        reduceRightOrNull { i, acc -> i } //... , or null if collection is empty.
        reduceRightIndexed { index: Int, i: Int?, acc: Int? -> index } // in here we get index with each element.
        reduceRightIndexedOrNull{index, i, acc -> index } //..., or null if collection is empty.
        getOrElse(1){ it==0 } // Returns an element at the given index or the result of calling the defaultValue function if the index is out of bounds of this list.
        getOrNull(1) // Returns an element at the given index or null if the index is out of bounds of this list.
        requireNoNulls() // Returns an original collection containing all the non-null elements.
        single() // Returns the single element, or throws an exception if the list is empty or has more than one element.
        singleOrNull() // ..., or null if the list is empty or has more than one element.
        slice(0..6) // Returns a list containing elements at indices in the specified indices range.
        foldRight(""){i, acc -> acc } // Accumulates value starting with initial value and applying operation from right to left to each element and current accumulator value, or return initial vale if this collection is empty (this why we haven't foldRightOrNull() fun like reduce).
        foldRightIndexed(""){index, i, acc -> acc } // In here we get index with each element.
        /** So what is the main different between fold and reduce then
         * */
    }

    // MutableList. read-write.
    mutableListOf<String>().apply {
        add("") // add specified element to the collection.
        addAll(listOf()) // add specified collection to this collection.
        removeAll{ true } // remove specific collection from this collection.
        removeAt(1) // remove a element at specific index.
        removeFirst() // Removes the first element from this mutable list and returns that removed element, or throws NoSuchElementException if this list is empty.
        removeFirstOrNull() // like removeFirst(),or returns `null` if this list is empty.
        removeLast() // remove the last element in the list.
        removeLastOrNull() // ..., or null
        retainAll{it == "..."} // true if none element equals it, false if any element equals it.
        this.replaceAll {it} // TODO: 26/06/2021
        asReversed() // Returns a reversed mutable view of the original mutable List.
        reverse() // Reverses elements in the list in-place.
        fill("...") // Fills the list with the provided value. Each element in the list gets replaced with the value.
        shuffle() // Randomly shuffles elements in this mutable list.
        sort() // Sorts elements in the list in-place according to their natural sort order.
        sortBy { it }
        sortWith { sec ,fir -> fir.compareTo(sec) } // compare between tow elements
        sortByDescending { it } // sort the list from the grand to the small
    }

    // ArrayList.
    arrayListOf<String>().apply {
        trimToSize() // TODO: 26/06/2021
        ensureCapacity(1) // TODO: 26/06/2021
    }

    // AbstractList.
    val myAbstractList : AbstractList<*>

    // AbstractMutableList.
    val myAbstractMutableList : AbstractMutableList<Any>

    // listIterator
    val pleasant = listOf(1,2).listIterator()

    // emptyList.
   val myEmptyList =  emptyList<Int>()

}