import kotlin.math.round

class Viaje {

    // Función principal que inicia la ejecución del programa
    fun main() {
        // Solicitar la distancia del trayecto al usuario
        val distanciaKilometros = solicitarDistanciaKilometros()

        // Solicitar si se aplica descuento a personas de la tercera edad
        val aplicaDescuento = solicitarDescuento()

        // Calcular el total a cobrar con o sin descuento
        val totalCobrar = if (aplicaDescuento) {
            calcularTotalConDescuento(distanciaKilometros)
        } else {
            calcularTotalSinDescuento(distanciaKilometros)
        }

        // Imprimir el total redondeado en números enteros
        imprimirTotalCobrar(totalCobrar)
    }

    // Función para solicitar la distancia del trayecto al usuario
    fun solicitarDistanciaKilometros(): Double {
        print("Ingrese los kilómetros del trayecto: ")
        return readLine()?.toDoubleOrNull() ?: 0.0
    }

    // Función para solicitar si se aplica descuento a personas de la tercera edad
    fun solicitarDescuento(): Boolean {
        print("¿Aplica el descuento a personas de la tercera edad?: (si=1 /no=2 ")
        return readLine()?.toLowerCase() == "si" || readLine() == "1"
    }


    // Función para calcular el total a cobrar con descuento
    fun calcularTotalConDescuento(distancia: Double): Double {
        val tarifaPorKilometro = 2.25
        val descuentoPorcentaje = 0.45
        val totalSinDescuento = distancia * tarifaPorKilometro
        val descuento = totalSinDescuento * descuentoPorcentaje
        return totalSinDescuento - descuento
    }

    // Función para calcular el total a cobrar sin descuento
    fun calcularTotalSinDescuento(distancia: Double): Double {
        val tarifaPorKilometro = 2.25
        return distancia * tarifaPorKilometro
    }

    // Función para imprimir el total a cobrar redondeado en números enteros
    fun imprimirTotalCobrar(totalCobrar: Double) {
        println("Total a cobrar: \$${round(totalCobrar)}")
    }
}

// Función principal que crea una instancia de la clase Viaje y llama a su función main
fun main() {
    Viaje().main()
}
