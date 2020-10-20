package assignment

import java.util.*;
fun main()
{
    var sc= Scanner(System.`in`)
    println("Enter the revenue of employee")
    var revenue=sc.nextInt()

    var bonus= when(revenue)
    {
        in 10000..20000-> "bonus is 1500"
        in 21000..40000-> "bonus is 2500"
        in 41000..60000-> "bonus is 3500"
        else-> "not eligible for bonus"
    }

    println(bonus)
}