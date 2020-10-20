package day5.dao

import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.*;
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.concurrent.TimeUnit


fun insert(bookname: String, author: String, price:Int)
{
    var sql:String="INSERT INTO books (bookname, author, price) VALUES (?, ?, ?)";
    var statement: PreparedStatement? = conn?.prepareStatement(sql);
    if (statement != null) {
        statement.setString(1, bookname)
    };
    if (statement != null) {
        statement.setString(2, author)
    };
    if (statement != null) {
        statement.setInt(3, price)
    };

    var rowsInserted: Int? = statement?.executeUpdate()
    if (rowsInserted != null) {
        if (rowsInserted > 0) {
            System.out.println("Book Inserted Successfully!!");}
    }
    val sql1= "Select BookId from books where BookName='"+bookname+"'"
    var rs1= statement?.resultSet
    rs1= statement?.executeQuery(sql1)
    var bid=0
    while (rs1?.next()!!) {
        bid = rs1.getInt(1);
    }
    println("Book Id is: $bid")
}

fun selectRecord(){
    val sql = "SELECT * FROM books"
    val statement: Statement = conn!!.createStatement()
    val result: ResultSet = statement.executeQuery(sql)
   // var count = 0
    println(String.format("BookId -  BookName  -  Author  - Price"))
    while (result.next()) {
        val bookid = result.getString(1)
        val bookname = result.getString(2)
        val author = result.getString(3)
        val price = result.getInt(4)
        val output = "%s - %s - %s - %s"
        println(String.format(output,bookid,bookname,author,price))
    }
}

/*fun updateRecord(bookid:Int, bookname: String, author: String, price: Int) {
    val sql = "UPDATE books SET bookname=?, author=?, price=? WHERE bookId=?"
    val statement = conn!!.prepareStatement(sql)
    statement.setString(1, bookname)
    statement.setString(2, author)
    statement.setInt(3, price)
    //statement.setInt(4, price)
    val rowsUpdated = statement.executeUpdate()
    if (rowsUpdated > 0) {
        println("Book updation successfully!")
    }
}*/

fun updateBookName(bookid:Int, bookname: String) {
    val sql = "UPDATE books SET BookName='"+bookname+"' WHERE BookId="+bookid
    var statement: Statement = conn!!.createStatement()
    var b= statement.executeUpdate(sql)
    if(b>0)
    {
        println("Book name updation successfully!")
    }

   // val statement = conn!!.prepareStatement(sql)
  //  statement.setString(1, bookname)
    //statement.setString(2, author)
   // statement.setInt(3, price)
    //statement.setInt(4, price)
    /*val rowsUpdated = statement.executeUpdate()
    if (rowsUpdated > 0) {
        println("Book name updation successfully!")
    }*/
}

fun updateAuthor(bookid:Int, author: String) {
    val sql = "UPDATE books SET Author='"+author+"' WHERE bookId="+bookid
   // val statement = conn!!.prepareStatement(sql)
    var statement: Statement = conn!!.createStatement()
    var b= statement.executeUpdate(sql)
    if(b>0)
    {
        println("Author name updation successfully!")
    }
    //statement.setString(1, author)
   // statement.setString(2, author)
   // statement.setInt(3, price)
    //statement.setInt(4, price)
   /* val rowsUpdated = statement.executeUpdate()
    if (rowsUpdated > 0) {
        println("Author updation successfully!")
    }*/
}

fun updateBookPrice(bookid:Int, price: Int) {
    val sql = "UPDATE books SET Price='"+price+"' WHERE bookId="+bookid
    var statement: Statement = conn!!.createStatement()
    var b= statement.executeUpdate(sql)
    if(b>0)
    {
        println("Book Price updation successfully!")
    }
    //val statement = conn!!.prepareStatement(sql)
    //statement.setString(1, bookname)
    //statement.setString(2, author)
    //statement.setInt(1, price)
    //statement.setInt(4, price)
    //val rowsUpdated = statement.executeUpdate()
    /*if (rowsUpdated > 0) {
        println("Book Price updation successfully!")
    }*/
}

fun deleteRecord(bookid: Int) {
    val sql = "DELETE FROM books WHERE bookId=?"
    val statement = conn!!.prepareStatement(sql)
    statement.setInt(1, bookid)
    val rowsDeleted = statement.executeUpdate()
    if (rowsDeleted > 0) {
        println("Book deletion successfully!")
    }
}