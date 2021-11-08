package playground

import java.io.Writer

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 4)

  // method
  def greet(name: String): Unit = println(s"Hi ${this.name} -> $name")

  //  overloading
  def greet(): Unit = println(s"Hi , I am $name")


  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John")
}

/*
  Novel and writer

  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
 */

class Writer(firstName: String, surName: String, val year: Int) {
  def fullName(): String = s"$firstName $surName"
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge(): Int = year - author.year
  def isWrittenBy(writer: Writer): Boolean = writer == author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {
  def inc = {
    println("Incrementing")
    new Counter(count + 1)
  }
  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }

//  def inc(n: Int) = new Counter(count + n)
  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }
//  def dec(n: Int) = new Counter(count - n)
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print: Unit = println(count)
}

object LearnOOP extends App {
  val person = new Person("Boy", 25)
  println(person.age)
  person.greet("Thanapong")
  person.greet()
  val p2 = new Person()
  println(p2.greet())


  val author = new Writer("Thanapong", "Somjai", 1996)
  val imposter = new Writer("Prayuth", "Chan-O-Chi", 1920)
  val novel = new Novel("Scala Basic", 2021, author)
  println(novel.authorAge())
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc(10).print
}

