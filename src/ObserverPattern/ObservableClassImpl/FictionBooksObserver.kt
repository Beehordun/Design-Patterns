package ObserverPattern.ObservableClassImpl

class FictionBooksObserver : Observer {
    private var fictionBooks = mutableListOf<String>()

    private fun updateBooks(books: List<String>) {
        fictionBooks.clear()
        fictionBooks.addAll(books)
    }

    @Suppress("UNCHECKED_CAST")
    override fun update(observable: Observable, data: Any?) {
        if (data != null) {
            updateBooks(data as List<String>)
        } else {
            if (observable is BookShop) {
                updateBooks(observable.getFictionBooks())
            }
        }
    }

    fun displayAllBooks() {
        val stringBuilder = StringBuilder("List of fiction books in store now are: \n")
        var count = 1
        for (book in fictionBooks) {
            stringBuilder.appendln("$count) $book")
            count ++
        }
        println(stringBuilder.toString())
    }
}