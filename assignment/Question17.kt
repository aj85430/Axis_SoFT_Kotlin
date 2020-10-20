package assignment

fun main()
{
    var arr = HashMap<Int, String>()
    arr.put(1,"Kotlin")
    arr.put(2,"Java")
    arr.put(3,"SpringBoot")

    var keylist= ArrayList(arr.keys)
    val valueList= ArrayList(arr.values)

    println("Key list: $keylist")
    println("Value list: $valueList")
}