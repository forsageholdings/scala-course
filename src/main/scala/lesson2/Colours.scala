package lesson2

sealed trait Colour

object Red extends Colour
object Blue extends Colour

case class Other(name: String) extends Colour

object Colour {

  val x: Colour = Red

  x match {
    case Red => println("Got red!")
    case Blue => println("Got blue!")
    case Other(name) => println(s"Got: $name")
  }
}
