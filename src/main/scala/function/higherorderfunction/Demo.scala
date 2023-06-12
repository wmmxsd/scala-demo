package com.wmm
package function.higherorderfunction

object Demo extends App{
  val salaries = Seq(10000, 12000, 30000)
  val doubleSalary = (x: Int) => x * 2
  //函数doubleSalary被应用在列表salaries中的每一个元素
  val newSalaries = salaries.map(doubleSalary)
  println(newSalaries)

  //为了简化压缩代码，我们可以使用匿名函数，直接作为参数传递给map
  println(salaries.map((salary: Int) => salary * 2))

  println(salaries.map(salary => salary * 2))
  //注意在上述示例中x没有被显式声明为Int类型，这是因为编译器能够根据map函数期望的类型推断出x的类型。对于上述代码，一种更惯用的写法为
  println(salaries.map(_ * 2))
  //既然Scala编译器已经知道了参数的类型（一个单独的Int），你可以只给出函数的右半部分，不过需要使用_代替参数名

  //强制转换方法为函数
  //在这个例子中，方法convertCtoF被传入forecastInFahrenheit。这是可以的，因为编译器强制将方法convertCtoF转成了函数x => convertCtoF(x) （注: x是编译器生成的变量名，保证在其作用域是唯一的）。
  def convertCtoF(temp: Double) = temp * 1.8 + 32
  def forecastInFahrenheit: Seq[Double] = Seq(1000D, 2000D).map(convertCtoF)

  //接收函数作为参数的函数
  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion1(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def bigPromotion1(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion1(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)

  //返回函数的函数
  //注意urlBuilder的返回是一个函数：(String, String) => String，
  //这意味着返回的匿名函数有两个String参数，返回一个String。
  //在这个例子中，返回的匿名函数是(endpoint: String, query: String) => s"https://www.example.com/$endpoint?$query"。
  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  val domainName = "www.example.com"
  def getURL = urlBuilder(ssl = true, domainName)
  val endpoint = "users"
  val query = "id=1"
  println(getURL(endpoint, query))
}
