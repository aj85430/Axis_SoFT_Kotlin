package day2

fun run(num:Int=50, name:String="Manipal", location:String="Bangalore")
{
    println("$num, $name, $location")
}

fun main(args: Array<String>)
{
    run()
    run(1000)
    run(1500, "Axis")
    run(2000, "Jigsaw", "Mumbai")
}
