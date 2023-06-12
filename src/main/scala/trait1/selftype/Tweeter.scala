package com.wmm
package trait1.selftype

/**
 * 自类型用于声明一个特质必须混入其他特质，尽管该特质没有直接extends其他特质
 * 要在特质中使用自类型，写一个标识符，跟上要混入的另一个特质，以及 =>（例如test: User =>）。
 */
trait Tweeter {
  test: User =>
  //String变量 username 可以在 tweet 方法内使用
  def tweet(tweetText: String): Unit = println(s"${username()}:$tweetText")
}
