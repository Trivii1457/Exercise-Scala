package taller
import org.scalatest.funsuite.AnyFunSuite

class ListTailTest extends AnyFunSuite {

  // Pruebas para maxLin
  test("maxLin debería retornar el elemento máximo cuando el primer elemento es el mayor") {
    val listTail = new ListTail
    assert(listTail.maxLin(List(5, 4, 3, 2, 1)) == 5)
  }

  test("maxLin debería retornar el elemento máximo cuando el mayor está en la cola") {
    val listTail = new ListTail
    assert(listTail.maxLin(List(1, 2, 3, 4, 5)) == 5)
  }

  test("maxLin debería lanzar una excepción para una lista vacía") {
    val listTail = new ListTail
    assertThrows[NoSuchElementException] {
      listTail.maxLin(List())
    }
  }

  // Pruebas para maxIt
  test("maxIt debería retornar el elemento máximo cuando el primer elemento es el mayor") {
    val listTail = new ListTail
    assert(listTail.maxIt(List(5, 4, 3, 2, 1)) == 5)
  }

  test("maxIt debería retornar el elemento máximo cuando el mayor está en la cola") {
    val listTail = new ListTail
    assert(listTail.maxIt(List(1, 2, 3, 4, 5)) == 5)
  }

  test("maxIt debería lanzar una excepción para una lista vacía") {
    val listTail = new ListTail
    assertThrows[NoSuchElementException] {
      listTail.maxIt(List())
    }
  }

}