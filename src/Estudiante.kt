class Estudiante(nombre: String, edad: Int, var carrera: String) : Persona(nombre, edad) {

    override fun toString(): String {
        return "${super.toString()}, carrera = $carrera"
    }

    override fun actividad() {
        println("$nombre está estudiando para su carrera en $carrera.")
    }

}