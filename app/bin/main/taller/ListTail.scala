package taller

import scala.annotation.tailrec

class ListTail {

  def maxLin(l: List[Int]): Int = {

    @tailrec
    def maxLinAux(l: List[Int], max: Int): Int = {
      if (l.isEmpty) max
      else maxLinAux(l.tail, if (l.head > max) l.head else max)
    }

    maxLinAux(l, l.head)
  }

  def maxIt(l: List[Int]): Int = {

    @tailrec
    def maxItAux(l: List[Int], max: Int): Int = {
      if (l.isEmpty) max
      else maxItAux(l.tail, if (l.head > max) l.head else max)
    }

    maxItAux(l, l.head)
  }

}