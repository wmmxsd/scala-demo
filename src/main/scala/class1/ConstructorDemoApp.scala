package com.wmm
package class1

object ConstructorDemoApp {
  def main(args: Array[String]): Unit = {
    val constructorDemo = new ConstructorDemo
    //主构造方法中带val或var的参数是公有的
    println(constructorDemo.x + " " + constructorDemo.y)

    //只给第一次参数x赋值，y为默认值0
    val constructorDemo1 = new ConstructorDemo(2)
    println(constructorDemo1.x + " " + constructorDemo1.y)

    //给x和y都赋值
    val constructorDemo2 = new ConstructorDemo(2, 1)
    println(constructorDemo2.x + " " + constructorDemo2.y)

    //只给第二个参数y赋值
    val constructorDemo3 = new ConstructorDemo(y = 3)
    println(constructorDemo3.x + " " + constructorDemo3.y)
  }
}
