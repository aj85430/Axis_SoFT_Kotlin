package day1
import java.util.*;
fun main(args: Array<String>)
{
    val read= Scanner(System.`in`)
    println("Enter a byte value")
    var b:Byte=read.nextByte();
    println("Enter a short value")
    var s: Short=read.nextShort();
    println("Enter an int value")
    var i: Int=read.nextInt();
    println("Enter a float value")
    var f: Float=read.nextFloat();
    println("Enter a long value")
    var l: Long= read.nextLong();
    println("Enter a double value")
    var d: Double=read.nextDouble();
    println("Enter a string value")
    var str: String=read.next();
    println("Byte value is $b")
    println("Short value is $s")
    println("Int value is $i")
    println("Float value is $f")
    println("Double value is $d")
    println("String value is $str")
    //there are two types of strings escaped string and raw string
    var str1="Hello \n Welcome to \n Swarna's session"
    println(str1)
    var str2="""        
        I
        can able
        to write in multiple lines
        for you
    """.trimIndent()
    println(str2)
}