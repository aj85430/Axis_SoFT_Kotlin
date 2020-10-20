package day2

class outerClass1{

    var name:String="Aman"

    inner class nestedClass1{

        private var str:String="Jaiswal"
        fun foo()
        {
            println(str)
            println(name)

        }
    }
}


fun main(args: Array<String>)
{
    var obj=outerClass1().nestedClass1()
    obj.foo()

}