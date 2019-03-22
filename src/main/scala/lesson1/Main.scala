package lesson1

import scala.io.StdIn

object Main {

  def main(args: Array[String]): Unit = {

    print("\nYour name: ")
    val yourName = StdIn.readLine()

    println(s"\nHello, $yourName!\n")

  }
}
