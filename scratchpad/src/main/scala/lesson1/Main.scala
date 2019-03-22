package lesson1

import scala.io.StdIn

object Main {

  def main(args: Array[String]): Unit = {

    val yourName = StdIn.readLine()

    println(s"Hello, $yourName!")

  }
}
