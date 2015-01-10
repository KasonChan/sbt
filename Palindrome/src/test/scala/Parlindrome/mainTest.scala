import Palindrome.main._  

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class mainTest extends FlatSpec with ShouldMatchers {
  "Ana" should " be a palindrome" in {
    isPalindrome("Ana") should be(true)
  }

  "A man, a plan, a canal -- Panama" should " be a palindrome" in {
    isPalindrome("A man, a plan, a canal -- Panama") should be(true)
  }

  "Noel sees Leon." should " be a palindrome" in {
    isPalindrome("Noel sees Leon.") should be(true)
  }
}