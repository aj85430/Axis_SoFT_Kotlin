package day2

/*fun main(args: Array<String>)
{
    val product = { a: Int, b: Int -> a * b }
    val result = product(9, 3)
    println(result)

    val welcome={name: String-> "Welcome to $name place"}
    val result1= welcome("Aman")
    println(result1)
}*/

fun callMe(greeting: () -> Unit) {
    greeting()
}

fun main(args: Array<String>) {
    callMe({ println("Welcome to Kotlin") })
}