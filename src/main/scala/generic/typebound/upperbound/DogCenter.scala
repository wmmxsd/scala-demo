package com.wmm
package generic.typebound.upperbound

import generic.Dog

class DogCenter[P <: Dog](dog: Dog) {
  def dog(): Dog = dog
}
