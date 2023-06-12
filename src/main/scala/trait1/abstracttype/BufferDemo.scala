package com.wmm
package trait1.abstracttype

object BufferDemo {
  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer = {
    new IntSeqBuffer {
      override type T = List[Int]
      override val element: List[Int] = List(elem1, elem2)
    }
  }

  def main(args: Array[String]): Unit = {
    val intSeqBuffer = newIntSeqBuf(1, 2)
    println("length = " + intSeqBuffer.length)
    println("content = " + intSeqBuffer.element)
  }
}
