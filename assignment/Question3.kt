package assignment

fun main()
{
    var range1= 45.5..100.5
    var value=64.5
    var result= if(value in range1) "Yes $value is in range" else "No $value is not in range"
    println(result)




}