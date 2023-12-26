import kotlin.math.PI

class Circunferencia {

    fun main() {
        // Solicitar al usuario el radio del círculo en centímetros
        print("Ingrese el radio del círculo en centímetros: ")
        val radioCm = readLine()?.toDoubleOrNull() ?: 0.0
        // Calcular el área y la circunferencia del círculo
        val areaCm2 = calcularArea(radioCm)
        val circunferenciaCm = calcularCircunferencia(radioCm)
        // Convertir los resultados a pulgadas
        val areaIn2 = centimetrosAPulgadas(areaCm2)
        val circunferenciaIn = centimetrosAPulgadas(circunferenciaCm)
        // Imprimir los resultados en consola
        println("Área del círculo: ${"%.2f".format(areaCm2)} cm² (${"%.2f".format(areaIn2)} in²)")
        println("Circunferencia del círculo: ${"%.2f".format(circunferenciaCm)} cm (${"%.2f".format(circunferenciaIn)} in)")
    }

    fun calcularArea(radio: Double): Double {
        return PI * radio * radio
    }

    fun calcularCircunferencia(radio: Double): Double {
        return 2 * PI * radio
    }

    fun centimetrosAPulgadas(centimetros: Double): Double {
        // 1 cm = 0.393701 pulgadas
        return centimetros * 0.393701
    }
}

fun main() {
    // Crear una instancia de la clase Circunferencia y llamar a su función main
    Circunferencia().main()
}
