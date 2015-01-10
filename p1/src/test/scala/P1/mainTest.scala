import P1.main._

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class mainTest extends FlatSpec with ShouldMatchers {
  it should "sum(1, 1) = 2" in {
    sum(1, 1) should be(2)
  }

  it should "sum(7, 5) = 12" in {
    sum(7, 5) should be(12)
  }

  it should "sum(-1, 0) = -1" in {
    sum(-1, 0) should be(-1)
  }
}