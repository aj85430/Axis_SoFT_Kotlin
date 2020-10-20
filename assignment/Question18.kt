package assignment

fun main()
{
    var list1= listOf<Int>(10,20,30,40)
    var list2= listOf<Int>(50,60,70,80,90,100)
    var list3= listOf<String>("Kotlin","Java","SpringBoot")
    var list4= listOf<Int>()
    var list5= listOf<Any>()
    list4= list1.plus(list2)
    list5= list4.plus(list3)
    println(list4)
    println(list5)
}