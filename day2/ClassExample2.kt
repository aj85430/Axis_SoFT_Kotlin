package day2

class Student1{
    var rollno:Int=0
    var name:String=""
    var city:String=""
    fun input(r:Int=100, n:String="xxx", c:String)
    {
        rollno=r
        name=n
        city=c
    }
    fun output()
    {
        println("Rollno is $rollno")
        println("name is $name")
        println("city is $city")
    }

}
fun changeAddress()
{
    var s1=Student1()
    s1.input(c="Delhi")
    s1.output()
}

fun main(args:Array<String>)
{
    Student1()
    var s=Student1()
    s.input(100,"John","Bangalore")
    s.output()
    changeAddress()
}