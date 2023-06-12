package com.wmm
package generic.contextualdefinition

import generic.Dog

/**
 * 上下文界定Demo
 * 隐式参数的语法糖，就是设置一个隐式值，到时候会自动匹配
 */
object ContextualDefinitionDemo extends App {
  implicit val  dogOrder: Ordering[Dog] = (p1: Dog, p2: Dog) => p1.name.hashCode - p2.name.hashCode
  val demo = new RangePartiton[Dog](Dog("1"), Dog("2"))
  println(demo.getter)
  println(demo.getter1)
}
