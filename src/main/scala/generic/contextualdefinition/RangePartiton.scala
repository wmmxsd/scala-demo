package com.wmm
package generic.contextualdefinition

import scala.reflect.ClassTag

class RangePartiton[K: Ordering : ClassTag](k1: K, k2: K) {
  def getter: K = {
    //这句话就是会发生隐式转换，获取到隐式值intOrder
    val comparator = implicitly[Ordering[K]]
    if (comparator.compare(k1, k2) > 0) k1 else k2
  }

  def getter1: K = {
    def f1(implicit cmptor: Ordering[K]) = cmptor.compare(k1, k2)
    if (f1 > 0) k1 else k2
  }

}
