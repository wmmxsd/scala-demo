package com.wmm
package generic.contravariance

import generic.Cat


class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}