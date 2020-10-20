package day4

fun List<Int>.printList()
{
    for(i in this)
    {
        print("$i ")
    }
    println()
}

fun List<String>.printList1()
{
    for(i in this)
    {
        print("$i ")
    }
}

fun main()
{
    var list1:List<Int> = listOf<Int>(10,20,30,40)
    var list2:List<String> = listOf<String>("Delhi","Mumbai","Kolkata")

    list1.printList()
    list2.printList1()
}