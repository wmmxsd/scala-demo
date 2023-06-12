package com.wmm
package method

object MethodDemo {
  //方法由def关键字定义。
  //def 方法名(参数名: 参数类型): 返回类型 = {
  // todo
  // }
  def main(args: Array[String]): Unit = {
    println(add(1, 2))
    println(addThenMultiply(1, 2)(3))
    println(name)
    println(getSquareString(2.5))
  }

  /**
   * 加法
   * @param x 加数
   * @param y 加数
   * @return 和
   */
  def add(x: Int, y: Int): Int = x + y

  /**
   * 方法可以接受多个参数列表
   * @param x 加数
   * @param y 加数
   * @param multiply 乘数
   * @return 结果
   */
  def addThenMultiply(x: Int, y: Int)(multiply: Int): Int = {
    (x + y) * multiply
  }

  /**
   * 方法可以不带参数
   * @return
   */
  def name: String = {
    "David"
  }

  /**
   * 方法也可以有多行的表达式
   */
  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
}
