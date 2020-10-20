package assignment

import java.util.*

fun main()
{
    var sc= Scanner(System.`in`)
    println("Enter the age: ")
    var age=sc.nextInt()
    println("Enter the weight: ")
    var weight=sc.nextDouble()

    if(age>18 && weight>55)
    {
        println("Person is eligible for donate blood")
    }
    else
    {
        println("Person is not eligible for donate blood")
    }
}