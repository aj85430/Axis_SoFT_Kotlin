package day3

fun main()
{
    var str: String? = "Aman Jaiswal"
    var len= if(str!=null) str.length else 0

    println("Length= $len")

    str=null
    len=if(str!=null) str.length else 0

    println("length= $len")
}