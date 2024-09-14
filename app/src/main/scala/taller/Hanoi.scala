package taller

class Hanoi {

    def movsTorresHanoi (n: Int): BigInt = {
        if (n == 0) 0
        else if (n == 1) 1
        else 2 * movsTorresHanoi(n - 1) + 1
    }

   def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
        // Pasar n discos de la torre t1 a la torre t3 usando t2 como intermediaria
        // Devuelve la lista de movimientos de parejas (a, b) indicando mover un disco de la torre a hacia la torre b
        if (n == 0) {
            List()
        } else {
            // Mueve n-1 discos de t1 a t2 usando t3 como auxiliar
            torresHanoi(n - 1, t1, t3, t2) :::
            // Mueve el disco n de t1 a t3
            List((t1, t3)) :::
            // Mueve n-1 discos de t2 a t3 usando t1 como auxiliar
            torresHanoi(n - 1, t2, t1, t3)
        }
    }
  
}
