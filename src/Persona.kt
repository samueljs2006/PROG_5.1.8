open class Persona(var nombre: String, var edad: Int) {

    fun cumple() {
        edad++
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }

    private var edadPrivada = edad

    fun mostrarEdad(): Int {
        return edadPrivada
    }

    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }
}