package lesson2

sealed trait MyList[+A] {
  /**
    * Returns a new list that's the reverse of the source.
    */
  def reverse: MyList[A] = {

    def loop(self: MyList[A], acc: MyList[A]): MyList[A] =
      self match {
        case Pair(head, tail) =>
          loop(tail, Pair(head, acc))
        case Empty =>
          acc
      }

    loop(this, Empty)
  }


  /**
    * Returns a new list the elements of the source transformed by
    * the given function.
    *
    * {{{
    *   MyList(1, 2, 3).map(_ * 2)
    *   //=> MyList(2, 4, 6)
    * }}}
    */
  def map[B](f: A => B): MyList[B] = ???

  /**
    * Builds a new list by applying the given function to the source and then
    * concatenating the resulting lists.
    *
    * {{{
    *   MyList(1, 2, 3).flatMap(x => MyList(x, x, x))
    *   //=> MyList(1, 1, 1, 2, 2, 2, 3, 3, 3)
    * }}}
    */
  def flatMap[B](f: A => MyList[B]): MyList[B] = ???

  /**
    * Builds a new list with the elements of the source filtered by the
    * given predicate.
    *
    * {{{
    *   MyList(1, 2, 3, 4).filter(_ % 2 == 0)
    *   //=> MyList(2, 4)
    * }}}
    */
  def filter(p: A => Boolean): MyList[A] = ???

  /**
    * Applies a binary operator to a start value, the `seed`, and all elements of
    * this list, going from left to right.
    *
    * Example of how to calculate the sum of all elements:
    * {{{
    *   MyList(1, 2, 3, 4).foldLeft(0)((state, elem) => state + elem)
    * }}}
    */
  def foldLeft[S](seed: S)(f: (S, A) => S): S = ???
}

final case class Pair[+A](head: A, tail: MyList[A]) extends MyList[A]

case object Empty extends MyList[Nothing]
