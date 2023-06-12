package com.wmm
package class1.inner

/**
 *  图形数据类型
 *  包含内部类，但是scala的内部类是绑定到外部类的实例化对象上的
 */
class Graph {
  var nodes: List[Node] = Nil

  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }

  class Node {
    var connectedNodes: List[Node] = Nil

    def connectTo(node: Node): Unit = {
      if (!connectedNodes.exists(node.equals)) {
        connectedNodes = node :: connectedNodes
      }
    }

    var connectedNodes1: List[Graph#Node] = Nil

    def connectTo1(node: Graph#Node): Unit = {
      if (!connectedNodes1.exists(node.equals)) {
        connectedNodes1 = node :: connectedNodes1
      }
    }
  }
}


