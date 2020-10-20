package day3

sealed class A{
    init {
        println("I'm from class A")
    }
    class B:A()
    {
        init {
            println("I'm from class B")
        }
        class E:A()
        {
            init {
                println("I'm from class E")
            }
        }
    }

    class C:A()
    {
        init {
            println("I'm from class C")
        }
    }
}

class D:A()
{
   // class F:A() //throwing error
    //{}

}

fun main()
{
    val b=A.B()
    val c=A.C()
    val e=A.B.E()
}

