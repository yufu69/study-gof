import com.yufutech.hatenablog.gof.adapter.*
import com.yufutech.hatenablog.gof.adapter.exercises.FileIO
import com.yufutech.hatenablog.gof.adapter.exercises.FileProperties
import com.yufutech.hatenablog.gof.factorymethod.idcard.IDCardFactory
import com.yufutech.hatenablog.gof.iterator.Book
import com.yufutech.hatenablog.gof.iterator.BookShelf
import com.yufutech.hatenablog.gof.template.AbstractDisplay
import com.yufutech.hatenablog.gof.template.CharDisplay
import com.yufutech.hatenablog.gof.template.StringDisplay
import java.io.IOException

fun main() {
//    runIterator()
//    runAdapter()
//    runAdapterExercises()
//    runTemplateMethod()
    runFactoryMethod()
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

fun runTemplateMethod() {
    val display1 = CharDisplay('A')
    val display2 = StringDisplay("Hello, World")
    val display3 = StringDisplay("こんにちは。")

    display1.display()
    println()

    display2.display()
    display3.display()
}

fun runFactoryMethod() {
    val factory = IDCardFactory()
    val card1 = factory.create("天井ウテナ")
    val card2 = factory.create("姫宮アンシー")
    val card3 = factory.create("ディオス")

    card1.use()
    card2.use()
    card3.use()
    println("factory owners ... ${factory.getOwners()}")
}