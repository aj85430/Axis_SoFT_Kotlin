package day2

class outerClass{

    var name:String="Aman"

    class nestedClass{

        private var str:String="Jaiswal"
        fun foo()
        {
            println(str)
            //println(name) can't access outerclass members
        }
    }
}


fun main(args: Array<String>)
{
    var obj=outerClass()
    println(obj.name)
    outerClass.nestedClass().foo()

}