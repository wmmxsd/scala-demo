package com.wmm

import class1.Greeter

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val greeter = new Greeter("hello", "!")
    greeter.greet("scala")
  }
}