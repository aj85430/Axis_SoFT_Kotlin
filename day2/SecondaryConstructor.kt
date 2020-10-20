package day2

class Emp{
    var eName:String=""
    var eId:Int=0

    constructor(id:Int,name:String)
    {
        eId=id
        eName=name
        println("Emp id is $eId")
        println("EmpName  is $eName")

       // println("Emp id is ${id}")
        //println("EmpName  is ${name}")
    }

}
fun main(args:Array<String>)
{
    val e=Emp(1000,"John")
}