package day3

//the smart cast also provides is or !is
//is used to check whether the given type is of specified type
//!is throws true or false basis on the comparison

fun main()
{
    var str: String? = "Hello World"

    if (str!=null)     //smart cast
    {
        println(str.length)
    }

    val str1 : Any? = 10.5f     //"welcome to kotlin"

    if(str1 is String? )
    {
        if(str1 != null)
        {
            println("length is ${str1.length}")
        }
        else
        {
            println("string of zero length")
        }

    }

    if(str1 !is String)
    {
        if(str1 != null)
        {
            println("$str1")
        }
        else
        {
            println("not a string" )
        }
    }


}