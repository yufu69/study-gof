package com.yufutech.hatenablog.gof.iterator

class BookShelf(val maxsize: Int) : Aggregate {
    private val books = arrayOfNulls<Book>(maxsize)
    private var last = 0

    fun getBookAt(index: Int): Book {
        return books[index]!!
    }

    fun appendBook(book: Book) {
        books[last] = book
        last++
    }

    fun getLength(): Int {
        return last
    }

    override fun iterator(): BookShelfIterator {
        return BookShelfIterator(this)
    }
}