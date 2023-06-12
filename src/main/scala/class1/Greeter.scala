package com.wmm
package class1

/**
 * 你可以使用class关键字定义一个类，后面跟着它的名字和构造参数
 * 主构造方法中不带val或var的参数是私有的，仅在类中可见
 *
 * @param prefix 前缀
 * @param suffix 后缀
 */
class Greeter(prefix: String, suffix: String) {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  //def x和def y方法用于访问私有数据。def x_=和def y_=是为了验证和给_x和_y赋值
  def x: Int = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning()
  }

  def y: Int = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning()
  }

  private def printWarning(): Unit = println("WARNING: Out of bounds")

  def greet(name: String): Unit = {
    println(prefix + " " + name + " " + suffix)
  }

  override def toString: String = s"($prefix, $suffix)"
}
