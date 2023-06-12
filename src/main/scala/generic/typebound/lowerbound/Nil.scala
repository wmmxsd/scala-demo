package com.wmm
package generic.typebound.lowerbound

case class Nil[+B]() extends Node[B] {
  //def prepend(elem: B): ListNode[B] = ListNode(elem, this)
  def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem, this)
}
