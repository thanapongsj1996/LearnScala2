package playground

object CallByNameAndCallByValue extends App {
  def calledByValue(x: Long): Unit = {
    println("by value : " + x)
    println("by value : " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name : " + x)
    println("by name : " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /*
    by value : 12738591559799
    by value : 12738591559799
    by name : 12738636417787
    by name : 12738636446888
   */

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  error here
//  printFirst(infinite(), 34)

//  no error here
  printFirst(34, infinite())
}
