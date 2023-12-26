class Impuestos {
    companion object {
        @JvmStatic
        /*En Kotlin, un companion object es un objeto que se asocia a la instancia de una clase en lugar de a una instancia específica de esa clase. Puedes pensar en él como un objeto que pertenece a la clase en lugar de a una instancia particular de esa clase.*/
        fun main(args: Array<String>) {
            // Solicitar el salario
            print("Ingrese su salario mensual bruto: ")
            val salarioBruto = readLine()?.toDoubleOrNull() ?: 0.0

            // Solicitar el porcentaje de impuestos
            print("Ingrese el porcentaje de impuestos por mes: ")
            val porcentajeImpuestos = readLine()?.toDoubleOrNull() ?: 0.0

            // Calcular el salario neto y el monto de impuestos mensual
            val impuestoMensual = salarioBruto * (porcentajeImpuestos / 100)
            val salarioNetoMensual = salarioBruto - impuestoMensual

            // Calcular el salario neto y el monto de impuestos anual
            val salarioNetoAnual = salarioNetoMensual * 12
            val impuestoAnual = impuestoMensual * 12

            // Imprimir en consola con 2 decimales
            println("El salario neto mensual es: \$${"%.2f".format(salarioNetoMensual)}")
            println("Impuestos mensuales: \$${"%.2f".format(impuestoMensual)}")
            println("Salario neto anual: \$${"%.2f".format(salarioNetoAnual)}")
            println("Impuestos anuales: \$${"%.2f".format(impuestoAnual)}")
        }
    }
}
