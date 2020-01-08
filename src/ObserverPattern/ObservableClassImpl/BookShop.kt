package ObserverPattern.ObservableClassImpl

class BookShop : Observable() {
    private  var fictionBooks: MutableList<String> = mutableListOf()
    private var selfHelpBooks: MutableList<String> = mutableListOf()

    private fun bookChanged() {
        setChanged()
        notifyObservers()
    }

    fun setFictionBooks(books: MutableList<String>) {
        fictionBooks = books
        bookChanged()
    }

    fun setSelfHelpBooks(books: MutableList<String>) {
        selfHelpBooks = books
        bookChanged()
    }

    fun getSelfHelpBooks(): MutableList<String> = selfHelpBooks

    fun getFictionBooks(): MutableList<String> = fictionBooks
}
