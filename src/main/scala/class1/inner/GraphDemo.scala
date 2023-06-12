package com.wmm
package class1.inner

object GraphDemo extends App {
  val graph = new Graph
  val node1 = graph.newNode
  val node2 = graph.newNode
  val node3 = graph.newNode
  node1.connectTo(node2)
  node3.connectTo(node1)

  val graph1 = new Graph
  val node4 = graph1.newNode
  val node5 = graph1.newNode

  node4.connectTo(node5)
  //编译报错
  //类型 graph.Node与类型graph1.Node完全不同
  //node4.connectTo(node1)

  //如果想内部类不和外部类的实例化对象绑定的话，我们需要给内部类的方法和字段加上“#”号
  node1.connectTo1(node4)
}
