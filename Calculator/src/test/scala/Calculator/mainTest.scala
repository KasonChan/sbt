import Calculator.main._

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class mainTest extends FlatSpec with ShouldMatchers {
  it should "plus(1)(1) = 2" in {
    plus(1)(1) should be(2)
  }

  it should "plus(7)(5) = 12" in {
    plus(7)(5) should be(12)
  }

  it should "plus(-1)(0) = -1" in {
    plus(-1)(0) should be(-1)
  }

  it should "minus(-1)(0) = -1" in {
    minus(-1)(0) should be(-1)
  }

  it should "time(-2)(-5) = 10" in {
    time(-2)(-5) should be(10)
  }

  it should "time(5)(6) = 30" in {
    time(5)(6) should be(30)
  }

  it should "divide(10)(0) = 0" in {
    divide(10)(0) should be(0)
  }

  it should "divide(7)(2) = 3.5" in {
    divide(7)(2) should be(3.5)
  }

  it should "minus(plus(divide(7)(2))(5))(9) = -0.5 " in {
    minus(plus(divide(7)(2))(5))(9) should be(-0.5)
  }
}