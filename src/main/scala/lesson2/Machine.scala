package lesson2

sealed trait Input
case object Coin extends Input
case object Turn extends Input

case class Machine(locked: Boolean, candies: Int, coins: Int)

object Machine {

  def simulate(inputs: List[Input]): (Int, Machine) = ???

}
