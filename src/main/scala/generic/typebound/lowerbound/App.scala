package com.wmm
package generic.typebound.lowerbound

import generic.{Animal, Cat, Dog}

object App extends App {
 val dogList = ListNode[Dog](Dog("123"), Nil())
  val animalList: ListNode[Animal] = dogList
  animalList.prepend(Cat("123"))
}
