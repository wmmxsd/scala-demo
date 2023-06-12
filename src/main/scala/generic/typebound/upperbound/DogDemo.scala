package com.wmm
package generic.typebound.upperbound

import generic.Dog

object DogDemo extends App {
  val dogCenter: DogCenter[Dog] = new DogCenter[Dog](Dog("eba"))
  val huskyCenter: DogCenter[Husky] = new DogCenter[Husky](new Husky("tutu"))
  //DogCenter必须接受一个Dog的子类
//  val catCenter: DogCenter[Cat] = new DogCenter[Cat](new Cat("jindoudou"))
}
