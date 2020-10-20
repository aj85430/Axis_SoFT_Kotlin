package day1

tailrec fun recursiveSum(n:Long, semiresult: Long=0):Long
{
    return if(n<=0)
    {
        semiresult
    }

    else
    {
        recursiveSum(n-1, n+semiresult)
    }

}

fun main(args: Array<String>) {
    var number = 1000000.toLong()
    var result = recursiveSum(number)
    println("sum upto $number is $result")
}

