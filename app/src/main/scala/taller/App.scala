package taller

object App {
  def main(args: Array[String]): Unit = {
    // Crear instancias de las clases que contienen las funciones
    val buscarLista = new BuscarLista()
    val hanoi = new Hanoi()
    val listTail = new ListTail()

    // Datos pequeños para probar
    val lista = List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
    
    // Llamada a la función maxLin
    val maxLineal = listTail.maxLin(lista)
    println(s"Máximo calculado con recursión lineal: $maxLineal")
    
    // Llamada a la función maxIt
    val maxIterativo = listTail.maxIt(lista)
    println(s"Máximo calculado con recursión de cola: $maxIterativo")
    
    // Verificación de la función buscarElemento con datos pequeños
    val elementoABuscar1 = 5
    val existeElemento1 = buscarLista.buscarElemento(lista, elementoABuscar1)
    println(s"¿El elemento $elementoABuscar1 está en la lista? $existeElemento1")
    
    val elementoABuscar2 = 10
    val existeElemento2 = buscarLista.buscarElemento(lista, elementoABuscar2)
    println(s"¿El elemento $elementoABuscar2 está en la lista? $existeElemento2")

    val elementoABuscar3 = 3
    val existeElemento3 = buscarLista.buscarElemento(lista, elementoABuscar3)
    println(s"¿El elemento $elementoABuscar3 está en la lista? $existeElemento3")

    // Ejemplos de uso de torres de Hanoi
    val movimientos3Discos = hanoi.torresHanoi(3, 1, 2, 3)
    println("Movimientos para resolver las Torres de Hanoi con 3 discos:")
    movimientos3Discos.foreach { case (from, to) => println(s"Mover disco de torre $from a torre $to") }
    
    val movimientos4Discos = hanoi.torresHanoi(4, 1, 2, 3)
    println("Movimientos para resolver las Torres de Hanoi con 4 discos:")
    movimientos4Discos.foreach { case (from, to) => println(s"Mover disco de torre $from a torre $to") }
    
    val movimientos2Discos = hanoi.torresHanoi(2, 1, 2, 3)
    println("Movimientos para resolver las Torres de Hanoi con 2 discos:")
    movimientos2Discos.foreach { case (from, to) => println(s"Mover disco de torre $from a torre $to") }
  }
}
