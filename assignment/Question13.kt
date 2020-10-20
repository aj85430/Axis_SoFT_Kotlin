package assignment

fun main()
{
    var str : String?
    str= "I like to study Kotlin"
    var res= if(str!= null) str.reversed() else 0
    print(res)
}