package com.wmm
package expression

object Demo {
  def main(args: Array[String]): Unit = {
    //println来输出表达式的结果
    println(1 + 1)

    //常量用val来定义
    val x = 1 + 1
    println(x)
    //常量的类型可以被推断，或者你也可以显式地声明类型
    val y: Int = 3
    //常量不能被重新赋值
    //x = 3

    //变量用var来定义
    //变量的类型可以被推断，或者你也可以显式地声明类型
    var z: Int = 2
    z = 3
    println(z)
  }
}
