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









}
