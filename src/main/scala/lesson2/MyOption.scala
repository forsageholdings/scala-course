package lesson2

sealed trait Option[A] {

  def getOrElse(default: A): A = ???
}

case class Some[A](value: A) extends Option[A]

case class None[A]() extends Option[A]
