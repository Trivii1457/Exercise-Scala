package taller

import scala.annotation.tailrec

class ListTail {

  //funcion que retorna el maximo de una lista
  //ingresa una lista de enteros y retorna el maximo de la lista
  def maxLin(l: List[Int]): Int = {

    //funcion auxiliar que retorna el maximo de una lista
    @tailrec
    def maxLinAux(l: List[Int], max: Int): Int = {
      if (l.isEmpty) max//si la lista esta vacia retorna el maximo
      //si no esta vacia se llama a si misma con la cola de la lista
      // y el maximo entre el primer elemento de la lista y el maximo
      else maxLinAux(l.tail, if (l.head > max) l.head else max)
    }
    //llamado a la funcion auxiliar
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