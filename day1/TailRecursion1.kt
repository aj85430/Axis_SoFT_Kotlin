package day1

tailrec fun recursiveFact(n:Int, semiresult:Int):Long
{
    return if(n==1)
    {
        semiresult.toLong()
    }

    else
    {
        recursiveFact(n-1, n*semiresult)
    }

}

fun main(args: Array<String>) {
    var num = 1
    var result = recursiveFact(99,num)
    println("factorial is $result")
}
