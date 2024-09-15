package taller

import org.scalatest.funsuite.AnyFunSuite

class HanoiTest extends AnyFunSuite {

    // Pruebas para movsTorresHanoi
    test("movsTorresHanoi debería retornar 0 para n = 0") {
        val hanoi = new Hanoi
        assert(hanoi.movsTorresHanoi(0) == 0)
    }

    test("movsTorresHanoi debería retornar 1 para n = 1") {
        val hanoi = new Hanoi
        assert(hanoi.movsTorresHanoi(1) == 1)
    }


    test("movsTorresHanoi debería retornar 3 para n = 2") {
        val hanoi = new Hanoi
        assert(hanoi.movsTorresHanoi(2) == 3)
    }

    test("movsTorresHanoi debería retornar 7 para n = 3") {
        val hanoi = new Hanoi
        assert(hanoi.movsTorresHanoi(3) == 7)
    }

    test("movsTorresHanoi debería retornar 15 para n = 4") {
        val hanoi = new Hanoi
        assert(hanoi.movsTorresHanoi(4) == 15)
    }

    test("movsTorresHanoi debería retornar 1023 para n = 10") {
    val hanoi = new Hanoi()
    assert(hanoi.movsTorresHanoi(10) == 1023)
  }

    // Pruebas para torresHanoi
    test("torresHanoi debería retornar la secuencia correcta de movimientos para 1 disco") {
    val hanoi = new Hanoi()
    val moves = hanoi.torresHanoi(1, 1, 2, 3)
    assert(moves == List((1, 3)))
  }

  test("torresHanoi debería retornar la secuencia correcta de movimientos para 2 discos") {
    val hanoi = new Hanoi()
    val moves = hanoi.torresHanoi(2, 1, 2, 3)
    assert(moves == List((1, 2), (1, 3), (2, 3)))
  }

  test("torresHanoi debería retornar la secuencia correcta de movimientos para 3 discos") {
    val hanoi = new Hanoi()
    val moves = hanoi.torresHanoi(3, 1, 2, 3)
    assert(moves == List((1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)))
  }

  test("torresHanoi debería retornar la secuencia correcta de movimientos para 4 discos") {
    val hanoi = new Hanoi()
    val moves = hanoi.torresHanoi(4, 1, 2, 3)
    assert(moves == List(
      (1, 2), (1, 3), (2, 3), (1, 2), (3, 1), (3, 2), (1, 2),
      (1, 3), (2, 3), (2, 1), (3, 1), (2, 3), (1, 2), (1, 3), (2, 3)
    ))
  }

  test("torresHanoi debería retornar la secuencia correcta de movimientos para 5 discos") {
    val hanoi = new Hanoi()
    val moves = hanoi.torresHanoi(5, 1, 2, 3)
    assert(moves == List(
      (1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3),
      (1, 2), (3, 2), (3, 1), (2, 1), (3, 2), (1, 3), (1, 2), (3, 2),
      (1, 3), (2, 1), (2, 3), (1, 3), (2, 1), (3, 2), (3, 1), (2, 1),
      (2, 3), (1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)
    ))
  }

  test("torresHanoi debería retornar la secuencia correcta de movimientos para 6 discos") {
    val hanoi = new Hanoi()
    val moves = hanoi.torresHanoi(6, 1, 2, 3)
    assert(moves == List(
      (1, 2), (1, 3), (2, 3), (1, 2), (3, 1), (3, 2), (1, 2),
      (1, 3), (2, 3), (2, 1), (3, 1), (2, 3), (1, 2), (1, 3), (2, 3),
      (1, 2), (3, 1), (3, 2), (1, 2), (3, 1), (2, 3), (2, 1), (3, 1),
      (1, 3), (2, 3), (2, 1), (3, 1), (2, 3), (1, 2), (1, 3), (2, 3),
      (1, 2), (3, 1), (3, 2), (1, 2), (1, 3), (2, 3), (2, 1), (3, 1),
      (2, 3), (1, 2), (1, 3), (2, 3), (2, 1), (3, 1), (3, 2), (1, 2),
      (1, 3), (2, 3), (1, 2), (3, 1), (3, 2), (1, 2), (3, 1), (2, 3),
      (2, 1), (3, 1), (2, 3), (1, 2), (1, 3), (2, 3)
    ))
  }
  
}
