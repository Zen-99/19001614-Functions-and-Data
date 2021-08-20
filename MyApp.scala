

object MyApp extends App{
   val x=new Rational(3,4);
   val y=new Rational(5,8);
   val z=new Rational(2,7);
   //print(x.sub(y).sub(z));
   
   val from=new Account("2",123,5000)
   val to=new Account("1",456,5000)
   
   
   from.transfer(to, 500)
   println(from)
   println(to)
   
   
   val find=(balance:List[Account])=>balance.filter(_.bal<0)
   val balance=(balance:List[Account])=>balance.map(x=>(x,x.bal)).reduce((y,z)=>(z._1,y._2+z._2))
   val interest=(balance:List[Account])=>balance.map(x=>{
     x.bal match{
       case value if value >=0 => x.deposit(x.bal*0.05)
       case _ => x.withdraw(Math.abs(x.bal)*0.01)
     }
   })
   
   val a=new Account("3",111,5000)
   val b=new Account("4",112,-500)
   val c=new Account("5",113,5000)
   val d=new Account("6",114,-100)
   var bank:List[Account]=List(a,b,c,d)
   
   println(find(bank))
   println(balance(bank)._2)
   
   interest(bank)
   println(balance(bank)._2)
   
}