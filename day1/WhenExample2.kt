package day1

import java.util.*;

fun main(args: Array<String>)
{
    val read= Scanner(System.`in`)
    println("Enter the week day in number")
    var dayNum= read.nextInt();
    when(dayNum)
    {
        1,3,5-> println("Can buy tickets")
        2,4,6,7-> println("Can't buy tickets")
        else-> println("invalid input")
    }


}