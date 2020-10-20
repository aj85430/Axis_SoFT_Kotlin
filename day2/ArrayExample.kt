package day2

fun main (args:Array<String>)
{
    var arr1= arrayOf(10,20,"Banana",40,"Apple")

    arr1.set(2,"Mango")
    arr1.set(1,25)

    for (items in arr1)
    {
        println(items)
    }

    println(arr1.get(4))
}