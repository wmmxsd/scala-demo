package com.wmm
package trait1.demo1

/**
 * 特质 (Traits) 用于在类 (Class)之间共享程序接口 (Interface)和字段 (Fields)。
 * 它们类似于Java 8的接口。 类和对象 (Objects)可以扩展特质，但是特质不能被实例化，因此特质没有参数
 */
trait Greeter {
  def greet(name: String): Unit

  def greetTom(): Unit = println("hello tom")
}
