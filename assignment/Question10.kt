package assignment


class Account1{
    var acctId:Int=0
    var acct_type:String=""
    var Name:String=""

   constructor(id: Int, type: String, name: String)
   {
       acctId=id
       acct_type=type
       Name=name

       println("Account id is: $acctId")
       println("Account type is: $acct_type")
       println("Name is: $Name")

   }


}
fun main(args: Array<String>)
{
    val a= Account(101, "Deposit Account", "Aman")
    val b= Account(102, "Savings Account", "Manish")
    val c= Account(103, "NRI Account", "Charan")
    val d= Account(104, "Current Account", "Param")
    val e= Account(105, "Deposit Account", "Anjali")
    a.output()
    b.output()
    c.output()
    d.output()
    e.output()
}