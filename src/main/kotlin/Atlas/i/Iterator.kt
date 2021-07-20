package Atlas.i


private interface Iterator {
    var mutableiterator: MutableIterator<String>
    var mutableListIterator: MutableListIterator<String>

    /**
     * An iterator over a collection or another entity,
     * that can be represented as a sequence of elements.
     * Allows to sequentially access the elements.
     */
    fun some() {
        val iter = "string".asIterable().iterator()

        iter.run {
            this.hasNext()
            this.next()
            this.forEach { _ -> }
            this.forEachRemaining { }
            this.asSequence()
            this.iterator()
            this.withIndex()
        }

        val listIterator = "string".toList().listIterator()
        listIterator.run {
            this.hasPrevious()
            this.previous()
            this.previousIndex()
            this.nextIndex()
        }

        mutableiterator.run {
            this.remove()
        }

        mutableListIterator.run {
        this.add("")
        this.set("")
        }

    }
}