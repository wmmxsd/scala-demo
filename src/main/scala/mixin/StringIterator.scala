package com.wmm
package mixin

class StringIterator(content: String) extends AbsIterator {
  override type T = Char

  private var index: Int = 0;

  override def hasNext: Boolean = index < content.length

  override def next: Char = {
    val ch = content charAt index
    index += 1
    ch
  }
}
