package day3

//elvisoperator is refered as ?:

fun main()
{
    var str1:String?= null
    var str2: String?= "Aman Jaiswal"

    var len1:Int= str1?.length?:0
    var len2:Int= str2?.length?:0

    println("Length of str1 is $len1")
    println("Length of str2 is $len2")
}