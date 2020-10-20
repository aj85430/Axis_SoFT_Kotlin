package assignment


class Account(id:Int, type:String, name:String){
    var acctId:Int=0
    var acct_type:String=""
    var name:String=""

    init {
        this.acctId= id
        this.acct_type= type
        this.name=name
    }

    fun output() {

         println("Account id is: $acctId")
         println("Account type is: $acct_type")
         println("Name is: $name")
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