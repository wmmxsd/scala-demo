package com.wmm
package generic

object StackDemo {
  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    println(stack.peek)
    stack.push(2)
    println(stack.peek)
    println(stack.pop())
    println(stack.pop())
  }
}
