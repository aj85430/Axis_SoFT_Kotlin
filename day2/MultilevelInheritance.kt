package day2

open class Emp4(name:String, age:Int, salary:Float)
{
    init{
        println("EmpName ${name}")
        println("EmpAge ${age}")
        println("EmpSalary ${salary}")
    }
}
open class Developer1(name:String,age:Int,salary:Float, project:String):Emp3(name,age,salary)
{
    init {
        println("EmpProject $project")
    }
}

class Sales(name: String, age: Int, salary: Float, project: String, bonus:Float):Developer1(name, age, salary, project)
{
    init {
        println("Empbonus $bonus")
    }
}
fun main(args:Array<String>)
{
    val d= Sales("John",25,4000f, "Website", 1000f)
}
