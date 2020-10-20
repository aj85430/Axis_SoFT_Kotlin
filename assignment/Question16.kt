package assignment

fun main()
{
    var list1= listOf<Int>(10,20,30,40,50)
    var list2= listOf<String>("Java","Kotlin","SpringBoot")
    var list3= listOf<Any>(101,102,"Python","JavaScript")

    list1.printList()
    list2.printList()
    list3.printList()
}

fun <T> List<T>.printList()
{
    for (element in this)
    {
        print("$element ")
    }
    println()
}