package com.wmm
package trait1.demo1

class DefaultGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = println(prefix + " " + name + postfix)

  override def greetTom(): Unit = super.greetTom()
}
