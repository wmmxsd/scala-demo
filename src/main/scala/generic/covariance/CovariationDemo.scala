package com.wmm
package generic.covariance

import generic.{Animal, Cat, Dog}

/**
 * 使用注释 +A，可以使一个泛型类的类型参数 A 成为协变。 对于某些类 class List[+A]，使 A 成为协变意味着对于两种类型 A 和 B，如果 A 是 B 的子类型，那么 List[A] 就是 List[B] 的子类型。 这允许我们使用泛型来创建非常有用和直观的子类型关系
 */
object CovariationDemo extends App{
  def printAnimalNames(animals: List[Animal]): Unit = animals.foreach((animal: Animal) => println(animal.name))
  //类型 Cat 和 Dog 都是 Animal 的子类型。 Scala 标准库有一个通用的不可变的类 sealed abstract class List[+A]，其中类型参数 A 是协变的。
  // 这意味着 List[Cat] 是 List[Animal]，List[Dog] 也是 List[Animal]。 直观地说，猫的列表和狗的列表都是动物的列表是合理的，你应该能够用它们中的任何一个替换 List[Animal]。
  val cats: List[Animal] = List(Cat("jerry"), Cat("doudou"))
  val dogs: List[Animal] = List(Dog("wangcai"), Dog("ad"))
  printAnimalNames(cats)
  printAnimalNames(dogs)
}
