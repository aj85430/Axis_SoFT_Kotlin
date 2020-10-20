package assignment

import kotlin.math.expm1

class Student(roll:Int, name:String, city:String)
{
    var rollNo:Int = 0
    var studentName: String = ""
    var City:String=""

    init {
        this.rollNo=roll
        this.studentName=name
        this.City=city
    }
}


fun main()
{
    var s1= Student(100, "John","Bangalore")
    var s2= Student(101, "Peter","Chennai")
    var s3= Student(102, "Marks","Mumbai")
    var s4= Student(103, "Ravi","Bangalore")
    var s5= Student(104, "Meera","Mumbai")
    var s6= Student(105, "Usha","Chennai")
    var s7= Student(106, "Rekha","Chennai")
    var s8= Student(107, "Sunil","Bangalore")
    var s9= Student(108, "Tara","Chennai")
    var s10= Student(109, "Sun","Mumbai")
    var s11= Student(110, "Ramu","Bangalore")

    val arr= mapOf<Int,Student>(1 to s1,2 to s2,3 to s3,4 to s4, 5 to s5,6 to s6,7 to s7,8 to s8,9 to s9,10 to s10,11 to s11)

    println("Students from Bangalore are")

    for(e in arr.entries)
    {
        if(e.value.City.equals("Bangalore"))
        {
            println(" ${e.value.rollNo} , ${e.value.studentName},  ${e.value.City}")
        }
    }




}