package com.wmm
package generic.typebound.lowerbound

trait Node[+B] {
  //下句的代码报错”Covariant type B occurs in contravariant position in type B of value elem“
  //方法 prepend 中的参数 elem 是协变的 B 类型。 这会出错，因为函数的参数类型是逆变的，而返回类型是协变的。
  //def prepend(elem: B): Node[B]

  //要解决这个问题，我们需要将方法 prepend 的参数 elem 的型变翻转。 我们通过引入一个新的类型参数 U 来实现这一点，该参数具有 B 作为类型下界
  // 正确写法
  def prepend[U >: B](elem: U): Node[U]
}
