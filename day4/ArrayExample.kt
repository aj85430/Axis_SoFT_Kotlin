package day4

fun main()
{

    var arr= Array<Int>(5){2}

    for(i in 0..4)
    {
        println(arr[i])
    }

    var arr2= arrayOf(12,45.5,"John","Ravin",true,'c')
    for(i in arr2)
    {
        println(i)
    }

}