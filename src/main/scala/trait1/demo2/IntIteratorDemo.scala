package com.wmm
package trait1.demo2

object IntIteratorDemo {
  def main(args: Array[String]): Unit = {
    val iterator = new IntIterator(4);
    println(iterator.next())
    println(iterator.next())
    println(iterator.next())
    println(iterator.next())
    println(iterator.next())
  }
}
