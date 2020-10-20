package assignment

fun main(args:Array<String>)
{
    val product = { p: Int, t: Int, r:Float -> (p*t*r)/100 }

    val result = product(900, 3, 5f)
    println(result)
}