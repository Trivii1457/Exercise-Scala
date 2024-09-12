package taller
import org.scalatest.funsuite.AnyFunSuite

class ListTailTest extends AnyFunSuite {

  test("maxLin debería retornar el elemento máximo en la lista") {
    val listTail = new ListTail
    assert(listTail.maxLin(List(1, 2, 3, 4, 5)) == 5)
    assert(listTail.maxLin(List(5, 4, 3, 2, 1)) == 5)
    assert(listTail.maxLin(List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)) == 9)
  }

  test("maxLin debería lanzar una excepción para una lista vacía") {
    val listTail = new ListTail
    assertThrows[NoSuchElementException] {
      listTail.maxLin(List())
    }
  }

  


}