fun main(args: Array<String>) {
    println("Hello World!")

    var a: Int = 123

    loop()
    println(max(1, 2))

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