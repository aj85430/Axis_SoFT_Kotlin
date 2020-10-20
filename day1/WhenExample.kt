package day1

import java.util.*;

fun main(args: Array<String>)
{
    val read= Scanner(System.`in`)
    println("Enter the week day in number")
    var dayNum= read.nextInt();
    var weekDay = when(dayNum)
    {
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else-> "invalid input"
    }
    println("Week day is $weekDay")

}