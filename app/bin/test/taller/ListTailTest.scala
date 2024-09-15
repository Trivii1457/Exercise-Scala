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

  test("maxLin debería retornar el elemento máximo para una lista grande con el mayor al final") {
    val listTail = new ListTail
    val largeList = (1 to 999999).toList ++ List(1000000)
    assert(listTail.maxLin(largeList) == 1000000)
  }

  test("maxLin debería retornar el elemento máximo para una lista con elementos negativos") {
    val listTail = new ListTail
    assert(listTail.maxLin(List(-10, -20, -30, -5, -15)) == -5)
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

  test("maxIt debería retornar el elemento máximo para una lista grande con el mayor al final") {
    val listTail = new ListTail
    val largeList = (1 to 999999).toList ++ List(1000000)
    assert(listTail.maxIt(largeList) == 1000000)
  }

  test("maxIt debería retornar el elemento máximo para una lista con elementos negativos") {
    val listTail = new ListTail
    assert(listTail.maxIt(List(-10, -20, -30, -5, -15)) == -5)
  }

}