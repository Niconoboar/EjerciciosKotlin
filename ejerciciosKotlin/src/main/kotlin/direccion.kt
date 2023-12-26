class Direccion {
    init {
        // primero pedimos la dirección de la persona, calle, ciudad, país
        print("Ingrese su dirección: ")
        val direccion = readLine()

        print("Ingrese el país: ")
        val pais = readLine()

        print("Ingrese la ciudad: ")
        val ciudad = readLine()

        // ahora concatenamos y luego imprimimos la dirección completa en la consola
        val direccionCompleta = "$direccion, $pais, $ciudad"

        println("Su dirección es: $direccionCompleta")
    }
}

fun main() {
    // Creamos una instancia de la clase Direccion para ejecutar la lógica en el bloque init
    Direccion()
}
