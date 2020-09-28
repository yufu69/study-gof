package com.yufutech.hatenablog.gof.iterator

class BookShelfIterator(bookShelf: BookShelf) : Iterator {
    private val bookShelf = bookShelf
    private var index = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Book {
        val book = bookShelf.getBookAt(index)
        index++

        return book
    }
}
