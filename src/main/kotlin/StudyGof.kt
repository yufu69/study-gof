import com.yufutech.hatenablog.gof.adapter.*
import com.yufutech.hatenablog.gof.adapter.exercises.FileIO
import com.yufutech.hatenablog.gof.adapter.exercises.FileProperties
import com.yufutech.hatenablog.gof.iterator.Book
import com.yufutech.hatenablog.gof.iterator.BookShelf
import java.io.IOException

fun main() {
//    runIterator()
//    runAdapter()
    runAdapterExercises()
}

fun runIterator() {
    val bookShelf = BookShelf(4)
    bookShelf.appendBook(Book("Around the World in 80 Days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long-Legs"))

    val it = bookShelf.iterator()

    while (it.hasNext()) {
        println(it.next().getName())
    }
}

fun runAdapter() {
    val printA: PrintA = PrintBannerA("Hello")
    val printB = PrintBannerB("Hi")

    printA.printWeak()
    printA.printStrong()

    printB.printWeak()
    printB.printStrong()
}

fun runAdapterExercises() {
    val f: FileIO = FileProperties()

    try {
        f.readFromFile("file.txt")

        f.setValue("year", "2004")
        f.setValue("month", "4")
        f.setValue("day", "21")

        f.writeToFile("newfile.txt")
    } catch (e: IOException) {
        e.printStackTrace()
    }
}