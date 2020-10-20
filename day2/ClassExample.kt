package day2

class Student
{
    var rollno:Int= 0
    var name: String=""
    var city:String=""

    fun input(r:Int, n:String, c:String)
    {
        rollno=r
        name=n
        city=c
    }

    fun output(){
        println("Rollno is $rollno")
        println("Name is $name")
        println("City is $city")
    }
}

fun main(args:Array<String>)
{
    var s= Student()
    s.input(1, "Aman","Gonda")
    s.output()
}