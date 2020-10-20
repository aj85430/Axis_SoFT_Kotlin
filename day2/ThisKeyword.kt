package day2

class Emp1(city:String){
    var eName:String=""
    var eId:Int=0
    var eCity=""

    constructor(id:Int,name:String,city:String):this(city)
    {
        eId=id
        eName=name
        println("Emp id is $eId")
        println("EmpName  is $eName")
        println("Emp city is ${city}")
        // println("Emp id is ${id}")
        //println("EmpName  is ${name}")
    }

}
fun main(args:Array<String>)
{
    val e=Emp1(1000,"John","Mumbai")
}