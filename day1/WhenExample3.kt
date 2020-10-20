package day1

import java.util.*

/* Accept the student % and display the class
>60% firstclass
>50-59 second class
>35-49 third class
<35 fail
 use when expression to do this
 */
fun main(args: Array<String>)
{
   val read= Scanner(System.`in`)
    println("Enter the student score in %")
    var score= read.nextInt()
    var result= when(score)
    {
        in 1..34->"fail"
        in 35..49->"Third class"
        in 50..59-> "Second class"
        in 60..100-> "First class"
        else->"invalid input"
    }

    println(result)
}