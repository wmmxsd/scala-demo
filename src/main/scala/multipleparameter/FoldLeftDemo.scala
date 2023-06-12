package com.wmm
package multipleparameter

/**
 * 多参数列表
 */
object FoldLeftDemo extends App{
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  //多参数函数比单一参数函数更加简洁
  println(numbers.foldLeft(0)((x, y) => x + y))
  //如果foldLeft是单一参数函数那么调用时是这样的numbers.foldLeft(0, (x: Int, y:Int) =>  x + y);
  //可以利用scala的类型推断来让代码更加简洁
  println(numbers.foldLeft(0)(_ + _))
}
