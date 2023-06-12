package com.wmm
package patternmatch.demo3

/**
 * 特质（trait）和类（class）可以用sealed标记为密封的，这意味着其所有子类都必须与之定义在相同文件中，从而保证所有子类型都是已知的
 */
//Illegal inheritance from sealed trait 'Eat'
//case class EatApple() extends Eat {}
case class EatApple() extends EatFood