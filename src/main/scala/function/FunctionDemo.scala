package com.wmm
package function

object FunctionDemo {
  def main(args: Array[String]): Unit = {
    //你可以定义一个匿名函数（即没有名字），来返回一个给定整数加一的结果
    //(x: Int) => x + 1;

    //给函数命名
    val addOne = (x: Int) => x + 1
    println(addOne(1))

    //函数可以带多个参数
    val add = (x: Int, y: Int) => x + y
    println(add(1, 2))

    //不带参数的函数
    val get = () => "hello world"
    println(get())
  }
}
