package day3

fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("Banana", "Apple", "Mango")

    val floatList: ArrayList<Float> = arrayListOf<Float>(12.4f, 45.2f, 56.7f)

    val mixedList: ArrayList<Any> = arrayListOf<Any>("Hello", "Aman", 34, 5.9)

    stringList.printList()
    floatList.printList()
    mixedList.printList()

}

fun <T>ArrayList<T>.printList()
{
    for(element in this)
    {
        print("$element ")
    }
    println()
}