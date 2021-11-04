package playground

object s2e4Function extends App {
  def aFunction(): String = "Hello"

  println(aFunction())
  println(aFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + "/" + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("Hello", 4))


  def bigFunction(n: Int): Int = {
    def smallFunction(a: Int, b: Int): Int = a + b

    smallFunction(n, n-1)
  }

  println(bigFunction(4))



  def greetingFunction(name: String, age: Int) = {
    "Hi, name is " + name + " and I am " + age + " years old."
  }
  println(greetingFunction("Thanapong", 25))

  def factorialFunc(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialFunc(n - 1)
  }
  println(factorialFunc(3))

  def fiboFunc(n: Int): Int = {
    if (n <= 2) 1
    else fiboFunc(n - 1) + fiboFunc(n - 2)
  }
  println(fiboFunc(7))

  def isPrime(n: Int): Boolean = {
    val endNum = Math.sqrt(n).toInt

    def helper(d: Int): Boolean = {
      if (d > endNum) true
      else if (n % d == 0) false
      else helper(d+1)
    }

    helper(2)
  }

  def isPrime2(n: Int): Boolean = {
    def isPrimeUtil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUtil(t - 1)

    isPrimeUtil(n/2)
  }
  println("isPrime(2) : " + isPrime(2))
  println("isPrime(3) : " + isPrime(3))
  println("isPrime(4) : " + isPrime(4))
  println("isPrime(5) : " + isPrime(5))
  println("isPrime(6) : " + isPrime(6))
  println("isPrime(10) : " + isPrime(10))
  println("isPrime(17) : " + isPrime(17))
  println("isPrime(37) : " + isPrime(37))
  println("isPrime(2003) : " + isPrime(2003))
}
