package com.wmm
package generic.typebound.lowerbound

case class ListNode[+B](h: B, t: Node[B]) extends Node[B] {
  //def prepend(elem: B): ListNode[B] = ListNode(elem, this)
  def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem, this)
  //无参函数，所以没有出现上面的问题
  def head(): B = h
  def tail: Node[B] = t
}
