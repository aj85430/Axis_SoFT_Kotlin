package day1

fun main(args: Array<String>) {
    var number = 9
    var result = Math.sqrt(number.toDouble())
    print("Square root is $result ")
    println()
    val result1 = sum(5, 6)
    println("the sum is $result1")
}

fun sum(num1:Int,num2:Int):Int
{
    val add=num1+num2
    return add
}