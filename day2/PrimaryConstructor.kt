package day2

class Employee(id:Int, name:String)
{
    var ename:String=""
    var eid:Int=0

    init {
        eid=id
        ename=name
    }

    fun output()
    {
        println(eid)
        println(ename)
    }
}

fun main(args:Array<String>)
{
    val e=Employee(1000,"John")
    e.output()
}