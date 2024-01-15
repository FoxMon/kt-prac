class Car constructor(val name: String, val kind: String) {
}

interface Container<T> {
    fun put(item: T)

    fun getItem(): T
}

class DataStructure: Container<Car> {
    private val arrList: ArrayList<Car> = arrayListOf()

    override fun put(item: Car) {
        arrList.add(item)
    }

    override fun getItem(): Car {
        return arrList[0]
    }
}