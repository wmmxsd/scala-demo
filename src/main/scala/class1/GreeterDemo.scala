package com.wmm
package class1

object GreeterDemo {
  def main(args: Array[String]): Unit = {
    //你可以使用new关键字创建一个类的实例
    val greeter = new Greeter("hello", "!")
    greeter.greet("scala")
    //主构造方法中不带val或var的参数是私有的，仅在类中可见
    //greeter.prefix
    println(greeter.toString)

    greeter.x = 10
    greeter.y = 10

    println(greeter.x)
    println(greeter.y)

  }
}
