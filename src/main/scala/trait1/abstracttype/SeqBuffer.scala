package com.wmm
package trait1.abstracttype

abstract class SeqBuffer extends Buffer {
  /**
   * 增加一个类型上边界U来让抽象类型T更具体
   */
  type U
  type T <: Seq[U]
  def length: Int = element.length
}
