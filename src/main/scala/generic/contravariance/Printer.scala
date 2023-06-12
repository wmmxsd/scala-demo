package com.wmm
package generic.contravariance

abstract class Printer[-A] {
  def print(value: A): Unit
}
