package com.wmm
package generic.contravariance

import generic.Animal


class AnimalPrinter extends Printer[Animal] {
  def print(animal: Animal): Unit =
    println("The animal's name is: " + animal.name)
}
