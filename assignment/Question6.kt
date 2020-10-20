package assignment

tailrec fun recursiveFact(n:Long, semiresult:Long=1):Long
{
    return if(n<=1)
    {
        n*semiresult
    }

    else
    {
        recursiveFact(n - 1, n * semiresult)
    }

}

fun main(args: Array<String>) {
    var num: Long = 50
    var result = recursiveFact(num)
    println("factorial is $result")
}
