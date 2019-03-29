package lesson2

class Animal(position: (Int, Int)) {
  def move(x: Int, y: Int): Unit = {
    println(s"Walks to coordinates ($x, $y)")
  }
}

case class Cat(
  name: String,
  colour: String,
  breed: String)
  extends Animal((0, 0)) {

}

object Cat {

  val x = Cat("Rex", "Red", "Persana")

  x match {
    case Cat(name, _, _) =>
      println(s"name: $name")
  }

}
