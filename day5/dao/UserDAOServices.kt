package day5.dao

import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Statement

fun insert1(username: String,password: String)
{
    var sql:String="INSERT INTO users (username, password) VALUES (?, ?)";
    var statement: PreparedStatement? = conn?.prepareStatement(sql);
    if (statement != null) {
        statement.setString(1, username)
    };
    if (statement != null) {
        statement.setString(2, password)
    };

    var rowsInserted: Int? = statement?.executeUpdate()
    if (rowsInserted != null) {
        if (rowsInserted > 0) {
            System.out.println("You are registered successfully...");}
    }
    val sql1= "Select UserId from users where UserName='"+username+"' and Password='"+password+"'"
    var rs1= statement?.resultSet
    rs1= statement?.executeQuery(sql1)
    var uid=0
    while (rs1?.next()!!) {
        uid = rs1.getInt(1);
    }
    println("Your User Id is: $uid")

}

fun selectRecord1(){
    val sql = "SELECT UserId, UserName FROM users"
    val statement: Statement = conn!!.createStatement()
    val result: ResultSet = statement.executeQuery(sql)
    var count = 0
    while (result.next()) {
        val userid = result.getString(1)
        val username = result.getString(2)
        //val password = result.getString(3)
        val output = "%s - %s"
        println(String.format(output,userid,username))
    }
}

fun PasswordChange(uid:Int, pass:String)
{
    val sql= "UPDATE users SET Password='"+pass+"' WHERE UserId="+uid
    var statement: Statement = conn!!.createStatement()
    var b= statement.executeUpdate(sql)
    if(b>0)
    {
        println("Password Updated!!")
    }

}
/*fun updateRecord1(username: String, password: String, fullName: String, email: String) {
    val sql = "UPDATE users SET password=?, fullname=?, email=? WHERE username=?"
    val statement = conn!!.prepareStatement(sql)
    statement.setString(1, password)
    statement.setString(2, fullName)
    statement.setString(3, email)
    statement.setString(4, username)
    val rowsUpdated = statement.executeUpdate()
    if (rowsUpdated > 0) {
        println("An existing user was updated successfully!")
    }
}*/

fun UserDelete(uid:Int) {
    val sql = "DELETE FROM users WHERE UserId=?"
    val statement = conn!!.prepareStatement(sql)
    statement.setInt(1, uid)
    val rowsDeleted = statement.executeUpdate()
    if (rowsDeleted > 0) {
        println("Account Deleted!!")
    }
}

