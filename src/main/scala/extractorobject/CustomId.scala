package com.wmm
package extractorobject

import scala.util.Random

/**
 * 提取器对象是一个包含有 unapply 方法的单例对象。apply 方法就像一个构造器，接受参数然后创建一个实例对象，反之 unapply 方法接受一个实例对象然后返回最初创建它所用的参数。提取器常用在模式匹配和偏函数中。
 */
object CustomId {
  def apply(name: String): String = s"$name--${Random.nextLong()}"

  def unapply(customId: String): Option[String] = {
    val strArr: Array[String] = customId.split("--")
    if (strArr.tail.nonEmpty) Some(strArr.head) else None
  }

  def main(args: Array[String]): Unit = {
    //当我们调用 CustomerID("Sukyoung") ，其实是调用了 CustomerID.apply("Sukyoung") 的简化语法
    val customerId = CustomId("Sukyoung")
    customerId match {
      //当我们调用 case CustomerID(name) => println(name)，就是在调用提取器(unapply)方法。
      case CustomId(name) => println(name)
      case _ => println("Could not extract a customerId")
    }

    val customId1 = CustomId("jordan")
    var CustomId(name) = customId1
    println(name)
    //因为变量定义可以使用模式引入变量，提取器可以用来初始化这个变量，使用 unapply 方法来生成值上面的代码等价于
    name = CustomId.unapply("jordan--1234").get
    println(name)
  }
}
