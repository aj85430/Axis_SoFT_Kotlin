package day5.model

import day5.dao.*
import java.util.*



class Issuebook:Book()
{
    fun issuebook()
    {
        getConnection1()
        var sc= Scanner(System.`in`)
        println("Enter User Id")
        var uid= sc.nextInt()
        println("Enter Book Id")
        var bid= sc.nextInt()
        println("Enter Period in days")
        var period= sc.nextInt()

        println("Enter the issued date")

       // var issuedate:Date= Date(Calendar.getInstance().time.time)
        var issuedate:String=sc.next()




        var b= issueBook(uid, bid, period, issuedate)
        connectionClose()

    }

    fun returnbook()
    {
        getConnection1()
        var sc= Scanner(System.`in`)
        println("Enter Issue Id")
        var iid= sc.nextInt()
        println("Enter return date")

       // var returndate:Date = Date(Calendar.getInstance().time.time)
        var returndate:String=sc.next()

        var b= returnBook(iid,returndate)
        connectionClose()


    }

    fun viewIssuedbyUser()
    {
        getConnection1()
        var sc= Scanner(System.`in`)
        println("Enter User Id:")
        var uid= sc.nextInt()
        var b = ViewIssuedBook(uid)
        connectionClose();
    }

    fun viewIssued()
    {
        getConnection1()
        var b = selectRecord2()
        connectionClose();
    }

}
