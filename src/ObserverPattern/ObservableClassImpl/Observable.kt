package ObserverPattern.ObservableClassImpl

open class Observable {
    private var listOfObservers: MutableList<Observer> = mutableListOf<Observer>()
    private var changed = false

    open fun addObserver(observer: Observer) {
        listOfObservers.add(observer)
    }

    fun deleteObserver(observer: Observer) {
        listOfObservers.remove(observer)
    }

    fun clearObservers() {
        listOfObservers.clear()
    }

    fun setChanged() {
        changed = true
    }

    fun notifyObservers(data: Any?) {
        if (changed) {
            for (observer in listOfObservers) {
                observer.update(this, data)
            }
            changed = false
        }
    }

    fun notifyObservers() {
        notifyObservers(null)
    }
}
