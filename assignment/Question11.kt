package assignment

import java.util.*

sealed class Cars()
{
    class Maruti(var type:String):Cars()
    class Hyundai(var type:String):Cars()
    class Honda(var type:String):Cars()
}

fun compute(s:Cars) =
    when(s)
    {
        is Cars.Maruti-> println("Indian make")
        is Cars.Hyundai-> println("Korean make")
        is Cars.Honda-> println("Japan make")
    }


fun main()
{
    var sc= Scanner(System.`in`)
    println("Enter the type of car")
    var car_type= sc.next()

}