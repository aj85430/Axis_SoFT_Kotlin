package day3

sealed class Shape{

    class Circle(var radius:Float):Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var length:Int, var breadth:Int):Shape()

}

fun compute(s:Shape)
{
    when(s)
    {
        is Shape.Circle-> println("Area of Circle is ${3.14*s.radius*s.radius}")
        is Shape.Square-> println("Area of Square is ${s.length*s.length}")
        is Shape.Rectangle-> println("Area of Rectangle is ${s.length*s.breadth}")

    }
}

fun main(args: Array<String>)
{
    var circle= Shape.Circle(2.0f)
    var square= Shape.Square(2)
    var rectangle= Shape.Rectangle(2,3)

    compute(circle)
    compute(square)
    compute(rectangle)

}