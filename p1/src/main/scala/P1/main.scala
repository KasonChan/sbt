package P1

object main {
  def main(args: Array[String]): Unit = {
    println("9 + 5 = " + plus(9)(5))
    println("10 - 13 = " + minus(10)(13))
    println("2 * 8 = " + time(2)(8))
    println("8 / 2 = " + divide(8)(2))
  }

  def plus(x: Double)(y: Double): Double = x + y

  def minus(x: Double)(y: Double): Double = x - y

  def time(x: Double)(y: Double): Double = x * y

  def divide(x: Double)(y: Double): Double = {
    if (y == 0) 0
    else x / y
  }
}