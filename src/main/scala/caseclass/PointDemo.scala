package com.wmm
package caseclass

object PointDemo {
  //实例化样例类时无需new关键字
  val point: Point = Point(1, 2)
  val anotherPoint: Point = Point(1, 2)
  val yetAnotherPoint: Point = Point(2, 2)

  def main(args: Array[String]): Unit = {
    if (point == anotherPoint) {
      println(s"$point and $anotherPoint are the same.")
    } else {
      println(s"$point and $anotherPoint are different.")
    }

    if (point == yetAnotherPoint) {
      println(s"$point and $yetAnotherPoint are the same.")
    } else {
      println(s"$point and $yetAnotherPoint are different.")
    }

    //样例类的构造参数是公开的val类型
    println(s"x = ${point.x}, y = ${point.y}")

    //样例类在比较的时候是按值比较而非按引用比较
    println(point == anotherPoint)

    //你可以通过copy方法创建一个样例类实例的浅拷贝，同时可以指定构造参数来做一些改变
    val point1 = point.copy(y = 3)
    println(point1)
  }
}
