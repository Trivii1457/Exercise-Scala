package taller

class Hanoi {

    def movsTorresHanoi (n: Int): BigInt = {
        if (n == 0) 0
        else if (n == 1) 1
        else 2 * movsTorresHanoi(n - 1) + 1
    }

   /* def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
       if (n==1) {
        list((t1,t3))
       }

    }*/
  
}
