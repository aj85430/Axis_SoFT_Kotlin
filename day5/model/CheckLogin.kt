package day5.model

import day5.dao.conn
import day5.dao.connectionClose
import day5.dao.getConnection1
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.util.*

class CheckLogin {
    fun display(): Boolean
    {
        getConnection1()
        var sc= Scanner(System.`in`)
        println("Enter User Name:");
        var uid1 = sc.next()
        sc.nextLine()
        println("Enter Password:");
        var pswrd1 = sc.next();
        sc.nextLine()

        var flag = false
        var sql = "Select UserName, Password from users";

        var statement: PreparedStatement? = conn!!.prepareStatement(sql);
        var rs: ResultSet = statement!!.executeQuery(sql)

       while (rs.next()) {
            val staffname: String = rs.getString("UserName")
            val password: String = rs.getString("Password")

            if ((uid1.equals(staffname)) && (pswrd1.equals(password))) {
                flag = true;

            } else {
                flag=false
            }

        }
        return flag
        connectionClose()
    }
}

