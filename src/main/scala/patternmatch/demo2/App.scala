package com.wmm
package patternmatch.demo2

object App {
  def main(args: Array[String]): Unit = {
    goIdle(new Computer)
    goIdle(new Phone)
  }

  def goIdle(device: Device): Unit = device match {
      case c: Computer => c.screenSaverOn()
      case p: Phone => p.screenOff()
    }
}
