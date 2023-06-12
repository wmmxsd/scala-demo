package com.wmm
package mixin

/**
 * 抽象迭代器
 */
abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next: T
}
