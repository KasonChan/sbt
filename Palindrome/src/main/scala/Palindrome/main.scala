package Palindrome

object main {
  def isPalindrome(word: String) = {
    val w = word.toLowerCase.replaceAll("[^a-z0-9]", "")
    val r = w.reverse
    w == r
  }

  def main(args: Array[String]): Unit = {
    val input = args.mkString

    println("Is " + input + " a palindrome? " + isPalindrome(input))
  }
}