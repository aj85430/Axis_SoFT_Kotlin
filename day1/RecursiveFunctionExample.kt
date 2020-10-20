package day1

var count=0;
fun rec()
{
    count++;
    if(count<=5)
    {
        println("Welcome to Kotlin Session "+count)
        rec()
    }


}

fun fact(n:Int): Long{
    return if(n==1)
    {
        n.toLong()
    }

    else
    {
       n*fact(n-1)
    }
}


fun main(args: Array<String>)
{
    rec();

    val number=6
    val result:Long
    result= fact(number)
    println("factorial is $result")
}