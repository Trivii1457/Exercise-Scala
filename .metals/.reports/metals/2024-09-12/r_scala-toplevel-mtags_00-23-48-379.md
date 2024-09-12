error id: file:///C:/Users/trivi/Desktop/Programacion/Scala-Taller1/Exercise-Scala/app/src/main/scala/taller/ListTail.scala:[548..549) in Input.VirtualFile("file:///C:/Users/trivi/Desktop/Programacion/Scala-Taller1/Exercise-Scala/app/src/main/scala/taller/ListTail.scala", "package taller

import scala.annotation.tailrec

class ListTail {

  @tailrec
  def maxLin(l: List[Int]): Int = {

    @tailrec
    def maxLinAux(l: List[Int], max: Int): Int = {
      if (l.isEmpty) max
      else maxLinAux(l.tail, if (l.head > max) l.head else max)
    }

    maxLinAux(l, l.head)
  }

  @tailrec
  def maxIt(l: List[Int]): Int = {

    @tailrec
    def maxItAux(l: List[Int], max: Int): Int = {
      if (l.isEmpty) max
      else maxItAux(l.tail, if (l.head > max) l.head else max)
    }

    maxItAux(l, l.head)
  }

    def 
}")
file:///C:/Users/trivi/Desktop/Programacion/Scala-Taller1/Exercise-Scala/app/src/main/scala/taller/ListTail.scala
file:///C:/Users/trivi/Desktop/Programacion/Scala-Taller1/Exercise-Scala/app/src/main/scala/taller/ListTail.scala:32: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace