package day4

fun main()
{
    val myMap1:MutableMap<Int,String> = hashMapOf<Int,String>(1 to "Ravi", 2 to "Raju")
    val myMap2:MutableMap<Any,Any> = hashMapOf<Any,Any>(1 to "Aman", "eId" to 100, 'c' to "Raju")

    for(k in myMap1.keys)
    {
        println("$k = ${myMap1[k]}")
    }

    for(k in myMap2.keys)
    {
        println("$k = ${myMap2[k]}")
    }

    val myMap3:MutableMap<Int,String> = mutableMapOf()
    myMap3.putAll(myMap1)

    for(k in myMap3.keys)
    {
        println("$k = ${myMap3[k]}")
    }


}
