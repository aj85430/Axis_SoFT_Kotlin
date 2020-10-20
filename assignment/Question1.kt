package assignment

fun main()
{
    var str= "Aman Jaiswal"
    var ans= Count_Vowel(str)
    println(ans)

}

fun Count_Vowel(str: String):Int
{
    var c=0
    var arr= arrayOf('a','e','i','o','u','A','E','I','O','U')
    for(i in str.indices)
    {
        if(arr.contains(str[i]))
        {
            c=c+1
        }

    }
    return c
}