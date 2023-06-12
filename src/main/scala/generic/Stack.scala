package com.wmm
package generic

class Stack[T] {
  private var elements: List[T] = Nil

  def push(x: T): Unit =
    elements = x :: elements

  def peek: T = elements.head

  def pop(): T = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}
