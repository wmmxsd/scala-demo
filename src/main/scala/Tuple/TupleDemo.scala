package com.wmm
package Tuple

import java.time.LocalDateTime

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val tuple3 = (1, "tom", 25)
    println(tuple3._1)
    println(tuple3._2)
    println(tuple3._3)

    val tuple4 = (1, "tom", 25, LocalDateTime.now()):(Long, String, Int, LocalDateTime)
    println(tuple4.toString())


    val order = List((1, "tom", 25), (2, "tom", 26), (3, "james", 100));
    for ((_, name, price) <- order) {
      println(name, price)
    }
  }
}
