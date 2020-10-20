package assignment

fun main()
{
    var arr= ArrayList<String>()
    arr.add("Kotlin")
    arr.add("Java")
    arr.add("SpringBoot")
    var arr1:Array<String> = arr.toTypedArray()

    arr1.forEach { println(it) }

}