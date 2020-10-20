package day3

fun MutableList<Int>.swap(index1:Int, index2:Int):MutableList<Int>
{
    var t= this[index1]
    this[index1]=this[index2]
    this[index2]=t

    return this
}

fun main()
{
    val list= mutableListOf<Int>(15,25,35,20,30)
    println(list)

    val result=list.swap(0,2)
    println("After swapping...")
    println(list)
}