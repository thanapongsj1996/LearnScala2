package playground

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }
//  println("factorial(10) : " + factorial(10))
//    println(factorial(5000)) // Stack overflow error

  def anotherFactorial(n: Int): BigInt = {

    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)
    }

    factHelper(n, 1)
  }
//  println("anotherFactorial(10) : " + anotherFactorial(10))
//  println("anotherFactorial(500) : " + anotherFactorial(5000))

  def concatStringNTimes(aString: String, n: Int): String = {
    @tailrec
    def helper(x: Int, accumulator: String): String = if (x != 0) helper(x-1, accumulator + aString) else accumulator
    helper(n, "")
  }
  println(concatStringNTimes("Boy", 3))

  def isPrime(n: Int): Boolean = {
    val endNum = Math.sqrt(n).toInt

    @tailrec
    def helper(i: Int): Boolean = {
      if (i > endNum) true
      else if (n % i == 0) false
      else helper(i + 1)
    }

    helper(2)
  }
  println(isPrime(1))
  println(isPrime(2))
  println(isPrime(16))
  println(isPrime(17))

  val dp = Seq(1,2,3)
//  println(dp(0))
//  println(dp(1))
//  println(dp(2))

//  1 2 3 4 5 6  7  8
//  1 1 2 3 5 8 13 21
  def fibo(n: Int): Int = {
    @tailrec
    def helper(i: Int, afterLast: Int, last: Int): Int = {
      if (n <= 2) 1
      else if (i >= n) last + afterLast
      else helper(i + 1, last, last + afterLast)
    }

    helper(i = 3, 1, 1)
  }
  println(fibo(1))
  println(fibo(2))
  println(fibo(5))
  println(fibo(8))
}
