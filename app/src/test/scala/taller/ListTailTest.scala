package taller
import org.scalatest.funsuite.AnyFunSuite

class ListTailTest extends AnyFunSuite {

  test("maxLin should return the maximum element in the list") {
    val listTail = new ListTail
    assert(listTail.maxLin(List(1, 2, 3, 4, 5)) == 5)
    assert(listTail.maxLin(List(5, 4, 3, 2, 1)) == 5)
    assert(listTail.maxLin(List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)) == 9)
  }

  test("maxIt should return the maximum element in the list") {
    val listTail = new ListTail
    assert(listTail.maxIt(List(1, 2, 3, 4, 5)) == 5)
    assert(listTail.maxIt(List(5, 4, 3, 2, 1)) == 5)
    assert(listTail.maxIt(List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)) == 9)
  }

}