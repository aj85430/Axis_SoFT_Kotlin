package day1

fun main(args: Array<String>)
{
    val n1=10
    var n2= 20
    /*val result= if(n1>n2) "$n1 is greater than $n2" else "$n1 is smaller than $n2"
    println(result)*/

    val result= if(n1>n2) "$n1 is greater than $n2" else if (n2>n1) "$n1 is smaller than $n2" else "$n1 is same as $n2"
    println(result)

}