package com.wmm
package trait1.demo2

/**
 *  泛型迭代器
 * @tparam E 泛型
 */
trait Iterator[E] {
  def hasNext: Boolean
  def next(): E
}
