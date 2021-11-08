package playground

object MethodNotation1 extends App {
  class Person(val name: String, favMovie: String) {
    def likes(movie: String): Boolean = movie == favMovie

    def +(person: Person): String = s"$name goes with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = "Hello, apply"
  }

  val mary = new Person("Mary", "ABC")
  println(mary.likes("ABC"))
  println(mary likes "ABC")

  val tom = new Person("Tom", "DEF")
  println(mary + tom) // Mary goes with Tom
  println(mary.+(tom)) // Mary goes with Tom

  println(!mary) // Mary, what the heck?!
  println(mary.unary_!) // Mary, what the heck?!

  println(mary.apply()) // Hello, apply
  println(mary()) // Hello, apply
}
