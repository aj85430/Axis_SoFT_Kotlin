package day4

fun main()
{
    var res= MyJava.`fun`("Aman",5)
     println(res)

    var obj=MyJava()
    obj.setFirstname("Aman")
    obj.setLastname("Jaiswal")
    println(obj.getFirstname()+" "+obj.getLastname())


}