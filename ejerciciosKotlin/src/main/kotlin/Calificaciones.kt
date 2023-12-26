class Calificaciones {

    fun main() {
        // Declarar listas para almacenar los nombres y calificaciones de los alumnos
        val nombresAlumnos = mutableListOf<String>()
        val calificaciones = mutableListOf<Double>()

        // Solicitar información de cada alumno y calificación
        repeat(6) {
            print("Ingrese el nombre del alumno ${it + 1}: ")
            val nombreAlumno = readLine() ?: ""
            nombresAlumnos.add(nombreAlumno)

            print("Ingrese la calificación de $nombreAlumno: ")
            val calificacion = readLine()?.toDoubleOrNull() ?: 0.0
            calificaciones.add(calificacion)
        }

        // Imprimir la lista de alumnos y calificaciones
        println("Lista de Alumnos\tCalificaciones")
        for (i in nombresAlumnos.indices) {
            println("${nombresAlumnos[i]}\t\t\t${calificaciones[i]}")
        }

        // Calcular e imprimir el promedio, calificación más alta, calificación más baja y alumnos reprobados
        val promedioCalificaciones = calcularPromedio(calificaciones)
        val calificacionMaxima = obtenerCalificacionMaxima(calificaciones)
        val calificacionMinima = obtenerCalificacionMinima(calificaciones)
        val alumnosReprobados = obtenerAlumnosReprobados(nombresAlumnos, calificaciones)

        println("\nPromedio de calificaciones: ${"%.2f".format(promedioCalificaciones)}")
        println("Calificación más alta: $calificacionMaxima")
        println("Calificación más baja: $calificacionMinima")
        println("Alumnos reprobados:")
        for ((nombreAlumno, calificacion) in alumnosReprobados) {
            println("$nombreAlumno\t\t\t$calificacion")
        }
    }

    fun calcularPromedio(calificaciones: List<Double>): Double {
        var suma = 0.0
        for (calificacion in calificaciones) {
            suma += calificacion
        }
        return suma / calificaciones.size
    }

    fun obtenerCalificacionMaxima(calificaciones: List<Double>): Double {
        return calificaciones.maxOrNull() ?: 0.0
    }

    fun obtenerCalificacionMinima(calificaciones: List<Double>): Double {
        return calificaciones.minOrNull() ?: 0.0
    }

    fun obtenerAlumnosReprobados(nombresAlumnos: List<String>, calificaciones: List<Double>):
            List<Pair<String, Double>> {
        val alumnosReprobados = mutableListOf<Pair<String, Double>>()
        for (i in calificaciones.indices) {
            if (calificaciones[i] < 60.0) {
                alumnosReprobados.add(nombresAlumnos[i] to calificaciones[i])
            }
        }
        return alumnosReprobados
    }
}

fun main() {
    Calificaciones().main()
}
