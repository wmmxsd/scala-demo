package com.wmm
package regex

import scala.util.matching.Regex

object Demo {
  def main(args: Array[String]): Unit = {
    match0()
    match1()
  }

  private def match0(): Unit = {
    val pattern = "[0-9]".r
    pattern.findFirstMatchIn("abcdefghijklmnopqrstuvwxyz") match {
      case Some(_) => println("ok")
      case None => println("error")
    }
  }

  private def match1(): Unit = {
    val keyValPattern: Regex = "([0-9a-zA-Z-#() ]+): ([0-9a-zA-Z-#() ]+)".r

    val input: String =
      """background-color: #A03300;
        |background-image: url(img/header100.png);
        |background-position: top center;
        |background-repeat: repeat-x;
        |background-size: 2160px 108px;
        |margin: 0;
        |height: 108px;
        |width: 100%;""".stripMargin
    println(input)

    for (patternMatch <- keyValPattern.findAllMatchIn(input))
      println(s"key: ${patternMatch.group(1)} value: ${patternMatch.group(2)}")
  }
}
