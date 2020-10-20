package day5.model

import day5.dao.issueBook
//import sun.security.jgss.GSSUtil.login
import java.util.*

fun main() {

    var sc = Scanner(System.`in`)
    println("-------------Welcome to the LMS Portal-------------")
    println("---------------------------------------------------")
    println("1: Librarian Login \n2: Student Login \n3: Student Register \n4: Exit")
    println("---------------------------------------------------")
    println("Enter your choice:")
    var choice = sc.nextInt()
    var b= Book()
    var u=Users()
    var i= Issuebook()
    when (choice) {
        1 -> {
            var pswd = "root";
            var id = "root";

            println("Enter Username:");
            var id1 = sc.next()
            println("Enter Password:");
            var pswd1 = sc.next();

            if (!id.equals(id1))
                println("Invalid Userid");
            else if (!pswd.equals(pswd1))
                println("Invalid Password");
            else
            {
                println("Login successfully");
                var e2 = false;
                while (e2 == false)
                {
                    println("---------------------------------");
                    println("1. Add book ");
                    println("2. Delete book  ");
                    println("3. Update book ");
                    println("4. View Books ");
                    println("5. View Users")
                    println("6. View Issued Books")
                    println("7. Delete a user")
                    println("8. Exit");
                    println("---------------------------------");

                    println("Enter Your Choice:");
                    var choice1 = sc.nextInt();

                    when(choice1)
                    {
                        1-> b.addbook()
                        2-> b.deletebook()
                        3-> b.updatebook()
                        4-> b.viewbooks()
                        5-> u.viewUsers()
                        6-> i.viewIssued()
                        7-> u.deleteUser()
                        8-> {e2=true
                        println("Exit Successfully")
                        }
                    }
                }

            }

        }

        2-> {

            var c= CheckLogin()
            var f= c.display()
            if(f==false){
                println("Wrong username and Password. Try Again.")
            }
             else
            { var e3=false;
             println("Login succesfully");
             while(e3==false)
            {
               println("-------------------------------------" );
               println("1: Issue a book ");
               println("2: Return a book ");
               println("3: View all books ")
               println("4: View Issued books ")
               println("5: Change Password")
               //println("6: View Profile")
               println("6: Exit");
               println("-------------------------------------" );

               println("\nEnter Your choice:");
               var choice2= sc.nextInt();

               when(choice2) {
                   1 -> i.issuebook()
                   2 -> i.returnbook()
                   3 -> b.viewbooks()
                   4->  i.viewIssuedbyUser()
                   5->  u.changePassword()
                   6 -> {
                       e3 = true
                       println("Exit Successfully")
                   }
               }
               }
            }
        }

        3->
        {
            u.addUser()

        }
    }
}

