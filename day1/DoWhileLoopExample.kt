package day1

fun main(args: Array<String>)
{
    var row=1
    var col=1
    do{
        col=1
        while(col<=row)
        {
            print("$col")
            col++
        }
        row++
        println()
    }while(row<=6)
}