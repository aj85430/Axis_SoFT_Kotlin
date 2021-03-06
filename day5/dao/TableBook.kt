package day5.dao

import java.sql.*
import java.util.Properties
/**
 * Program to list databases in MySQL using Kotlin
 */
object MySQLDatabaseExampleKotlin {
    internal var conn: Connection? = null
    internal var username = "root" // provide the username
    internal var password = "aman85430@" // provide the corresponding password
    @JvmStatic fun main(args: Array<String>) {
        // make a connection to MySQL Server
        getConnection()
        // execute the query via connection object
        executeMySQLQuery()
    }
    fun executeMySQLQuery() {
        var stmt: Statement? = null
        var resultset: ResultSet? = null
        try {
            stmt = conn!!.createStatement()
            //resultset = stmt!!.execute("create database sampledb1;")
           // var b=stmt!!.execute("create database Library")
            stmt.executeUpdate("use Library")
            stmt.executeUpdate("CREATE TABLE BOOKS(BookId INT NOT NULL AUTO_INCREMENT PRIMARY KEY, BookName VARCHAR(50), Author VARCHAR(50), Price INT)");
            stmt.executeUpdate("ALTER TABLE BOOKS AUTO_INCREMENT=1001")
            stmt.executeUpdate("INSERT INTO BOOKS(BookName, Author, Price) VALUES ('The Castle', 'Franz Kalka', 200),  ('Man and Superman', 'G. B. Shaw', 300), ('Time Machine','H.G. Wells', 150), ('The Clown', 'Heinrich Boll', 250), ('My Truth','Indira Gandhi', 350), ('Mother India','Katharin Mayo', 700),('Principia','Issac Newton', 540)");


            if (stmt.execute("SHOW DATABASES;")) {
                resultset = stmt.resultSet
            }
            while (resultset!!.next()) {
                println(resultset.getString("Database"))
            }
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } finally {
            // release resources
            if (resultset != null) {
                try {
                    resultset.close()
                } catch (sqlEx: SQLException) {
                }
                resultset = null
            }
            if (stmt != null) {
                try {
                    stmt.close()
                } catch (sqlEx: SQLException) {
                }
                stmt = null
            }
            if (conn != null) {
                try {
                    conn!!.close()
                } catch (sqlEx: SQLException) {
                }
                conn = null
            }
        }
    }
    /**
     * This method makes a connection to MySQL Server
     * In this example, MySQL Server is running in the local host (so 127.0.0.1)
     * at the standard port 3306
     */
    fun getConnection() {
        val connectionProps = Properties()
        connectionProps.put("user", username)
        connectionProps.put("password", password)
        try {
            // Class.forName("com.mysql.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "localhost" +
                            ":" + "3306" + "/" +
                            "",
                    connectionProps)
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }
    }
}