package fundamentals

fun main() {
    val count = 6

    if (count < 5) {
        println("Count is less than 5")
    } else if (count < 10) {
        println("Count is less than 10")
    } else {
        println("Count is more than 10")
    }


    val size = 7
    when (size) {
        1 -> println("Size is 1")
        3 -> println("Size is 3")
        else -> println("Size is unexpected")
    }
}