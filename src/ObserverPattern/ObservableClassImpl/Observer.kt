package ObserverPattern.ObservableClassImpl

interface Observer {
    fun update(observable: Observable, data: Any?)
}