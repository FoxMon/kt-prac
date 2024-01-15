fun main(args: Array<String>) {
    println("Hello World!")

    var a: Int = 123

    loop()
    println(max(1, 2))
    println("doWhen function: ${doWhen(1)}")

    var baseClass = BaseClass("Fox", 11)
    println(baseClass.name)
    println(baseClass.age)

    var user = User("Fox", "Seoul")

    user.saveUser(user, user.name, "Name")
    user.saveUser(user, user.address, "Address")

    var advancedCodeUser = User("Fox", "Seoul")
    advancedCodeUser.saveAndValidateUser(advancedCodeUser)

    println(advancedCodeUser.name)
    println(advancedCodeUser.address)

    var dt = DataStructure()

    dt.put(Car("A", "A-1"))
    var car = dt.getItem()
    println("Car: ${car.name}")
}

fun loop() {
    var i: Int = 0

    while(i < 10) {
        // something

        i++
    }

    for(j in 0..9) {
        println(j)
    }
}

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun doWhen(x: Int): Int = when (x) {
    1 ->
        x * 10
    2 ->
        x * 20
    else ->
        throw IllegalArgumentException("아무튼 이거는 안됨.")
}