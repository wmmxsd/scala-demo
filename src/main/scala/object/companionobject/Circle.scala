package com.wmm
package `object`.companionobject

import scala.math.{Pi, pow}

/**
 * 当一个单例对象和某个类共享一个名称时，这个单例对象称为 伴生对象。 同理，这个类被称为是这个单例对象的伴生类。类和它的伴生对象可以互相访问其私有成员。使用伴生对象来定义那些在伴生类中不依赖于实例化对象而存在的成员变量或者方法。
 * 本例中Circle样例类和Circle对象互相伴生，Circle样例类可以调用Circle对象的私有方法calculateArea，Circle对象可以使用Circle样例对象的构造参数radius
 */
case class Circle(radius: Double) {
  import Circle._

  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)

  def main(args: Array[String]): Unit = {
    val circle1 = Circle(5.0)
    circle1.area
  }
}
