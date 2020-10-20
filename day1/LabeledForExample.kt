package day1

fun main(args: Array<String>)
{
    for(i in 1..3)
    {
        //if(i==2)
           // break
        for(j in 1..3)
        {
            println("i= $i and j= $j")

        }

    }

    for(i in 20..40)
    {
        if(i<=34)
        {
            println("i= $i")
            continue
        }
        else
        {
            println("limit exceeded")
            return;
        }
    }
}