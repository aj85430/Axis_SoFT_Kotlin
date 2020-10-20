package day2

open class Emp3(name:String, age:Int, salary:Float)
{
    init{
        println("EmpName ${name}")
        println("EmpAge ${age}")
        println("EmpSalary ${salary}")
    }
}
class Developer(name:String,age:Int,salary:Float, project:String):Emp3(name,age,salary)
{
    init {
        println("EmpProject $project")
    }

}

fun main(args:Array<String>)
{
    val d=Developer("John",25,4000f, "Website")
}
