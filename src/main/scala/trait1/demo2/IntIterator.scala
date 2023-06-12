package com.wmm
package trait1.demo2

class IntIterator(size: Int) extends Iterator[Int] {
  private var current = 0

  override def hasNext(): Boolean = current < size

  override def next(): Int = {
    if (hasNext()) {
      val t = current
      current += 1
      t
    } else 0
  }
}
