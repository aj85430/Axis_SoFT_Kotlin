package assignment


fun main()
{
    var arr : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    var value= 15
    var ans= search(arr, value)
    if(ans==true)
    {
        println("Value is found")
    }
    else
    {
        println("Value is not found")
    }

}

fun search(arr:Array<Int>, value:Int ):Boolean
{
    var find=false
    for(i in arr)
    {
        if(value==i)
        {
            find=true
            break
        }

    }
    return find
}