package com.wmm
package generic.normal

import generic.Cat


object ContainerDemo extends App {
  val catContainer: Container[Cat] = new Container(Cat("jerry"))
  //可能看起来一个 Container[Cat] 自然也应该是一个 Container[Animal]，但允许一个可变的泛型类成为协变并不安全。
  // 在这个例子中，Container 是不变的非常重要。 假设 Container 实际上是协变的，下面的情况可能会发生
  //下一行的代码无法通过编译，因为普通的泛型类不允许存在子类型继承关系
//  val animalContainer: Container[Animal] = catContainer
//  animalContainer.setValue(Dog("Spot"))
  val cat: Cat = catContainer.getValue
}
