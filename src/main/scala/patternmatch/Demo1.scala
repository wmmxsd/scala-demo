package com.wmm
package patternmatch

import scala.util.Random

/**
 * 模式匹配是检查某个值（value）是否匹配某一个模式的机制，一个成功的匹配同时会将匹配值解构为其组成部分。它是Java中的switch语句的升级版，同样可以用于替代一系列的 if/else 语句
 */
object Demo1 {
  def main(args: Array[String]): Unit = {
    matchTest(Random.nextInt(10))
    matchTest1(Random.nextInt(10))
  }

  def matchTest(x: Int): Boolean = x match {
    case 0 => true
    case 1 => false
    case _ => false
  }

  def matchTest1(x: Int): Boolean = {
    if (x == 0) {
      true
    } else if (x == 1) {
      false
    } else false
  }
}
