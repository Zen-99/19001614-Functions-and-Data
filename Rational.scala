

class Rational(x:Int,y:Int) {
  def numerator=x;
  def denominator=y;
  def neg=new Rational(-this.numerator,this.denominator)
  def sub(r:Rational)= new Rational(this.numerator * r.denominator - r.numerator * this.denominator,this.denominator * r.denominator)
 
  override def toString=numerator + "/" + denominator
}