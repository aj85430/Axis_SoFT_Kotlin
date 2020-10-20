package day5.model

import day5.dao.*
import java.util.*

class Users{

       var username:String=""
       var password:String=""


    fun addUser()
    {
        var sc= Scanner(System.`in`)
        getConnection1()
        println("Enter the user name")
        var username= sc.nextLine()
        println("Enter the password")
        var password=sc.nextLine()
        var b= insert1(username,password)
        connectionClose();
    }

    fun viewUsers()
    {
        getConnection1()
        println("Here are all the users...")
        var b = selectRecord1()
        connectionClose();
    }

    fun changePassword()
    {
        getConnection1()
        var sc= Scanner(System.`in`)
        println("Enter the user id")
        var uid= sc.nextInt()
        println("Enter the new password")
        var pass=sc.next()
        var b= PasswordChange(uid,pass)
    }

    fun deleteUser()
    {
        getConnection1()
        var sc= Scanner(System.`in`)
        println("Enter the user id")
        var uid=sc.nextInt()
        var b= UserDelete(uid)
    }

    fun userProfile()
    {
        getConnection1()
        var sc= Scanner(System.`in`)
        println("Enter the user id")
        var uid=sc.nextInt()
        var b= UserDelete(uid)
    }


}