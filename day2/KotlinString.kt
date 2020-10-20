package day2

fun main(args: Array<String>)
{
    val str1="Welcome"
    val str2="Welcome"

    if(str1.equals(str2))
    {
        println("same")
    }

    println(str1.toLowerCase())
    println(str2.toUpperCase())
    println(str1.substring(0,3))

    var text="""Have a happy journey
        |it will be a great trip
        |good luck
    """.trimMargin()

    println(text)
    println(text.length)

    var text1= """Kotlin is a OOPs
        #language. it is widely used today
        #in Spring boot 
        #Microservices application
        #and in moblie app applications
    """.trimMargin("#")

    println(text1)
}
