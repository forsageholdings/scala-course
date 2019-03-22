package lesson1

object Problems {
  /**
    * Calculates factorial of `n`.
    *
    * Afterwards make it pure.
    */
  def factorial(n: Int): BigInt = ???

  /**
    * Calculates the n-th number in the fibonacci series.
    *
    * Afterwards make it pure, make it efficient.
    */
  def fibonacci(n: Int): BigInt = ???

  /**
    * Determines if the given number is a prime number.
    */
  def isPrime(n: Int): Boolean = ???

  /**
    * Returns `true` if the given string is a word (a string
    * made of only characters from `a` to `z`), or `false`
    * otherwise.
    *
    * Describe this function in terms of:
    *
    *   - `length`
    *   - `apply(index)`
    *
    * Make it pure afterwards.
    */
  def isWord(str: String): Boolean = ???

  /**
    * Checks if the given array is sorted, via the given comparison function.
    */
  def isSorted(as: Array[Int], ordered: (Int, Int) => Boolean): Boolean = ???

  /**
    * Returns `true` if all elements of the given collection
    * satisfy the given predicate, or `false` otherwise.
    *
    * Afterwards:
    *
    *   - make it pure
    *   - make it generic
    */
  def forall(cc: Iterable[String], p: String => Boolean): Boolean = ???

  /**
    * Returns `true` if at least one element of the given collection
    * satisfies the given predicate, or `false` otherwise.
    *
    * Afterwards:
    *
    *   - make it pure
    *   - make it generic
    */
  def exists(cc: Iterable[String], p: String => Boolean): Boolean = ???

  /**
    * Returns the length of a list.
    *
    * Describe this function in terms of:
    *
    *   - `head`
    *   - `tail`
    *   - `isEmpty`
    *
    * Make it pure afterwards.
    */
  def length(list: List[String]): Int = ???

  /**
    * Searches for the given `elem` in the given `array`.
    *
    * Returns the index of the first found location for `elem`
    * or -1 if the element isn't found.
    */
  def findIndex(array: Array[String], elem: String): Int = ???

  /**
    * Searches for the first element that satisfies the given predicate (`p`).
    *
    * Returns the index of the first found location
    * or -1 if no element was found.
    */
  def findFirstBy(array: Array[String], p: String => Boolean): Int = ???

  /**
    * Sums up the numbers from the given list.
    *
    * Make it pure and generic.
    */
  def sum(numbers: List[Int]): Int = ???

  /**
    * Applies the given function to a start value and all elements
    * of the given sequence, from start, to finish.
    */
  def foldLeft(sequence: List[Int], seed: Long, f: (Long, Int) => Int): Long = ???

  /**
    * Returns a new list with the elements of the source reversed.
    */
  def reverse(list: List[Int]): List[Int] = ???

  /**
    * Given a list, extracts only the even numbers.
    */
  def evens(numbers: List[Int]): List[Int] = ???

  /**
    * Given a list, extracts only the odd numbers.
    */
  def odds(numbers: List[Int]): List[Int] = ???

  /**
    * Given a sequence, extracts only the elements that satisfy the
    * given predicate.
    *
    * {{{
    *   filter(List(1, 2, 3, 4), x => x % 2 == 0))
    *   //=> List(2, 4)
    * }}}
    */
  def filter(sequence: List[Int], p: Int => Boolean): List[Int] = ???

  /**
    * Given a sequence, returns another sequence with all elements
    * of the source multiplied by `n`.
    *
    * {{{
    *   multiplyElementsBy( List(1, 2, 3), 2 )
    *   //=> List(2, 4, 6)
    * }}}
    */
  def multiplyElementsBy(sequence: List[Int], n: Int): List[Int] = ???

  /**
    * Transforms all elements of the given list by the given function.
    */
  def map(sequence: List[Int], f: Int => Int): List[Int] = ???

  // --------------------------
  // Parametric reasoning

  def id[A](a: A): A = ???

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = ???

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = ???

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = ???

  def compose[A,B,C](f: B => C, g: A => B): A => C = ???
}
