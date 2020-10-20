package day5.dao

import java.sql.*
import java.util.*
var conn: Connection? = null
fun getConnection1() {
    var connectionProps = Properties()
    connectionProps.put("user", "root")
    connectionProps.put("password", "aman85430@")
    try {
        //Class.forName("com.mysql.jdbc.Driver").newInstance()
        conn = DriverManager.getConnection(
                "jdbc:" + "mysql" + "://" +
                        "localhost" +
                        ":" + "3306" + "/" +
                        "",
                connectionProps)
        if (conn != null) {
           // println("Connected successfully")
            var stmt: Statement? = null
            try {
                stmt = conn!!.createStatement()
                //resultset = stmt!!.execute("create database sampledb1;")
                //var b=stmt!!.execute("create database sampledb1")
                if (stmt.execute("use library;")) {
                    println("library connected")
                } else {
                  //  println("Not connected")
                }
            }catch(e:Exception){
                println("Sampledb not connected")
            }
        }
    } catch (ex: SQLException) {
        // handle any errors
        ex.printStackTrace()
    } catch (ex: Exception) {
        // handle any errors
        ex.printStackTrace()
    }
}

fun connectionClose()
{
    conn?.close()
}