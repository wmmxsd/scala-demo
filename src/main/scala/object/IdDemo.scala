package com.wmm
package `object`

object IdDemo {
  def main(args: Array[String]): Unit = {
    //通过引用对象的名字来访问一个对象
    println(IdFactory.create)
  }
}
