package day4
import java.util.*;
class Emp1(var eId:Int, var eName:String, var eCity:String, var eSalary:Float)
fun main() {

    var list4: ArrayList<Emp1> = arrayListOf<Emp1>()
    var sc= Scanner(System.`in`)
    println("Enter the number of employee")
    var n= sc.nextInt()
    for(i in 1..n)
    {
        println("Enter the employee id")
        var id= sc.nextInt()
        println("Enter the employee name")
        var name=sc.next()
        println("Enter the employee city")
        var city=sc.next()
        println("Enter the employee salary")
        var salary=sc.nextFloat()
        var e= Emp1(id,name, city, salary)
        list4.add(e)

    }

    for (e in list4) {
        println("${e.eId}, ${e.eName}, ${e.eCity}, ${e.eSalary}")
    }


}
