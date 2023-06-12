package com.wmm
package Implicitarguement

object ImplicitTest {
  //implicit 关键字表示可以隐式使用相应的对象
  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    def add(x: String, y: String): String = x concat y

    def unit: String = ""
  }

  //implicit 关键字表示可以隐式使用相应的对象
  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y

    def unit: Int = 0
  }

  //不带implicit
  val floatMonoid: Monoid[Float] = new Monoid[Float] {
    override def add(x: Float, y: Float): Float = x + y

    override def unit: Float = 0F
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3))) // uses IntMonoid implicitly
    println(sum(List("a", "b", "c"))(stringMonoid)) // uses StringMonoid implicitly
    println(sum[Float](List(1.11F, 2.22F, 3.33F))(floatMonoid))
  }
}
