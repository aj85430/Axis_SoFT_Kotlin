package day3

fun main()
{
    var range1=1..10
    for(x in range1.reversed())
    {
        print(x)
    }
    println()

    var range2=IntRange(1,5)
    for(x in range2.reversed())
    {
        print(x)
    }
    println()

    var range3=IntProgression.fromClosedRange(10,1,-1)
    for(x in range3.reversed())
    {
        print(x)
    }
    println()

    var range4=IntProgression.fromClosedRange(10,1,-2)
    for(x in range4.reversed())
    {
        print(x)
    }
    println()

    var range5= CharRange('a','z')
    for(x in range5.reversed() step 3)
    {
        print(x)
    }


}