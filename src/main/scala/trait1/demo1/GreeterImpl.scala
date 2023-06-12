package com.wmm
package trait1.demo1

object GreeterImpl {
  def main(args: Array[String]): Unit = {
    val defaultGreeter = new DefaultGreeter("hello", "!")
    defaultGreeter.greet("scala")
    defaultGreeter.greetTom()
  }
}
