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
  
}
