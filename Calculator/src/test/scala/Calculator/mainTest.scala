import Calculator.main._

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class mainTest extends FlatSpec with ShouldMatchers {
  "plus(1)(1)" should "= 2" in {
    plus(1)(1) should be(2)
  }

  "plus(7)(5)" should "= 12" in {
    plus(7)(5) should be(12)
  }

  "plus(-1)(0)" should "= -1" in {
    plus(-1)(0) should be(-1)
  }

  "minus(-1)(0)" should "= -1" in {
    minus(-1)(0) should be(-1)
  }

  "time(-2)(-5)" should "= 10" in {
    time(-2)(-5) should be(10)
  }

  "time(5)(6)" should "= 30" in {
    time(5)(6) should be(30)
  }

  "divide(10)(0)" should "= 0" in {
    divide(10)(0) should be(0)
  }

  "divide(7)(2)" should "= 3.5" in {
    divide(7)(2) should be(3.5)
  }

  "minus(plus(divide(7)(2))(5))(9)" should "= -0.5" in {
    minus(plus(divide(7)(2))(5))(9) should be(-0.5)
  }
}