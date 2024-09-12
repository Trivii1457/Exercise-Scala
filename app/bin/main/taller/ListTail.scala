package taller

import scala.annotation.tailrec

class ListTail {

  //funcion que retorna el maximo de una lista
  //ingresa una lista de enteros y retorna el maximo de la lista
  def maxLin(l: List[Int]): Int = {
    //si la lista esta vacia lanza una excepcion
    if (l.isEmpty) throw new NoSuchElementException("Lista vacía")
    else if (l.tail.isEmpty) l.head//si la lista tiene un solo elemento retorna ese elemento
    else {
      //si la lista tiene mas de un elemento
      val maxTail = maxLin(l.tail)
      //retorna el maximo entre la cabeza de la lista y el maximo de la cola
      if (l.head > maxTail) l.head else maxTail
    }
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