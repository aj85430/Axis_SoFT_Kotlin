package day2
class Emp2 {
    constructor(eId: Int, name: String) : this(eId, name, "Bangalore") {
        println("from constructor 1")
        println("Emp id id $eId")
        println("Emp name is $name")
        println(".............................")
    }
    constructor(eId: Int, name: String, city: String) {
        println("from constructor 2")
        println("Emp id id $eId")
        println("Emp name is $name")
        println("Emp city is $city")
        println(".............................")
    }
}
fun main(args: Array<String>) {
    val e = Emp2(101, "Aman")
}
