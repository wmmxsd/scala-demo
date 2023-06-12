package com.wmm
package generic.contravariance

import generic.{Animal, Cat}


/**
 * 逆变
 * 通过使用注释 -A，可以使一个泛型类的类型参数 A 成为逆变。 与协变类似，这会在类及其类型参数之间创建一个子类型关系，但其作用与协变完全相反。
 * 对于某个类 class Writer[-A] ，使 A 逆变意味着对于两种类型 A 和 B，如果 A 是 B 的子类型，那么 Writer[B] 是 Writer[A] 的子类型。
 */
object ContravarianceTest extends App {
  val myCat: Cat = Cat("Boots")

  def printMyCat(printer: Printer[Cat]): Unit = {
    printer.print(myCat)
  }

  val catPrinter: Printer[Cat] = new CatPrinter
  val animalPrinter: Printer[Animal] = new AnimalPrinter

  printMyCat(catPrinter)
  printMyCat(animalPrinter)
}
