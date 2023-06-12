package com.wmm
package mixin

/**
 * 新的类RichStringIter有一个父类StringIterator和一个混入RichIterator。如果是单一继承，我们将不会达到这样的灵活性
 */
object StringIteratorTest extends App {
  class RichStringIter extends StringIterator("Scala") with RichIterator
  val richStringIter = new RichStringIter
  richStringIter foreach println
}
