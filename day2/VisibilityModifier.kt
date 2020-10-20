package day2

open class parent(){

    open var a=100 //public by default
    private var b=200 //private to the parent class
    protected open var c=300 //visible to parent and child
    internal open var d=400 //visible in this module
}

class child:parent(){

    override var c=350
    override var d=40
   fun output()
   {
       println(a)
       println(c)
       println(d)

   }


}

fun main(args:Array<String>)
{
    var p=parent()
    var ch=child()
    println(p.a)
    println(p.d)
    println(ch.a)
    ch.output()

}