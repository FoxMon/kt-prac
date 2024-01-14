class BaseClass constructor(name: String, age: Int) {
    val name = name

    val age = age

    // 생성자 호출 시점에 발생
    init {
        if (name.length > 4) {
            throw IllegalArgumentException("이름은 5글자를 초과할 수 없습니다.")
        }
    }
}

class User(val name: String,  val address: String) {
    fun saveUser(user: User,
                 value: String,
                 fileName: String
    ) {
      if(value.isEmpty()) {
          throw IllegalArgumentException(
              "Can't save user ${value}: empty${fileName}"
          )
      }
    }

    fun saveAndValidateUser(user: User) {

        // 약간 JS의 클로져 느낌인 것 같은데
        // 꽤 괜찮은 듯?
        fun validate(user: User,
                     value: String,
                     fileName: String) {
            if(value.isEmpty()) {
                throw IllegalArgumentException(
                    "Can't save user ${value}: ${fileName};"
                )
            }
        }

        validate(user, user.name, "Name")
        validate(user, user.address, "Address")
    }
}