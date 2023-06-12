package com.wmm
package trait1.abstracttype

trait Buffer {
  /**
   * 抽象类型成员
   * 实际类型由具体实现来确定
   */
  type T
  val element: T
}
