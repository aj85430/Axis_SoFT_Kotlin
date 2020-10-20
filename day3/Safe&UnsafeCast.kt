package day3

fun main()
{
    var location:Any= "manipal"
    val unsafe:String?= location as String
    println("unsafe done successfully value is $unsafe")

    var safeString:String?= location as? String
    println("safeString done successfully value is $safeString")

    var safeInt:Int?= location as? Int
    println("safeInt done successfully value is $safeInt")


}