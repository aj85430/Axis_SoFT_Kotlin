package day5.dao

import java.sql.Date
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Statement
import java.text.SimpleDateFormat
import java.util.concurrent.TimeUnit


fun selectRecord2(){
    val sql = "SELECT * FROM issued"
    val statement: Statement = conn!!.createStatement()
    val result: ResultSet = statement.executeQuery(sql)
    //var count = 0
    println("")
    while (result.next()) {
        val userid = result.getString(1)
        val bookid = result.getString(2)
        val idate = result.getString(3)
        val rdate = result.getString(4)
        val pd = result.getString(5)

        val output = "%s - %s - %s - %s - %s"
        println(String.format(output,userid,bookid,idate,rdate,pd))
    }
}

fun ViewIssuedBook(userid: Int){
    val sql = "select distinct issued.* from issued,books " + "where ((issued.UserId=" + userid + ") and (books.BookId in (select BookId from issued where issued.UserId="+userid+"))) group by IssueId";
    val statement: Statement = conn!!.createStatement()
    val result: ResultSet = statement.executeQuery(sql)
    //var count = 0
    println(String.format("IssueId - UserId - BookId - IssueDate - ReturnDate - Fine"))
    while (result.next()) {
        val iid = result.getString(1)
        val uid = result.getString(2)
        val bid = result.getString(3)
        val idate = result.getString(4)
        val rdate = result.getString(5)
        val fine= result.getString(6)
        //val bname = result.getString(7)
        //val price = result.getString(8)

        val output = "%s      -     %s     -    %s     -       %s       -       %s      -   %s"

        println(String.format(output,iid,uid,bid,idate,rdate,fine))
    }
}

fun issueBook(userid:Int, bookid: Int, period:Int, issuedate: String)
{
    val sql = "INSERT INTO ISSUED(UserID,BookID,ISSUED_DATE,PERIOD) VALUES (?,?,?,?)";
    var statement: PreparedStatement? = conn?.prepareStatement(sql);
    if (statement != null) {
        statement.setInt(1, userid)
    };
    if (statement != null) {
        statement.setInt(2, bookid)
    };
    if (statement != null) {
        statement.setString(3, issuedate)
    };
    if (statement != null) {
        statement.setInt(4, period)
    };

    var rowsInserted: Int? = statement?.executeUpdate()
    if (rowsInserted != null) {
        if (rowsInserted > 0) {
            System.out.println("Book was issued successfully!");}
    }

    val sql1= "Select IssueId from Issued where UserId='"+userid+"' and BookId="+bookid
    var rs1= statement?.resultSet
    rs1= statement?.executeQuery(sql1)
    var iid=0
    while (rs1?.next()!!) {
         iid = rs1.getInt(1);
    }
    println("Issue Id is: $iid")

}


fun returnBook(issueid:Int,returndate:String)
{
    var date1: String=""

    var date2: String=returndate.toString()
    var statement: Statement = conn!!.createStatement()
    var rs = statement.resultSet
    //var statement: PreparedStatement? = conn?.prepareStatement();
    val sql = ("SELECT ISSUED_DATE FROM ISSUED WHERE IssueId="+issueid);
    rs= statement.executeQuery(sql)
    while(rs.next())
    {
        date1=rs.getString(1)
    }
    val date_1: java.util.Date? = SimpleDateFormat("dd-MM-yyyy").parse(date1)
    val date_2: java.util.Date? = SimpleDateFormat("dd-MM-yyyy").parse(date2)

    val diff: Long = date_2!!.getTime() - date_1!!.getTime()

    var days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS).toInt()

    statement.executeUpdate("UPDATE ISSUED SET RETURN_DATE='"+returndate+"' WHERE IssueId="+issueid);


    var rs1= statement.resultSet
    rs1= statement.executeQuery("SELECT PERIOD FROM ISSUED WHERE IssueId="+issueid)

    var diff1:Int=0
    while (rs1.next()) {
        diff1 = rs1.getInt(1);
    }
    //var diff_int= diff1?.toInt()

    if(days > diff1)
    {
        val fine: Int = ((days - diff1) * 0.01).toInt()
        statement.executeUpdate("UPDATE ISSUED SET FINE='"+fine+"' WHERE IssueId="+issueid);
        var fine_str = "Fine: Rs. $fine"
        println(fine_str)
    }

    println("Book returned successfully")

    /*if (statement != null) {
        statement.setStr
    };
    if (statement != null) {
        statement.setInt(2, )
    };
    if (statement != null) {
        statement.setString(3, issuedate)
    };
    if (statement != null) {
        statement.setInt(4, period)
    };

   var rowsInserted: Int? = statement?.executeUpdate()
    if (rowsInserted != null) {
        if (rowsInserted > 0) {
            System.out.println("Book was issued successfully!");}
    }*/

}