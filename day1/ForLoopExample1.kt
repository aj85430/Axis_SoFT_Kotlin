package day1

fun main(args: Array<String>)
{
    val marks = arrayOf(80,45,67,23,67)

    for (items in marks)
    {
        println((items).toString()) // because concatenating //$items can be use
    }

    val fruits: Array<String> = arrayOf("Apple", "Mango", "Grapes")
    for (items:String in fruits)
    {
        println(items)
    }

    for(items in marks.indices)
    {
        println("marks[$items]: "+ marks[items])
    }
}
