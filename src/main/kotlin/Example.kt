data class Example (
    val value: Long,
) {
    companion object {
        fun of(v: Long): Example = Example(v)
    }

    operator fun plus(other: Example): Example = Example(other.value + value)
}

fun main() {
    println(Example.of(100) + Example.of(10))
}