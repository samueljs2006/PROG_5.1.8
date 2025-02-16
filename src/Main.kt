fun main() {
    fun crearPersona(nombre: String, edad: Int): Persona {
        if (nombre.isBlank()) {
            throw IllegalArgumentException("El nombre no puede estar vacío.")
        }
        if (edad < 0) {
            throw IllegalArgumentException("La edad no puede ser negativa.")
        }
        return Persona(nombre, edad)
    }
    try {
        val persona1 = Persona("Lucía", 21)
        persona1.cumple()  // Incrementamos la edad
        println(persona1)  // Usamos el método toString() de la clase Persona

        println("Acceso directo a las propiedades:")
        println("Nombre: ${persona1.nombre}, Edad: ${persona1.edad}")

        println("Edad desde el método mostrarEdad(): ${persona1.mostrarEdad()}")

        val estudiante1 = Estudiante("Carlos", 22, "Ingeniería")
        estudiante1.cumple()
        println(estudiante1)  // Usamos el toString() sobrescrito de Estudiante

        persona1.actividad()
        estudiante1.actividad()

        val persona2 = crearPersona("Ana", -5)  // Esto lanzará una excepción

    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}