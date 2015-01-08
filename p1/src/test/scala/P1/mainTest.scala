import P1.main._

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class mainTest extends FlatSpec with ShouldMatchers {
  it should "sum(1, 1) = 2" in {
    sum(1, 1) should be(2)
  }
}