package ObserverPattern.ObservableClassImpl

fun main() {
    val fictionBooks = mutableListOf("Harry Porter", "Game of Thrones", "The Beauty and the Beast")
    val bookShop = BookShop()
    val fictionBooksObserver = FictionBooksObserver()

    bookShop.addObserver(fictionBooksObserver)
    bookShop.setFictionBooks(fictionBooks)

    fictionBooksObserver.displayAllBooks()
}