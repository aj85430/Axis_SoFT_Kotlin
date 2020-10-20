package day5.model

import day5.dao.*
import java.util.*

open class Book {
    var bookId: Int = 0
    var title: String = ""
    var author: String = ""
    var subject: String = ""
    var price: Int = 0
    var isIssued: Boolean = true


    fun addbook()
    {
        var sc= Scanner(System.`in`)
        getConnection1()
        println("Enter the book name")
        var bookname= sc.nextLine()
        println("Enter the author name")
        var author= sc.nextLine()
        println("Enter the book price")
        var price= sc.nextInt()

        var b=insert(bookname,author,price)
        connectionClose();
    }

    fun deletebook()
    {
        var sc= Scanner(System.`in`)
        getConnection1()
        println("Enter the book id you want to delete")
        var bookid= sc.nextInt()
        var b= deleteRecord(bookid)
        connectionClose();
    }

    fun viewbooks()
    {
        getConnection1()
        println("Here are all the books...")
        var b = selectRecord()
        connectionClose();
    }

    fun updatebook()
    {
        var sc= Scanner(System.`in`)
        getConnection1()
        println("Enter the book id you want to update")
        var bookid= sc.nextInt()
        println("what you want to update\n1:book name 2: author 3: price ")
        var choice=sc.nextInt()
        when(choice)
        {
            1-> {
                println("Enter the new book name")
                var title= sc.next()
                var b = updateBookName(bookid,title)
            }
            2->
            {
                println("Enter the new author name")
                var author= sc.next()
                var b = updateAuthor(bookid,author)
            }
            3->{
                println("Enter the new price")
                var price=sc.nextInt()
                var b= updateBookPrice(bookid, price)
            }
        }
       /*println("Enter the new book name")
        var title= sc.next()
        println("Enter the new author name")
        var author=sc.next()
        println("Enter the new price")
        var bprice= sc.nextInt()*/

        //var b = updateRecord(bookid,title, author, bprice)

        connectionClose();
    }


}
