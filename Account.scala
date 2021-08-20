

class Account(id:String,accNo:Int,balance:Double) {
  val nic:String=id
  val acnumber: Int = accNo
  var bal: Double = balance

  override def toString ="NIC:"+nic+" AccountNo:"+acnumber+" Balance:"+bal
  def withdraw(balance:Double) = this.bal=this.bal-balance
  def deposit(balance:Double) = this.bal=this.bal+balance
  def transfer(account:Account,balance:Double)= {
    this.withdraw(balance) ;
    account.deposit(balance);
  }
  
}